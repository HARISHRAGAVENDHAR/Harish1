package javaproject;

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;
        
        if (amount < 500) {
            discount = 0;
        } else if (amount <= 1000) {
            discount = amount * 0.10;
        } else {
            discount = amount * 0.20;
        }
        
        double finalAmount = amount - discount;
        System.out.println("Final amount after discount: " + finalAmount);
    }
}