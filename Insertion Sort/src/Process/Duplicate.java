package Process;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/contains-duplicate/
public class Duplicate {
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
        System.out.println("Og array is "+Arrays.toString(arr));
        System.out.println(containsDuplicate(arr));



    }

    static boolean containsDuplicate(int[] arr)
    {
        Arrays.sort(arr);
        for (int i = 1; i <arr.length ; i++)
        {
            if(arr[i] == arr[i-1])
            {
                return true;
            }

        }
        return false;



    }
    // Arrays.sort is a prebuild function in java which is present in the collection framework
    // it sorts the array with the best possible approach ex - by using heap sort


    // STep :
    // 1 ] sorting the array by using the Arrays.sort pre build function
    // 2] traversing over each element to check if the element matches a previous element or not
    // 3] if the eleemnt matches then
    // 4] return true or else false


}
