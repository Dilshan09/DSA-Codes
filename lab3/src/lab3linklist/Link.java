package lab3linklist;

public class Link {
	
	public String name;
	public double avg;
	public Link next;
	
	//parameterized constructor
	public Link (String name , double avg) {
		this.name = name;
		this.avg = avg;
		this.next = null;
	}
	
	public void displayDetails() {
		System.out.println("Nmae : \t"+name+"\t|| Avg : \t"+avg);
	}

}
