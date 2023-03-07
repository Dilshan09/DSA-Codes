package QueueX;
                                        ///       *********************  Linear Queue  *********************
public class QueueX {

	private int queArr[];
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	
	public QueueX(int size) {
		
		this.maxSize = size;
		this.queArr = new int [maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
		
	}
	
	public boolean isEmpty() {
		
		return (nItems == 0);
		
	}
	
	public boolean isFull() {
		
		return (rear == (maxSize -1));
		
	}
	
	public void insert(int s) {
		
		if(!isFull()) {
			queArr[++rear] = s;
			nItems++;
		}else {
			System.out.println("Queue is Full");
		}
	}
	
	public int remove() {
		
		if(!isEmpty()) {
			nItems--;
			return queArr[front++];
		}else {
			System.out.println("Queue is Empty");
		}
		return 0;
	}
	
	public int peak() {
		
		if(!isEmpty()) {
			return queArr[front];
		}else {
			System.out.println("Queue is Empty");
		}
		return 0;
	}
	
	public void display() {
		 
		do {
			System.out.println(queArr[rear]);
			rear--;
		}while(rear>=0);
	}
	
	
}
