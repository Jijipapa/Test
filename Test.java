import java.util.*;

public class Test {
    public static void aMethod() throws Exception {
        try {
            System.out.print("A ");
            throw new Exception();
        } finally {
            System.out.print("F ");
        }
    }

    public static int[] differingElements(int[] arr1, int[] arr2) {
        int max;
        if (arr1.length < arr2.length) {
            max = arr2.length;
        } else {
            max = arr1.length;
        }
        int[] result = new int[max];
        int position = 0;
        for (int i = 0; i < arr2.length; i++) {
            boolean different = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    different = false;
                    break;
                }
            }
            if (different) {
                result[position] = arr1[i];
                position++;
            }
        }
        return result;
    }

    static void a() {
        int i = 5;
        List<Integer> list = new ArrayList<>(80);
        add(i, list);
        System.out.println(list.size() * 2 + i);
    }

    static void add(int x, List<Integer> list) {
        list.add(++x);
    }

    public static void main(String args[]) {
        try {
            System.out.print("1 ");
            aMethod();
            System.out.print("2 ");
        } catch (Exception e) {
            System.out.print("E ");
        }
        System.out.print("P ");
        float s[] = {1.0f, 2.0f, 2.0f};
        System.out.println();
        int i = 1, j = 10;
        do {
            if (i > j) break;
            j--;
        } while (++i < 5);
        System.out.println("i = " + i + " and j = " + j);
        boolean t = true;
        boolean f = false;
        List listA = null;
        List listB = new ArrayList();
        System.out.println("abc".equals("abc") + ", " +
                new String("abc").equals(new String("abc")) + ", " +
                new Integer(1000).equals(new Integer(1000)) + ", ");
        a();
        A b = new B();
        System.out.print(b.val);
        System.out.print(b.value());

        int[] arr1 = {0, 1, 2};
        int[] arr2 = {2, 3};

        int[] result = differingElements(arr1, arr2);
        System.out.println();
        System.out.println(result[0] + ", " + result[1]);
    }
}

