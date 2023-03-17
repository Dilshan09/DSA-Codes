package lab3linklist;

public class LinkMain {
	
	public static void main (String[]args) {
		
		Link Nipuna = new Link("Nipuna" , 52.5);
		Link Aravinda = new Link("Aravinda" , 70.0);
		Link Prashani = new Link("Prashani" , 69.5);
		
		Nipuna.next = Aravinda;  //Nipuna.next.next = Prashani;
		Aravinda.next = Prashani;
		Prashani.next = null;
		
		Nipuna.displayDetails();
		Aravinda.displayDetails();
		Prashani.displayDetails();
	}

}
