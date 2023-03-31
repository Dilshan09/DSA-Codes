package tests1;

import java.util.Scanner;

public class MiddleElementStack {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        Stack stack = new Stack(5);
        
        System.out.print("Enter the number of elements in the stack: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        Stack tempStack = new Stack (5);

        for (int i = 0; i < (n/2); i++) {
            tempStack.push(stack.pop());
        }

        int middleElement = stack.pop();

        while (!(tempStack.isEmpty())) {
            stack.push(tempStack.pop());
        }

        System.out.println("The middle element is: " + middleElement);
    }
}
