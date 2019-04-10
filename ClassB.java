package OOP_Homework;

public class ClassB extends ClassA {
	
	
	
	
	/*
	 * int a = 100; int b = 200;
	 * 
	 * public void add() {
	 * 
	 * System.out.println(a+b);
	 * 
	 * }
	 */
	 
	 
//If same class members available in both class than local class or Home class members are first priority to execute.
	// Example if you uncomment this code it will return the result 100 and 300. not 10 and 30.
	
	public static void main(String[] args) {
		
		
		ClassB objB = new ClassB();
		System.out.println(objB.a);//10
		objB.add();//30
	}

}
