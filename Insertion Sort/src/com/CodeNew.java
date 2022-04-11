package com;

import java.util.Arrays;
import java.util.Scanner;

public class CodeNew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the arr");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements of the array :");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Original Array "+ Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("Insertion Sort"+Arrays.toString(arr));


    }

     static void InsertionSort(int[] arr)
     {
         for (int i = 0; i <arr.length-1 ; i++)
         {
             for (int j = i+1; j >0 ; j--)
             {
                if(arr[j] < arr[j-1])
                {
                    // Swap
                    swap(arr,j,j-1);

                }
                else
                {
                    break;
                }
             }
         }
    }

     static void swap(int[] arr, int a, int b)
     {
         int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
