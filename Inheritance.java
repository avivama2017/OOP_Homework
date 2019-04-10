package OOP_Homework;

public class Inheritance {
	//create / declare static variables
	
	static int a = 10, b= 20;
	
	// create/ declare non static variable
	
	int c = 30, d = 40;
	
	//create  static method with returning a value
	
	
	public static int add() {
		int result = a+b;
		return result;
	}
	
	//create  static method without returning any value
	
	public static void multyply() {
		
		System.out.println(a*b);
	}
	
    //create  non static method with returning a value
	
	public int add2() {
		
	int res = c+d;
	return res;
	}
	// create non static method without returning any value
	public  void    multiply2() {
		System.out.println(c*d);
		
		
	}
	
	
public static void main (String []args) {
	
	// Access static class members
	
	System.out.println(Inheritance.a);//10
	int x = Inheritance.add();
	System.out.println(x);//30
	Inheritance.multyply();//200
	
	
	
	//Access non static class members
	
	Inheritance obj = new Inheritance();
	System.out.println(obj.c);//30
	
	int y = obj.add2();
	System.out.println(y);//70
    obj.multiply2();//1200
	
	
}
}
