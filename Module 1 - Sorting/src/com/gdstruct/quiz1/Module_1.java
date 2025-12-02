package com.gdstruct.quiz1;

public class Module_1 {

    public static void main(String[] args) {
        // write your code here

        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;
    }
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.println(j);
        }
    }
}