package lab1.practice4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i = 0;
		
		Stack stack  = new Stack(8);
		
		stack.push('P');
		stack.push('R');
		stack.push('A');
		stack.push('N');
		stack.push('E');
		stack.push('E');
		stack.push('T');
		stack.push('H');
		
		stack.display();
		
		System.out.println("\n"+"Peak value is : "+stack.peak()+"\n");
		
		System.out.println("\n"+"Delete Values :"+"\n");
		
		while(!stack.isEmpty()) {
//			char ch = stack.pop();
			System.out.println("\n"+"Top Value of "+stack.pop()+" deleted .");
//			i++;
		}

	}

}
