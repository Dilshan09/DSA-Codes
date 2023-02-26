package lab1.practice2;

public class checkM {
	
	private String check;     //  MNMN
	                          //  MMN
	public checkM(String ch) {
		
		check = ch;  
	}

	public void checkMN() {
		
		int size = check.length();
		Stack stack = new Stack(size);
		
		for (int i  = 0 ; i < size ; i++) {
			
			if(check.charAt(i) == 'M') {
				stack.push('M');
				
			}if(check.charAt(i) == 'N') {
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) { 
			System.out.println("Invalid");
			
		}else {
			System.out.println("Valid");
		}
	}
}
