import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; 
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reverse = new char[len];
        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }
        return reverse;
    }
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.nextLine();

    
        if (isPalindromeIterative(input)) {
            System.out.println("Logic 1: Palindrome ✅");
        } 
        else {
            System.out.println("Logic 1: Not a Palindrome ❌");
        }

    
        if (isPalindromeRecursive(input, 0, input.length() - 1)) {
            System.out.println("Logic 2: Palindrome ✅");
        } 
        else {
            System.out.println("Logic 2: Not a Palindrome ❌");
        }

     
        if (isPalindromeArray(input)) {
            System.out.println("Logic 3: Palindrome ✅");
        } 
        else {
            System.out.println("Logic 3: Not a Palindrome ❌");
        }

        sc.close();
    }
}
