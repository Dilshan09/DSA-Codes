package bracketcheck;

import lab1.Stack;

public class bracketcheck {

	private String InputStr;
	
	public bracketcheck(String in) {
		InputStr = in; //3 + (( 6 * 2) – 3) 
	}
	 
	public void checkB() {
		
		int size = InputStr.length(); //11
		Stack stack = new Stack(size); //max size = 11
		
		for(int i =0 ; i<size ; i++) {
			
			if(InputStr.charAt(i) == '(') {
				
				stack.push('(');
				
			}else if(InputStr.charAt(i) == ')') {
				
				stack.pop();
				
			}
		}	
			if(!stack.isEmpty()) {
				
				System.out.println("Invalid String.");
				
			}else {
				
				System.out.println("Valid String.");
			}
		
	}
}	
	

