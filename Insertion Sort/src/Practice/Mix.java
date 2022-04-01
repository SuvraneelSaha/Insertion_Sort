package Practice;

import java.util.Arrays;
import java.util.Scanner;

import static Practice.Selection.swap;

public class Mix {
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

        System.out.println("please enter choice A or B ");
        char ans = in.next().charAt(0);
        if(ans == 'A')
        {
            bubble(arr);
            System.out.println("Bubble sort " + Arrays.toString(arr));

        }
        else if(ans == 'B')
        {
            selection(arr);
            System.out.println("Selection sort is  " + Arrays.toString(arr));
        }
        else
        {
            System.out.println("Invalid");
        }





    }
    static void bubble(int[] arr)
    {
        boolean swap;
        for (int i = 0; i <arr.length ; i++)
        {
            swap = false; // by default
            for (int j = 1; j <arr.length-i ; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true ;
                }
            }
            if(swap == false)
            {
                break;
            }
        }
    }

    static void selection(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++)
        {
            // 1st step to find the last index
            int lastIndex = arr.length-i-1; // cause i starts with 0
            // 2nd step is to find the max element's index
            int maxIndex = getMaxIndex(arr,0,lastIndex);

            // 3rd step is to swap the largest element from the array to the last index
            // for each respective array as the last index pointer keeps on decreasing
            Swap(arr,maxIndex,lastIndex);

            // when the swapping is done the array will be sorted




        }
    }

     static void Swap(int[] arr, int maxIndex, int lastIndex)
     {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
     }

    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start ;
        for (int i = start; i <=end ; i++)
        {
            if(arr[i] > arr[max])
            {
                max = i ;
            }
        }
        return  max ;
    }

}
