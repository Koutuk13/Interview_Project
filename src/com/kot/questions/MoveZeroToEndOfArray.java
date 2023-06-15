package com.kot.questions;

/*
Company - Omnicell (10/01/2023)

Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
 */

public class MoveZeroToEndOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int size = arr.length;
        process(arr,size);
    }

    private static void process(int[] arr, int size){
        int count =0;

        for(int i=0;i<size;i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }

        while (count < size) {
            arr[count++]=0;
        }

        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}
