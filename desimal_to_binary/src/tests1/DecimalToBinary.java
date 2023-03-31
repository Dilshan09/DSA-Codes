package tests1;
import java.util.*;
public class DecimalToBinary {
	
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        Stack stack = new Stack(5);

	        System.out.print("Enter a decimal number: ");
	        int num = sc.nextInt();

	        
	        while (num != 0) {
	            int remainder = num % 2;
	            stack.push(remainder);
	            num /= 2;
	        }

	        System.out.print("The binary number is: ");

	        while (!(stack.isEmpty())) {
	            System.out.print(stack.pop());
	        }
	    }
	}


