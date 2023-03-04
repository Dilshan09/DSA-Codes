package lab2.practise2;

public class QueueX {
                                //      ************************* Linear Queue *************************
	private int queArr[];
	 int maxSize;
	 int front;
	 int reare;
	 int noItem;
	
	public QueueX(int s) {
		
		this.maxSize = s;
		queArr = new int [maxSize];
		this.front = 0;
		this.reare = -1;
		this.noItem = 0;
	}
	
	public boolean isEmpty() {
		return (noItem == 0);
	}
	
	public boolean isFull() {
		return (reare == (maxSize-1));
	}
	
	public void insert(int v) {
		if(!isFull()) {
			
			queArr[++reare] = v;
			noItem++;
			
		}else {
			System.out.println("Leaniear queue is Full");
		}
	}
	
	public int remove() {
		if(!isEmpty()) {
			noItem--;
			return queArr[front++];
			
		}else {
			System.out.println("Leaniear queue is Empty");
			return 0;
		}
		
	}
	
	public int peakFront() {
		if(!isEmpty()) {
			
			return queArr[front];
			
		}else {
			System.out.println("Leaniear queue is Empty");
			return 0;
		}
		
	}
	
}
