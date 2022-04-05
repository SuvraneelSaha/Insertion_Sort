package Process;

import java.util.Arrays;
import java.util.Scanner;

public class RevStringLeetcode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the char array:");
        int n = in.nextInt();
        char[] arr = new char[n];
        System.out.println("please enter the elements of the char array ");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.next().charAt(0);
        }
        System.out.println(Arrays.toString(arr));
        reverseString(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void  reverseString(char[] s)
    {

        int start = 0 ;
        int end  = s.length - 1;
        while (start<=end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++ ;
            end -- ;


        }

    }
}
