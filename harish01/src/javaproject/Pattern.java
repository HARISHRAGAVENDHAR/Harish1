package javaproject;

public class Pattern {
    public static void main(String[] args) {
        int k = 5; // Assuming k = 5 as per the question
        for (int i = k; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}