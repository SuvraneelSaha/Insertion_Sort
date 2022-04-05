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
}
