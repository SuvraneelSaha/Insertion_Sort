package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        // 5 , 3 , 4 , 2 , 1
        // steps :
        // 1 ] check if the jth element is < j-1
        // ex j is 1 and j-1 is 0 th element
        // if 1] is true then swap
        // with each pass the largest element will be on the right side of the array
        // pass Signifies - outer loop
        // presence of outer loop means the presence of an inner fpr loop

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
        bubbleOptimized(arr);
        System.out.println("New Array is " + Arrays.toString(arr));






    }
    static void bubble(int[] arr)
    {
        // outer loop i
        // ith loop will run n-1 times cause the last element will be in the right index at the last pass
        for (int i = 0; i <arr.length ; i++)
        {
            for (int j = 1; j <arr.length-i ; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    // SWAP
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    }
    static void bubbleOptimized(int[] arr)
    {
        boolean swap ;
        // the ith pointer will act as  a counter
        // and it will run n-1 times
        for (int i = 0; i <arr.length ; i++)
        {
            swap = false;
            // by default we are assigning it as false
            for (int j = 1; j < arr.length-i ; j++)
            // the reason for arr.length-i cause we dont want to compare again and again the elements on the right side
                // which are being sorted after each internal pass
            {
                    if(arr[j] < arr[j-1])
                    {
                        // SWAP
                        int temp = arr[j];
                         arr[j] = arr[j-1];
                         arr[j-1] = temp;
                         // SWAPping done so the new array is now sorted
                        swap = true ;
                    }
            }
            if(!swap) // same as if(swap == false)
            {
                break;
            }
        }
    }
    // EDGE TEST CASES:
    // IF NO SWAPPING TAKES PLACE IN A PASS IE IN THE OUTER LOOP
    // THEN WE CAN SAY THAT THE ARRAY IS SORTED
    // ITS COMMON SENSE THAT WHEN NO SWAPPING TAKES PLACE THE ELEMENTS ALL LIE IN THEIR APPROPRIATE INDEX POSITIONS
    // SO
    // in case of already given sorted array
    // there wont be any swapping in the 1st pass ie AT i = 0
    // also it will run the outer for loop till n-1 times
    // no need to do that so we can use a boolean var to check if swapping is done or not



}
// STEPS :
// 1] ONE OUTER LOOP FOR THE NO. OF PASSES
// 2] FOR MAKING COMPARISONS AND SWAPPING
// 3]CHECK IF THE JTH ELEMENT < J-1 TH ELEMENT
// IF 3] IS TRUE THEN SWAP
// WHEN THE SWAPPING WILL BE DONE FOR ALL THE PASSES IE THE OUTER FOR LOOP i
// THEN THE ARRAY WILL BE SORTED
