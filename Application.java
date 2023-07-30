
public class Application {

	public static void main(String[] args) {
		
		Status status = Status.NOT_STARTED;
		Task t = new Task("Appointment", 5, status);
		System.out.println(t.toString());
		t.setPriority(5);
		System.out.println(t.toString());
		
		Process p = new Process("541th", 1);
		System.out.println(p.getPriority());
		System.out.println(p.toString());
		Process b = new Process("432t", 10);
		System.out.println(p.compareTo(b));
		System.out.println(b.compareTo(p));
		
		Task c = new Task("Hair Cut", 5, status);
		System.out.println(c.compareTo(t));
		System.out.println(t.compareTo(c));
		t.setPriority(10);
		System.out.println(c.compareTo(t));
		System.out.println(t.compareTo(c));
		

	}//end main

}//end class
