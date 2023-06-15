package com.kot.questions;
/*
 * Company - Vonage (5/02/2023)
 * Codility 3 coding problems on String
 You are given a string consisting of digits. Find the biggest two-digits value that is a consistent fragment of the given string.
For example, two-digit consistent fragment of "50552" are["50","05","55","52"], representing the numbers [50,5,55,52]. the biggest value among them is 55.
 * */
public class StringCode2 {

    public static void main(String[] args) {

        int maxValue = solution("50552");
        System.out.println(maxValue);

    }

    public static int solution(String example) {
        char[] exampleArray = example.toCharArray();
        int  max=0;
        int temp=0;
        for(int i=0;i<example.length()-1;i++){
            System.out.println(example.substring(i,i+2));
            temp = Integer.parseInt(example.substring(i,i+2));
            if(temp>max){
                max=temp;
            }
        }
        System.out.println("max is ::"+max);
        return  max;
    }


}
