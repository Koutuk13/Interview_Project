package com.kot.questions;
/*
* Company - Vonage (5/02/2023)
* Codility 3 coding problems on String
* Return duplicate char in string
* */
public class StringCode1 {

    public static void main(String[] args) {

        String returnString = solution("codility");
        System.out.println(returnString);

    }

    public static String solution(String example){
        char[] exampleArray = example.toCharArray();
        int count;
        char duplicateChar=' ';

        for(int i = 0; i <exampleArray.length; i++) {
            count = 1;
            for(int j = i+1; j <exampleArray.length; j++) {
                if(exampleArray[i] == exampleArray[j] && exampleArray[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    exampleArray[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && exampleArray[i] != '0') {
                System.out.println(exampleArray[i]);
                duplicateChar = exampleArray[i];
                //return Character.toString(duplicateChar);
                System.out.println(Character.toString(duplicateChar));
            }
        }
        return  Character.toString(duplicateChar);
    }
}
