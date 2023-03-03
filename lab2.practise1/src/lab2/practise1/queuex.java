package lab2.practise1;

public class queuex {

	private int QueueArr[];
	int maxSize;
	int rear;
	int front;
	int noItems;
	
	//functions
	public queuex(int max) {
		super();
		this.maxSize = max;
		QueueArr = new int [maxSize];
		this.rear = -1;
		this.front = 0;
		this.noItems = 0;
	}
	
	public boolean isFull(){
		return(rear == (maxSize-1));
	}
	
	public boolean isEmpty(){
		return(noItems == 0);
	}
	
	public void insert(int num){
		
		if(!isFull()){
			QueueArr[++rear] = num;
			noItems++;
		}
		else{
			System.out.println("Queue is full!");
		}	
	}
	
	public int remove(){
		if(!isEmpty()){
			noItems--;
			return QueueArr[front++];
		}
		else{
			System.out.println("Queue is empty!");
			return 0;
		}
	}
	
}
