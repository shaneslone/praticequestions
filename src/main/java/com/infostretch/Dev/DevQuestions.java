package com.infostretch.Dev;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.LinkedList;
import java.util.Queue;

public class DevQuestions {
    /** Run length encoding
     * given a string "AAABBBCEE"
     * encode it such that "AAABBBCEE" => "A3B3CE2"
     */

    public static String runLengthEncode(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            char next = ' ';
            if(i < s.length() -1 ) next = s.charAt(i+1);
            count++;
            if(cur != next) {
                sb.append(cur);
                if (count > 1) {
                    sb.append(count);
                }
                count = 0;
            }
        }
        return sb.toString();
    }

    /**
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     * The overall run time complexity should be O(log (m+n)).
     * https://leetcode.com/problems/median-of-two-sorted-arrays/
     */

     public static double medianOfTwoSortedArrays(int[] nums1, int[] nums2){
         return -50;
     }

    /**Given an array of positive integers nums and a positive integer target,
     * return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr]
     * of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
     * https://leetcode.com/problems/minimum-size-subarray-sum/
     */

    public static int minSubArrayLen(int target, int[] nums){
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while(j < nums.length){
            sum += nums[j];
            j++;
            while(sum >= target){
                min = Math.min(min, j - i);
                sum -= nums[i];
                i++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    /** Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
     The algorithm for myAtoi(string s) is as follows:

     1. Read in and ignore any leading whitespace.
     2. Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
     3. Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
     4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
     5.  If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
     6. Return the integer as the final result.
     Note:

     Only the space character ' ' is considered a whitespace character.
     Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
     https://leetcode.com/problems/string-to-integer-atoi/
     */

    public static int atoi(String num){
        int sign = 1, base = 0, i = 0;
        while(num.charAt(i) == ' '){
            i++;
        }
        if(num.charAt(i) == '-'){
            sign = - 1;
            i++;
        }
        while(i < num.length() && num.charAt(i) >= '0' && num.charAt(i) <= '9'){
            if(base > Integer.MAX_VALUE/10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (num.charAt(i) - '0');
            i++;
        }
        return base * sign;

    }

    /** Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

     [4,5,6,7,0,1,2] if it was rotated 4 times.
     [0,1,2,4,5,6,7] if it was rotated 7 times.
     Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

     Given the sorted rotated array nums of unique elements, return the minimum element of this array.

     You must write an algorithm that runs in O(log n) time.
     */

    public static int minOfRotatedSortedArray(int[] nums){
        int l = 0, r = nums.length - 1, mid = 0;

        while(l < r){
            mid = (l+r)/2;
            if(nums[mid] > nums[r]) l = mid+1;
            if(nums[mid] < nums[r]) r = mid;
        }
        return nums[mid];
    }

    /**  A group of students are sitting in a circle. The teacher is electing a new class president. The teacher does this by singing
     *  a song while walking around the circle. After the song     is finished the student at which the teacher stopped is removed from the circle.
     *  Starting at the student next to the one that was just removed, the teacher resumes singing and walking around the circle.  After the teacher
     *  is done singing, the next student is removed. The teacher repeats this until one student is left. A song of length k will result in the teacher
     *  walking past k students on each round. The students are numbered 1 to n. The teacher starts at student 1.
     *  For example, suppose the song length is two(k=2). And there are four students to start with (1,2,3,4). The first student to go would be '2', after
     *  that '4', and after that '3’. Student '1' would be the next president in this example.
     */

    public static int elect(int students, int songLength){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= students; i++) queue.offer(i);
        int count = 1;
        while(queue.size() > 1){
            if(count < songLength){
                queue.offer(queue.poll());
                count++;
            } else {
                queue.poll();
                count = 1;
            }
        }
        return queue.poll();
    }

    /** Magic Potion a.k.a Encode from first
     * Optimize string in such a way that * is used to represent "start from the beginning"
     * EX "ABABCABABCE" => "AB*C*E"
     */

    public static String encodeFromFirst(String s){
        return "todo";
    }

    public static void run(){
        System.out.println("\033[4;36mRun Length Encoding\033[0;33m");
        System.out.println(runLengthEncode("AAABBBCCE").equals("A3B3C2E") ? "PASS" : "FAIL");

        System.out.println("\033[4;36mMedian of Two Sorted Arrays\033[0;33m");
        System.out.println(medianOfTwoSortedArrays(new int[]{1,2}, new int[]{3,4}) == 2.5d ? "PASS" : "FAIL");

        System.out.println("\033[4;36mMinimum Subarray that is >= target\033[0;33m");
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}) == 2 ? "PASS" : "FAIL");

        System.out.println("\033[4;36mATOI function\033[0;33m");
        System.out.println(atoi("2500") == 2500 ? "PASS" : "FAIL");
        System.out.println(atoi("214748364788") == Integer.MAX_VALUE ? "PASS" : "FAIL");
        System.out.println(atoi("-214748364788") == Integer.MIN_VALUE ? "PASS" : "FAIL");

        System.out.println("\033[4;36mMinimum of rotated sorted Array\033[0;33m");
        System.out.println(minOfRotatedSortedArray(new int[]{3,4,5,1,2}) == 1 ? "PASS" : "FAIL");

        System.out.println("\033[4;36mElecting a student\033[0;33m");
        System.out.println(elect(4,2) == 1 ? "PASS" : "FAIL");

        System.out.println("\033[4;36mMagic Potion a.k.a Encode From First\033[0;33m");
        System.out.println(encodeFromFirst("ABABCABABCE").equals("AB*C*E") ? "PASS" : "FAIL");
    }
}
