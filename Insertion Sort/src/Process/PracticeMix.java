package Process;

import java.util.Arrays;
import java.util.Scanner;

// bubble sort and selection sort mixture
// ie make two function call one for bubble sort and another for the selection sort
public class PracticeMix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // input stream
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements of the array");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Og array "+Arrays.toString(arr));

        System.out.println("Choose option B or S ");
        char ans = in.next().charAt(0);
        if(ans == 'B' || ans == 'b')
        {
            bubble_optimized(arr);
            System.out.println("Bubble sort " + Arrays.toString(arr));
        }
        else if(ans == 's' || ans == 'S')
        {
            selectionsort(arr);
            System.out.println("Selection sort " + Arrays.toString(arr));

        }
        else
        {
            System.out.println("Invalid Operation");
        }


    }
    // function for bubble sort
    // bubble sort steps :
    // 1] there will be an outer for loop as a counter
    // 2] inner for loop for comparison and swapping
    // after each ith iteration ie the outer loop iteration it is termed as  --- > No. of passes complete pass complete
    // and when all the passes will be done the array will be sorted
    static void selectionsort(int[] arr)
    {
        // Selection sort Steps :
        // 1] a for loop for traversal for the 1st to the last index value
        // 2] find the max element index from the array
        // 3] swap the max element with the last digit
        // 4] when the finding the max element and the swapping the max element is done for all the respective arrays
        // the nthe array will be sorted

        // for traversal
        for (int i = 0; i <arr.length ; i++)
        {
            // step 1 : find the last index that will be changing after each iteration
            int lastIndex = arr.length - i - 1 ;
            // ex - arr.length = 5
            // last index = 5 - 0 - 1 = 4
            // last index = 5 - 1 - 1 = 3
            // last index = 5 - 2 - 1 = 2
            // last index = 5 - 3 - 1 = 1
            // last index = 5 - 4 - 1 = 0


            // step 2 : find the max element's index

            int maxIndex = findmaxindex(arr,0,lastIndex);

            // step 3 : swap the max element index with the last index of the array

            swap(arr,maxIndex,lastIndex);


        }






    }

     static void swap(int[] arr, int maxIndex, int lastIndex)
     {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
     }

    static int findmaxindex(int[] arr, int start, int end)
     {
         int max = start;
         for (int i = start; i <= end ; i++)
         {
                if(arr[max] < arr[i])
                {
                    max = i ;
                }
         }
         return  max ;
    }


    static void bubble(int[] arr)
    {
        // ex arr - 5 3 4 2 1
        for (int i = 0; i <arr.length ; i++)
        {
            for (int j = 1; j < arr.length-i ; j++)
            {
                  if(arr[j] < arr[j-1])
                  {
                      int temp = arr[j];
                      arr[j] = arr[j-1];
                      arr[j-1] = temp;

                  }
            }
        }
        // when the outer for loop ends the array will be sorted
    }
    static void bubble_optimized(int[] arr)
    {
        // edge case if the array is already sorted then what
        // the array will run until and unless all the passes are  done
        boolean swap ;
        for (int i = 0; i <arr.length ; i++)
        {
            swap = false;
            for (int j = 1; j <arr.length-i ; j++) // < arr.length - i or <= arr.lenght - i - 1
            {
                    // if the condition satisfies
                if(arr[j] < arr[j-1])
                {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }

            }
            if(!swap)
            {
                break;
            }
        }
    }
}
