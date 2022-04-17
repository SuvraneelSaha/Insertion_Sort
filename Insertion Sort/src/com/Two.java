package com;

public class Two {
    public static void main(String[] args) {
        /*
        Steps :
        1] Outer for loop -
        the outer for loop will run from 0 to N-2 times  i ++ ;
        where N - length of the array or no. of elements present in the array

        2] with each iteration of i the left hand side will be sorted

        3] inner for loop j

        4] the inner for loop will run from i+1 to 0 ; i--
        for(int j = i+1 ; j>0 ; j--)

        5] the condition for the swapping

        6] if(arr[j]< arr[j-1]) then swap

        if the element at the right side is lesser than the element at the left side then swapping will take place

        ex - 4 5 3 2 1
        1st pass - 4 5 3 2 1
        2nd pass - 3 4 5 2 1
        3rd pass - 2 3 4 5 1
        4th pass - 1 2 3 4 5

        7] if the condition (arr[j]< arr[j-1]) is false then
        --> break the inner for loop
        as we dont need to check the other elements which are in the left hand side as they are already sorted

        ex - 3 4 5 2 1
        j is at index 1
        so (arr[j]< arr[j-1]) it is false
        so break the inner for loop

        8] THE QUESTION WHY THE OUTER FOR LOOP IS RUNNING FROM 0 TILL N-2 times
        --> cause if it runs till n-1 then the value of j will be N which will be out of bounds

        SO GIST
        1] the outer FOR LOOP FROM 0 TILL N-2
        2] INNER FOR LOOP FROM J=I+1 TILL J>0 J--
        3] CONDTIION FOR SWAPPING -- ARR[J] < ARR[J-1] --> SWAP
        4] IF CONDITION IS FALSE THEN BREAK THE INNER FOR LOOP
        5] WHEN SWAPPING IS DONE --> SORTING DONE





         */
    }
}
