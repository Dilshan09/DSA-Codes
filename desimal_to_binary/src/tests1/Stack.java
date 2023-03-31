package tests1;

public class Stack {

	private int top;
	private int maxSize;
	private int[] stackArray;
	
	public Stack (int maxSize) {
		this.top = -1;
		this.maxSize = maxSize;
		this.stackArray = new int [maxSize];	
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (maxSize - 1));
	}
	
	//push methods
	public void push(int ch) {
		if(!isFull()) {
			stackArray[++top] = ch;
		}else {
			System.out.println("Stack is Full.");
		}
	}
	
	//pop methods
	public int pop() {
			if(!isEmpty()) {
				return stackArray[top--];
			}else {
				System.out.println("Stack is Empty.");
			}
			return 0;
		}
		
	//peak method - top element
	public int peak() {
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


