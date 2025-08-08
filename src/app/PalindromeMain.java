package app;

import palindrome.PalindromeBuilder;

import java.util.Scanner;

public class PalindromeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena:");
        String input = sc.nextLine();
        sc.close();

        PalindromeBuilder pb = new PalindromeBuilder();
        String result = pb.buildPalindrome(input.toLowerCase());

        System.out.println("Resultado: " + result);
    }
}