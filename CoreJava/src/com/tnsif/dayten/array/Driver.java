package com.tnsif.dayten.array;

public class Driver {
    public static void main(String args[]) {
        int n = 10;
        int a[];
        a = new int[n];

        ArrayOperation.printArray(a);

        for (int i = 0; i < a.length; i++)
            a[i] = 5 * i;

        ArrayOperation.printArray(a);

        int b[] = { 10, 20, 30, 40, 50 };
        ArrayOperation.printArray(b);

        System.out.println("sum of array elements is : " + ArrayOperation.getSum(b));
        System.out.println("sum of array elements is : " + ArrayOperation.getSum(10, 20));

        b[2] = 999;
        ArrayOperation.printArray(b);

        System.out.println("Odd numbers : " + ArrayOperation.getOddCount(b) + "\tEven numbers : "
                + ArrayOperation.getEvenCount(b));
        System.out.println();
        System.out.println("---------------------------------------");

        int c[];
    }
}
