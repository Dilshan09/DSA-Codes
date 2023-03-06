package lab2.practice3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System .in);
		
		QueueX q1 = new QueueX(5);
		QueueX q2 = new QueueX(5);
		QueueX q3 = new QueueX(5);
		
		for( int  i = 0; i<5 ; i++){
			
			System.out.print("Enter inputs : ");
			int inputs = sc.nextInt();
			q1.insert(inputs);
			
			int val = inputs %2 ;
			
			
			if(val == 0) {
				q2.insert(inputs);
			}
			if(val == 1) {
				q3.insert(inputs);
			}
		}
		
		System.out.println("\n\nEven\n");
		while(!q2.isEmpty()) {
			int val1 = q2.remove();
			System.out.println(val1);
		}
		
		System.out.println("\n\n");
		
		System.out.println("Odd\n");
		while(!q3.isEmpty()) {
			int val2 = q3.remove();
			System.out.println(val2);
		}
		
	}

}
