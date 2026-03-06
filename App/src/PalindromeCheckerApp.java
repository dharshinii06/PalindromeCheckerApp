public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded input
        String input = "madam";

        // Initialize reversed string
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Build reversed string
        }

        // Compare original and reversed strings
        boolean isPalindrome = input.equals(reversed);

        // Display results
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? " + isPalindrome);
    }
}