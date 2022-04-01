package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Selection {
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
        selectionsort(arr);
        System.out.println("New Array is " + Arrays.toString(arr));


        // STEPS :
        // 1] select at element
        // 2] check if the element is > than all the elements
        // 3] if 2] is true
        // 3] swap the index of the element with the last index
        // 4] when swapping will be done the array will be sorted


    }

     static void selectionsort(int[] arr)
     {
         // a for loop for traversal for left to the right
         for (int i = 0; i <arr.length ; i++)
         {

             //  1st step is to  create the last index which will be changing after each iteration


             int last_Index = arr.length-i-1; // cause i will be 0 in the first place

             //2nd step is to find the largest element form the array in order to replace the element

             int max_El_Index = getmaxindex(arr,0,last_Index);

             // 3rd step is to replace the index of the largest element of the array
             // with the last index for every respective array
             // as the last index will be diminished by 1

             swap(arr,max_El_Index,last_Index);





         }
     }

     static void swap(int[] arr, int a, int b)
     {
         // a - the index of the largest element of the array
         // b is the index of the last element

         // ex - 5 4 3 2 1
         // after 1st iteration
         // 1 4 3 2 5
         // new arr - 1 4 3 2 cause the last index keep on decreasing by arr.length - i - 1
         // and i starts from 0
         // so
         // 2nd iteration
         // 1 2 3 4   /5
         // new arr - 1 2 3    /4 5
         //   3rd ite - new arr -  1 2    / 3 4 5
         // 4th iter - new arr - 1     /2 3 4 5
         // 5th iter - no elements left - 1 2 3 4 5

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

     }

    static int getmaxindex(int[] arr, int start, int end) // the start and end are the range of the search
     {
        int max = start ;
         for (int i = start; i <=end ; i++) // <= end cause it will check the last element also
         {
                if(arr[max] < arr[i])
                {
                    max = i ;
                }
         }
         return max ;
     }
}
