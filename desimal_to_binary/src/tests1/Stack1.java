package tests1;

public class Stack1 {

		private int top;
		private int maxSize;
		private char[] stackArray;
		
		public Stack1 (int i) {
			this.top = -1;
			this.maxSize = i;
			this.stackArray = new char [i];	
		}
		
		public boolean isEmpty() {
			return (top == -1);
		}
		
		public boolean isFull() {
			return (top == (maxSize - 1));
		}
		
		//push methods
		public void push(char ch) {
			if(!isFull()) {
				stackArray[++top] = ch;
			}else {
				System.out.println("Stack is Full.");
			}
		}
		
		//pop methods
		public char pop() {
				if(!isEmpty()) {
					return stackArray[top--];
				}else {
					System.out.println("Stack is Empty.");
				}
				return 0;
			}
			
		//peak method - top element
		public char peak() {
			if(!isEmpty()) {
				return stackArray[top];
			}
		else {
			System.out.println("Stack is Empty.");
		}
		return 0;
	}
		//print stack element
		public void display() {
			System.out.println("Printing the Stack element.");
			
			int i = top;
			do {
				System.out.println(stackArray[i] + " ");
				i--;
			}
			while(i>=0);
		}
	}

