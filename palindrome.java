public class palindrome {
    public static boolean isPalindrome(String str) {
        // Base case: If the string is empty or has only one character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Recursive case: Check if the first and last characters are equal
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Recursively check if the substring excluding the first and last characters is a palindrome
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            // Characters don't match, not a palindrome
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "amma";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}