package OOP_Homework;

public abstract class Bikes {
	
	
	
	
	public void handle() {
		System.out.println("Bikes have handle");
	}
	public void seat() {
	System.out.println("Bikes have seats");
}
	public abstract void engine();
	
	
	public abstract void wheels();
	
	
	public static void main(String[] args) {
	
		HeroHonda  herohonda = new HeroHonda();
		herohonda.engine();
		herohonda.handle();
		herohonda.seat();
		herohonda.wheels();
	
		
		
		
		
	}

}