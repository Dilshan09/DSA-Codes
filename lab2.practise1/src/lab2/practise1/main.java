package lab2.practise1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size=5;
		
		queuex mainQueue = new queuex(size);
		queuex evenQueue = new queuex(size);
		queuex oddQueue = new queuex(size);
		
		
		for(int i=0; i<size; i++){
			System.out.println("Enter transaction ID " + i + ": ");
			int temp = sc.nextInt();
			mainQueue.insert(temp);
			
				if(temp%2 == 0){
					evenQueue.insert(temp);
				}
				else{
					oddQueue.insert(temp);
				}
			}
		
		//displaying results
		//displaying pc1
		System.out.println("PC1");
		while(!evenQueue.isEmpty()){
			System.out.println("Transaction: " + evenQueue.remove());
		}

		//displaying PC2
		System.out.println("PC2");
		while(!oddQueue.isEmpty()){
			System.out.println("Transaction: " + oddQueue.remove());
		}
				
		
		
		
	}

}