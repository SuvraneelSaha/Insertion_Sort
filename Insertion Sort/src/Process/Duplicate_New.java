package Process;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
public class Duplicate_New {
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
        System.out.println("Og array is "+ Arrays.toString(arr));
        System.out.println(containsDuplicate(arr));
    }

     static boolean containsDuplicate(int[] arr) {

        Set<Integer> set = new HashSet<Integer>();

        for (int n : arr)
        {
            if(set.contains(n))
            {
                return true;
            }
            else
            {
                set.add(n);
            }
        }
        return false ;


    }
    // WE are using hash set for this approach
    // Steps
    // 1] we are creating a new hash set
    // 2] we are using a for each loop
    // to traverse over every element present in the array
    // condition checking
    // 3] if the set contains the element n then true
    // 4] else it will add it in the set
    // 5 ] if the total no. of elements are over then
    // it will return false




}
