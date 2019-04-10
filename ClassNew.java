package OOP_Homework;

public class ClassNew implements Interface1{

	
	public void engine() {
		System.out.println("Bikes have Engine");
		
	}


	public void wheel() {
		System.out.println("Bikes have Wheels");
	}

	
	public void seat() {
		
		System.out.println("Bikes have Seat");	
	}

	
	public void handle() {
		
		System.out.println("Bikes have handle");
	
	}
	public static void main(String[]args ) {

		ClassNew classnew = new ClassNew();
		
		classnew.engine();
		classnew.wheel();
		classnew.seat();
		classnew.handle();
		
	}

}
