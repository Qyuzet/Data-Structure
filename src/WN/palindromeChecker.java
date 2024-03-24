package WN;

public class palindromeChecker {
    public static void main(String[] args) {
        String input = "ghithrif";
        if (isPalindrome(input))
            System.out.println(input + " is a palindrome.");
        else
            System.out.println(input + " is not a palindrome.");
    }

    // Recursive function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1)
            return true;
        else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            if (firstChar == lastChar)
                return isPalindrome(str.substring(1, str.length() - 1));
            else
                return false;
        }
    }
}
