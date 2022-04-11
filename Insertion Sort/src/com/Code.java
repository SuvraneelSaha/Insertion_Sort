package com;

import java.util.Arrays;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements in the array :");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG array is " + Arrays.toString(arr));
        insertionsort(arr);
        System.out.println("New Array using insertion sort  " + Arrays.toString(arr));

    }
    static void insertionsort(int[] arr) // this is the parameter and the values
            // that are passed in the function are known as the arguments
    {
        for (int i = 0; i <arr.length-1 ; i++)
        {
            for (int j = i+1; j >0 ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    // SWAP
                    Swap(arr,j,j-1);
                }
                else
                {
                    break; // break the inner for loop
                    // what ever j you are at the left hand side will always be sorted
                    // 1 , 2 ,3 ,4 , 5, 6
                    // j- 6 so j< j-1 so break

                    // left hand side will always will be sorted
                    // does it really makes sense to check if 6 is smaller than 4 if we check 5
                    // so no need as the left hand side will always be sorted beforehand

                }
            }    
        }
    }

    static void Swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp ;

    }
}
