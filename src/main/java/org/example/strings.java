package org.example;

import java.util.Stack;

public class strings {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        String s = "  hello world  ";
        System.out.println("Trimmed string "+s.trim());
        StringBuffer word = new StringBuffer();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i)==' '){
                if(!word.isEmpty()){
                    st.push(word.toString());
                    word.setLength(0);
                }
                i++;
            }
            else{
                word.append(s.charAt(i));
                i++;
            }
        }
        if (!word.isEmpty()) {
            st.push(word.toString());
        }

        System.out.println(st);
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
            if (!st.isEmpty()) result.append(" ");
        }

        System.out.println(result.toString());


        int x = -121;
        String string = Integer.toString(x);
        StringBuilder value = new StringBuilder(string);
        StringBuilder reverse = new StringBuilder(value.reverse());
        value.reverse();
        if(value.compareTo(reverse) == 0){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        if (value.charAt(value.length() - 1) == '-') {
            value.deleteCharAt(value.length() - 1);
            // Remove leading zeros after reversing
            while (value.length() > 1 && value.charAt(0) == '0') {
                value.deleteCharAt(0);
            }
            value.insert(0, '-');
        } else {
            while (value.length() > 1 && value.charAt(0) == '0') {
                value.deleteCharAt(0);
            }
        }

        String finalStr = value.toString();
        System.out.println(Integer.valueOf(finalStr));

    }
}
