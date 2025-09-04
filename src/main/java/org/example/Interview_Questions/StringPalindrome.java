package org.example.Interview_Questions;

public class StringPalindrome {
    public static int getScore(String str){
        int sum = 0;
        for (int i=0;i<str.length()-4;i++){
            String four = str.substring(i,i+4);
            String five = str.substring(i,i+5);

            StringBuilder test1 = new StringBuilder(four);
            StringBuilder test2 = new StringBuilder(five);
            StringBuilder reverseStr1 = new StringBuilder(four);
            StringBuilder reverseStr2 = new StringBuilder(five);
            System.out.println(four);
            System.out.println(five);
            reverseStr1.reverse();
            reverseStr2.reverse();
            if(test1.toString().equals(reverseStr1.toString())) sum+=5;
            if (test2.toString().equals(reverseStr2.toString())) sum+=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getScore("ABCBAAAA"));
    }
}
