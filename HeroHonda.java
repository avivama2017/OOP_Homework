package OOP_Homework;

public class HeroHonda extends Bikes {

	@Override
	public void engine() {
		System.out.println("Bikes have Engine ");
		
	}

	@Override
	public void wheels() {
		System.out.println("Bikes have whells");
		
	}

	public static void main(String[] args) {
		
		HeroHonda herohonda = new HeroHonda();
		herohonda.engine();
		herohonda.wheels();
		herohonda.seat();
		herohonda.handle();
	}

}
