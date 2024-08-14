package org.example;

import java.util.Scanner;

public class Recurssion {
    public static int Factorial(int a){
        if (a==0 || a==1){
            return 1;
        }
        return a*Factorial(a-1);
    }
    public static void main(String[] args) {
        System.out.println("This is the class of the Recursion");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("The factorial of "+a+" is "+Factorial(a));

    }
}
