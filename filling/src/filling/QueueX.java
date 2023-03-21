package filling;

public class QueueX {
	
    //      ************************* Circular Queue *************************

private char queArr[];
int maxSize;
int front;
int reare;
int noItem;

public QueueX(int s) {

	this.maxSize = s;
	queArr = new char [maxSize];
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

public void insert(char id) {
if(!isFull()) {

	if(reare == (maxSize - 1)) {
		reare = -1;
		
	}
	queArr[++reare] = id;
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
