package app;

import palindrome.PalindromeBuilder;

import java.util.Scanner;

/**
 * Clase principal para ejecutar el algoritmo del ejercicio 1:
 * Determinar si una cadena puede reorganizarse para formar un palíndromo.
 *
 * Esta clase se encarga de:
 * - Leer la entrada del usuario desde consola.
 * - Convertir la cadena a minúsculas.
 * - Llamar al método PalindromeBuilder para procesar la entrada.
 * - Imprimir el resultado en consola.
 *
 * @author Ichel Delgado
 */
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