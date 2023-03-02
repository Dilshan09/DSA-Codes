package lab1.practice4;

public class Stack {

	private int top;
	private int maxSize;
	private char strArr[];
	
	public Stack(int maxSize) {
		
		this.top = -1;
		this.maxSize = maxSize;
		this.strArr = new char[maxSize];
		
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == (maxSize-1));
	}
	
	public void push(char ch) {
		if(!isFull()) {
			strArr[++top] = ch;
		}else {
			System.out.println("Stack is Full");
		}
	}
	
	public char pop() {
		if(!isEmpty()){
			return strArr[top--];
		}else{
			System.out.println("Stack is Empty");
		}
		
		return 0;
	}
	
	public char peak() {
		if(!isEmpty()) {
			return strArr[top];
		}else {
			System.out.println("Stack is Full");
		}
		return 0;
	}
	
	public void display() {
		
		int i = top;
		
		System.out.println("\nPrinting the stack values .\n");
		
		do {
			System.out.println(strArr[i]);
			i--;
		}while(i>=0);
	}
}





















