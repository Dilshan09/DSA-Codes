package lab2.practise2;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		
		QueueX printerQueue = new QueueX(5);
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<5 ; i++) {
			System.out.print("Get user inputs : ");
			int input = sc.nextInt();
			printerQueue.insert(input);
			
			if(input%2 == 0) {
				evenQueue.insert(input);
			}else {
				oddQueue.insert(input);
			}
		}
		
		System.out.println("\n\n");

		System.out.println("PC1");
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction : " + evenQueue.remove());
		}
		
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
			System.out.println("Transaction : " + oddQueue.remove());
		}
		
		}
	}


