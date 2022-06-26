public class HomeworkTwo {
    public static void main(String[] args) {
        int[] a1 = new int[5];
        int[] a2 = new int[1000];
        int[] a3 = new int[20];
        int[] a4 = new int[50];
        double[] a5 = new double[500];
        int[] a6 = new int[50];
        //1
        System.out.println(":1:");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = 2;
        }
        //2
        System.out.println(":2:");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = i + 1;
        }
        //3
        System.out.println(":3:");
        for (int i = -19, j = 0; j < a3.length; i += 2, j++) {
            a3[j] = i;
        }
        //4
        System.out.println(":4:");
        for (int i = 0; i < a4.length; i++) {
            a4[i] = i + 1;
        }
        for (int i = 0; i < a4.length; i++) {
            System.out.print(a4[i] % 5 == 0 ? a4[i] + " " : "");
        }
        System.out.println();
        //5
        System.out.println(":5:");
        double j = 1.0;

        for (int i = 0; i < a5.length; i++) {
            j += 1;
            a5[i] = j;
        }
        for (int i = 0; i < a5.length; i++) {
            System.out.print(a5[i] > 24.12 && a5[i] < 467.23 ? a5[i] + "," : "");
        }
        System.out.println();
        //6?????
        /*
        for (int i = 0; i < a6.length; i++) {
            a6[i] = i;
        }
        int countDivBy2 = 0;
        for (int i = 0; i < a6.length; i++) {
            if (a6[i] % 2 == 0) {
                countDivBy2++;
            }
        }
        System.out.println(countDivBy2);
        System.out.println();s
        */

        // 7 //
        System.out.println(":7:");
        int n = 20; // 0 < n < 21
        int[] multiples = new int[10];
        for (int i = 0; i < multiples.length; i++) {
            multiples[i] = i + 1;
        }
        for (int i = 0; i < multiples.length; i++) {
            System.out.println(n + " x " + multiples[i] + " = " + (n * multiples[i]));
        }
        System.out.println();
    }
}
