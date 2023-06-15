package com.kot.questions;

import java.util.*;

 /*

  Company - Vonage (10/02/2023)
  Technical Iterview Round-1

    Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
    Return the sorted string. If there are multiple answers, return any of them.

    Example 1:
    Input: s = "tree"
    Output: "eert"
    Explanation: 'e' appears twice while 'r' and 't' both appear once.
    So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

    Example 2:
    Input: s = "cccaaa"
    Output: "aaaccc"
    Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
    Note that "cacaca" is incorrect, as the same characters must be together.

    Example 3:
    Input: s = "Aabb"
    Output: "bbAa"
    Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
    Note that 'A' and 'a' are treated as two different characters.

*/

public class StringCode5 {

    public static void main(String[] args) {
        String s = "tretrr";
        //String s = "cccaaa";
        //String s = "Aabb";
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, Integer> countMap = new HashMap<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(chars[i]);
            if (countMap.containsKey(chars[i])) {
                countMap.put(chars[i], countMap.get(chars[i])+1);
            }else{
                countMap.put(chars[i], count);
            }
        }

        countMap.keySet().stream().forEach(key -> {
            System.out.println("Key is :: " + key);
            System.out.println("Value is :: " + countMap.get(key));
        });
        System.out.println("==============================");

        countMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry->{
            for(int i=1;i<=entry.getValue();i++)
                stringBuilder.append(entry.getKey());
        });
        System.out.println("Returned string is :: "+ stringBuilder);
    }

}
