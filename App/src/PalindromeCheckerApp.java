public class PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     *
     * @param args Command-Line arguments.
     */
    public static void main(String[] args) {
        // Hardcoded input
        String input = "madam";

        // Assume it is a palindrome
        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print output
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? " + isPalindrome);
    }
}