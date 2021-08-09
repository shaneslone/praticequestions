package com.infostretch.QA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class QAQuestions {

    /** Test if is a string is balanced.
     * This is a balanced String "{[()]}"
     * This is not "({]}"
     */
    public static boolean isBalance(String s){
        return false;
    }

    /** Reverse the letters in a String
     * "infostretch" => "hctertsofni"
     */
    public static String reverseString(String s){
        return "todo";
    }

    /**Check if string is a palindrome
     * "anna" and "racecar" are palindromes
     * "Infostretch" is not
     */
    public static boolean isPalindrome(String s){
        return false;
    }

    /** remove duplicated letters from a string
     * "apple"" => "aple"
     * "infostretch" => "infostrech"
     */
    public static String removeDuplicateCharacters(String s){
        return "todo";
    }

    /** Return a map which contains a count of the occurrence of each
     *  character in a string
     *  "apple" => {a=1, p=2, l=1, e=1}
     *  "infostretch" => {i=1, f=1, n=1, o=1, s=1, t=2, r=1, e=1, c=1, h=1}
     */

    public static Map<String, Integer> countOccurencesOfCharactersInString(String s){
        return new HashMap<>();
    }

    /** Check with or not a given string is an anagram of another string
     *  "abc" is an anagram of "bca"
     *  "infostretch" is not an anagram of "stretch"
     */
    public static boolean isAnagram(String s1, String s2){
        return false;
    }

    /** Without using native methods reverse the elements in an array
     * [1,2,3,4,5] => [5,4,3,2,1]
     */

    public static int[] reverseArray(int[] nums){
        return new int[]{};
    }

    /** Without using native methods return the largest number in an array
     * [1,2,3] => 3
     */

    public int max(int[] nums){
        return -100;
    }

    /** Without using native methods return the smallest number in an array
     * [1,2,3] => 1
     */

    public static int min(int[] nums){
        return 100;
    }

    public static void run (){
        System.out.println("\033[4;36misBalanced\033[0;33m");
        System.out.println(isBalance("{({})}") ? "PASS" : "FAIL");
        System.out.println(isBalance("{}}]()") ? "FAIL" : "PASS");
        

        System.out.println("\033[4;36mreverseString\033[0;33m");
        System.out.println(reverseString("infostretch").equals("hctertsofni") ? "PASS" : "FAIL");
        

        System.out.println("\033[4;36misPalindrome\033[0;33m");
        System.out.println(isPalindrome("anna") ? "PASS" : "FAIL");
        System.out.println(isPalindrome("racecar") ? "PASS" : "FAIL");
        System.out.println(isPalindrome("infostretch") ? "FAIL" : "PASS");
        

        System.out.println("\033[4;36mRemove Duplicate Characters\033[0;33m");
        System.out.println(removeDuplicateCharacters("apple").equals("aple") ? "PASS" : "FAIL");
        System.out.println(removeDuplicateCharacters("infostretch").equals("infostrech") ? "PASS" : "FAIL");
        

        System.out.println("\033[4;36mCount occurrences of characters\033[0;33m");
        Map<String, Integer> comparisonMap = new HashMap<>();
        comparisonMap.put("a",1);
        comparisonMap.put("p", 2);
        comparisonMap.put("l", 1);
        comparisonMap.put("e", 1);
        System.out.println(countOccurencesOfCharactersInString("apple").equals(comparisonMap) ? "PASS" : "FAIL");
        

        System.out.println("\033[4;36misAnagram\033[0;33m");
        System.out.println(isAnagram("bca", "abc") ? "PASS" : "FAIL");
        System.out.println(isAnagram("infostretch", "stretch") ? "PASS" : "FAIL");
        

        System.out.println("\033[4;36mreverseArray\033[0;33m");
        System.out.println(Arrays.equals(reverseArray(new int[]{1,2,3,4,5}), new int[]{5,4,3,2,1}) ? "PASS" : "FAIL");
        

        System.out.println("\033[4;36mMin from array\033[0;33m");
        System.out.println(min(new int[]{1,2,3}) == 1 ? "PASS" : "FAIL");
        

        System.out.println("\033[4;36mmax from array\033[0;33m");
        System.out.println(min(new int[]{3,2,1}) == 3 ? "PASS" : "FAIL");
        
    }

}
