package com.kot.questions;
/*
 * Company - Vonage (5/02/2023)
 * Codility 3 coding problems on String
https://leetcode.ca/2020-03-26-1578-Minimum-Deletion-Cost-to-Avoid-Repeating-Letters/
 * */
public class StringCode3 {

    public static void main(String[] args) {
        //s="aabbcc" c=[1,2,1,2,1,2]
        String s1= "aabbcc";
        int[] c1 ={1,2,1,2,1,2};
        //result expected=3

        String s2= "abccbd";
        int[] c2 ={0,1,2,3,4,5};
        //result expected=2

        String s3= "aaaa";
        int[] c3 ={3,4,5,6};
        //result expected=12

        String s4= "ababa";
        int[] c4 ={10,5,10,5,10};
        //result expected=0

        int sum = solution(s4,c4);
        System.out.println(sum);

    }

    public static int solution(String example,int[] c) {
        char[] exampleArray = example.toCharArray();
        int  sum=0;
        for(int i=0;i<exampleArray.length-1;i++){
            if(exampleArray[i]==exampleArray[i+1]){
                sum=c[i]<c[i+1]?sum+c[i]:sum+c[i+1];
            }
        }
        System.out.println("minimum cost of necessary deletion is ::"+sum);
        return  sum;
    }


}
