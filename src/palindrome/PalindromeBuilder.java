package palindrome;

import java.util.HashMap;

/**
 * Clase encargada de construir un palíndromo a partir de una cadena de entrada,
 * si es posible reorganizando sus caracteres.
 *
 * Un palíndromo es una secuencia que se lee igual de izquierda a derecha que de derecha a izquierda.
 *
 * Esta clase forma parte del ejercicio 1 de la prueba técnica.
 *
 * Ejemplo de uso:
 * <pre>
 * PalindromeBuilder pb = new PalindromeBuilder();
 * String resultado = pb.buildPalindrome("civic");  // civic
 * </pre>
 *
 * Complejidad:
 * <ul>
 *   <li>Tiempo: O(n), donde n es la longitud de la cadena de entrada</li>
 *   <li>Espacio: O(k), donde k es el número de caracteres únicos (máx. 26 para alfabeto inglés)</li>
 * </ul>
 *
 * @author Ichel Delgado
 */

public class PalindromeBuilder {

    public String buildPalindrome(String input) {
        input = input.toLowerCase();

        /**
        * Reordena los caracteres de una cadena para formar un palíndromo si es posible.
        *
        * @param input La cadena de entrada a evaluar (se convertirá a minúsculas automáticamente)
        * @return Un palíndromo válido formado al reordenar los caracteres de entrada,
        *         o "Not Possible" si no es posible formar un palíndromo
        * @throws NullPointerException si la entrada es null
        * Complejidad: O(n) donde n es la longitud de la cadena de entrada
        * Espacio: O(k) donde k es el número de caracteres únicos (máximo 26 para alfabeto inglés)
        **/
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        char oddChar = 0;

        for (HashMap.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddCount++;
                oddChar = entry.getKey();
            }
        }

        if (oddCount > 1) {
            return "Not Possible";
        }

        StringBuilder leftHalf = new StringBuilder();
        for (HashMap.Entry<Character, Integer> entry : charCounts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (c == oddChar && count % 2 != 0) {
                continue;
            }

            for (int i = 0; i < count / 2; i++) {
                leftHalf.append(c);
            }
        }

        String palindrome;
        if (oddCount == 1) {
            palindrome = leftHalf.toString() + oddChar + leftHalf.reverse().toString();
        } else {
            palindrome = leftHalf.toString() + leftHalf.reverse().toString();
        }
        return palindrome;
    }
}
