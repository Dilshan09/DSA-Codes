package lab2.practice3;

public class QueueX {
		
        //      ************************* Circular Queue *************************
	
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
		return (noItem == maxSize);
		
	}
	
	public void insert(int v) {
	if(!isFull()) {
	
		if(reare == (maxSize - 1)) {
			reare = -1;
			
		}
		queArr[++reare] = v;
		noItem++;
	
	}else {
		System.out.println("Leaniear queue is Full");
	}
	
	}
	
	public int remove() {
		if(!isEmpty()) {
		
		int temp = queArr[front++];
		if(front == maxSize) {
			front = 0;	
		}
			noItem--;
			return temp;
		
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
