package org.example;

import java.util.Scanner;

public class DivideNumberInRangeByNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i%div;
        }
        System.out.println(sum);
    }
}
