package lab3linklist;

public class Linkedlist {
	private Link first;
	
	public Linkedlist() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	//insert first method
	public void insertFirst(String name, double avg) {
		Link newLink = new Link(name, avg); //creating new link
		newLink.next = first; //link new link to existing link
		first = newLink; //assign new link as first;
		
	}
	
	public Link deleteFirst() {
		Link temp = first;  //save the reference of the first to the tempt
		first = first.next;  //change the first reference to next available link
		return temp;
	}
	
	public void displayList() {
		
		Link current = first;  //in order to start from the begining
		
		while(current != null) {
			current.displayDetails();  //printing the links
			current = current.next; //moving to the next link
		}
	}
}
