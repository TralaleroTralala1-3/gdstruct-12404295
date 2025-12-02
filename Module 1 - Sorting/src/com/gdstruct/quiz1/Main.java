package com.gdstruct.quiz1;

public class Main
{

    public static void main(String[] args)
    {
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

        System.out.println("Before selection/bubble sort: ");
        printArrayElements(numbers);

        bubblesort(numbers);
        //selectionsort(numbers);

        System.out.println("\n\nAfter selection/bubble sort: ");
        printArrayElements(numbers);

    }

    private static void bubblesort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                // Descending order: swap when left is smaller
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    private static void selectionsort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int SmallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                // Look for the smallest value instead of the largest
                if (arr[i] < arr[SmallestIndex])
                {
                    SmallestIndex = i;
                }
            }

            // Move smallest element to the end
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[SmallestIndex];
            arr[SmallestIndex] = temp;
        }
    }
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}
