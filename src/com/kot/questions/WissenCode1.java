package com.kot.questions;
import java.util.*;

/******************************************************************************
 Welcome to GDB Online.
 Code, Compile, Run and Debug online from anywhere in world.
 *******************************************************************************/
//import java.util.*;

/*class Main
{
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

		*//* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*//*
        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
    }
}*/


public class WissenCode1 {

    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));

    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
        int equalGroup = array.length/splitSize;
        int remainingElements = array.length%splitSize;
        System.out.println("Equal group is :: "+ equalGroup);
        System.out.println("Remaining elements is :: "+ remainingElements);

        List<int[]> returnList = new ArrayList<>();

        int j=0;
        for(int e=0;e<equalGroup;e++){
            List<Integer> newList = new ArrayList<>();
         for(int i=j;i<j+splitSize;i++){
             newList.add(array[i]);
         }
         System.out.println("Array is : "+ newList);
         returnList.add(newList.stream().mapToInt(value-> value.intValue()).toArray());
         j=j+splitSize;
        }

        final int[] ints = Arrays.copyOfRange(array, array.length - remainingElements, array.length);
        returnList.add(ints);
        return  returnList;
    }
}
