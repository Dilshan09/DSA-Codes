package lab1.practice3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		
		Stack stack = new Stack(5);
		
		stack.push('S');
		stack.push('T');
		stack.push('A');
		stack.push('C');
		stack.push('K');
		
		stack.display();
		System.out.println(" ");
		System.out.println("Peak value is : " + stack.peak());
		System.out.println(" ");

		while(!stack.isEmpty()) {
			
			char ch2 = stack.pop();
			System.out.println("Top deleted value is :"+ch2);
			i++;
		}
	}

}
