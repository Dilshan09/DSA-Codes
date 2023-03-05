package lab2.practice4;

public class QueueX {

	private int queArr[];
	private int maxSize;
	private int front;
	private int reare;
	private int nItems;
	
	public QueueX (int no) {
		this.maxSize = no ;
		this.queArr = new int [maxSize];
		this.front = 0;
		this.reare = -1;
		this.nItems = 0;
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return(nItems == maxSize);
	}
	
	public void insert (int n) {
		
		if(!isFull()) {
			if(reare == (maxSize-1)) {
				reare = -1;
			}
			queArr[++reare] = n;
			nItems++;
		}else {
			System.out.println("Queue is Full.");
		}
	}
	
	public int remove() {
		
		if(!isEmpty()) {
			
			int temp = queArr[front++];
			
			if(front == maxSize) {
				front = 0;
			}
			
			nItems--;
			return temp;
			
		}else {
			System.out.println("Queue is Empty.");
			return -99;
		}
	}
	
	public int peak() {
		if(!isEmpty()) {
			
			return queArr[front];
			
		}else {
			System.out.println("Queue is Full.");
			return -99;
		}
	}
}
