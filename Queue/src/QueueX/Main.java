package QueueX;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueX printerQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);

		int inputs;
		Scanner id = new Scanner (System.in);
		
		for(int i = 1 ; i <= 5 ; i++) {
			
				System.out.print("Enter transaction ID "+i+" : ");
				inputs = id.nextInt();
				printerQueue.insert(inputs);
				
				int val = inputs % 2;
				
				if(val == 0) {
					evenQueue.insert(inputs);

				}else {
					oddQueue.insert(inputs);

				}
				

		}
		
		System.out.println("\nEven Queue :");
		evenQueue.display();
		
		System.out.println("\n\n");

		System.out.println("Odd Queue :");
		oddQueue.display();
	}
		
//		QueueX evenQueue  = new QueueX (inputs);
	}


