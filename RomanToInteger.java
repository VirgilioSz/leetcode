import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int posicion = 0;
        int fin = s.length() - 1;
        int resultado = 0;
        while (posicion < fin) {
            if (romanMap.get(s.charAt(posicion)) < romanMap.get(s.charAt(posicion + 1))) {
                resultado += romanMap.get(s.charAt(posicion + 1)) - romanMap.get(s.charAt(posicion));
                posicion += 2;
            } else {
                resultado += romanMap.get(s.charAt(posicion));
                posicion += 1;
            }
        }
        if (posicion == fin) {
            resultado += romanMap.get(s.charAt(posicion));
        }
        return resultado;
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();

        // Test case 1
        String s1 = "III";
        System.out.println("Input: \"" + s1 + "\" -> Output: " + solution.romanToInt(s1) + " (Expected: 3)");

        // Test case 2
        String s2 = "LVIII";
        System.out.println("Input: \"" + s2 + "\" -> Output: " + solution.romanToInt(s2) + " (Expected: 58)");

        // Test case 3
        String s3 = "MCMXCIV";
        System.out.println("Input: \"" + s3 + "\" -> Output: " + solution.romanToInt(s3) + " (Expected: 1994)");

        // Test case 4
        String s4 = "IX";
        System.out.println("Input: \"" + s4 + "\" -> Output: " + solution.romanToInt(s4) + " (Expected: 9)");

        // Test case 5
        String s5 = "IV";
        System.out.println("Input: \"" + s5 + "\" -> Output: " + solution.romanToInt(s5) + " (Expected: 4)");

        // Test case 6
        String s6 = "CD";
        System.out.println("Input: \"" + s6 + "\" -> Output: " + solution.romanToInt(s6) + " (Expected: 400)");
    }
}
