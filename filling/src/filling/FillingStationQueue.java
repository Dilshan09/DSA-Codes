package filling;

import java.util.Scanner;

public class FillingStationQueue {
    
    public static void main(String []args) {
    	
    	
    	int count1 = 0;
    	int count2 = 0;
    	int count3 = 0;
    	
    	QueueX qu1 = new QueueX (5);
    	QueueX qu2 = new QueueX (5);
    	QueueX qu3 = new QueueX (5);
    	
    	Scanner sc = new Scanner (System.in);
    	
    	for(int i = 0;i<5; i++) {
    		System.out.println("Enter three digit no : ");
        	String id = sc.next();
        	
        	if(id.length() != 3) {
        		System.out.println("Invalid input");
        		i--;
        	}
        	
        	else {
        		
        		int num = Integer.parseInt(id); // convert string to int
        		if(num % 10 == 1) {
        			qu1.insert((char) num);
        			count1++;
        		}
        		
        		if(num % 10 == 2) {
        			qu2.insert((char) num);
        			count2++;
        		}
        		
        		if(num % 10 == 3) {
        			qu3.insert((char) num);
        			count3++;
        		}
        		
        	}
    	}
	
    	if(!qu1.isEmpty()) {
    		qu1.remove();
    		System.out.println("Queue1 Count is "+ count1);
    	}
    	
    	if(!qu2.isEmpty()) {
    		qu2.remove();
    		System.out.println("Queue2 Count is "+ count2);
    	}
    	
    	if(!qu3.isEmpty()) {
    		qu3.remove();
    		System.out.println("Queue3 Count is "+ count3);
    	}
    }

	
}
