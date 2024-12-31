package javaproject;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int smallest = Math.min(a, Math.min(b, c));
        System.out.println("The smallest number is: " + smallest);
    }
}