package Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int num) {
        if (num < 0 || (num % 10 == 0 && num != 0)) {
            return false;
        }
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();

        // Test case 1
        int num1 = 121;
        boolean result1 = solution.isPalindrome(num1);
        System.out.println("Test 1: " + result1); // Expected: true

        // Test case 2
        int num2 = -121;
        boolean result2 = solution.isPalindrome(num2);
        System.out.println("Test 2: " + result2); // Expected: false

        // Test case 3
        int num3 = 10;
        boolean result3 = solution.isPalindrome(num3);
        System.out.println("Test 3: " + result3); // Expected: false

        // Test case 4
        int num4 = 12321;
        boolean result4 = solution.isPalindrome(num4);
        System.out.println("Test 4: " + result4); // Expected: true
    }
}
