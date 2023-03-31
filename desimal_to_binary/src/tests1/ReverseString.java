package tests1;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        Stack1 stack = new Stack1 (6);

        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        System.out.print("The reversed string is: ");

        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}

