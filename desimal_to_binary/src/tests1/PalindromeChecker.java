package tests1;

import java.util.*;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        Stack stack = new Stack(5);

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";
        while (!(stack.isEmpty())) {
            reversed += stack.pop();
        }

        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
