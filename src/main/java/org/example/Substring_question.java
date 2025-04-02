package org.example;
import java.util.HashSet;
public class Substring_question {
    public static int cntSubstrings(String s) {
        int n = s.length();
        int left = 0, count = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            count += (right - left + 1); // Count substrings ending at `right`
        }return count;
    }

    public static void main(String[] args) {
        String s = "abac";
        System.out.println("Total substrings: " + cntSubstrings(s)); // Output: 7
    }
}
