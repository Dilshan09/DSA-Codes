package lab1.practice1;

public class checkSlash {

	private String InSlash; //    KL/LM/||
							//    KL/LM/|
	
	public checkSlash(String slash) {
		
		InSlash = slash;
		
	}
	
	public void checkS() {
		
		int size = InSlash.length();
		Stack stack = new Stack(size);
		
		for(int i = 0; i<size ; i++) {
			
			if(InSlash.charAt(i) == '/') {
				
				stack.push('/');
				
			}else if(InSlash.charAt(i) == '|') {
				
				stack.pop();
				
			}
		}
		
		if(!stack.isEmpty()) {
			System.out.println("Invalid String");
		}else {
			System.out.println("Valid String");
		}
		
	}
}
