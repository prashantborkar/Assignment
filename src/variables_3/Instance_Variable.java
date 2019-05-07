package variables_3;

public class Instance_Variable {
	
	int x = 100;
	double d;
	String s;
	boolean b;
	float f;
	
	
	public static void main(String[] args) {
		
//		System.out.println(x); // we can not access 'x' because it not static type variable for main class.
		
		Instance_Variable Obj = new Instance_Variable();
		
		System.out.println(Obj.x); // By using object creation we can access all member function outside this class.
		System.out.println(Obj.d);
		System.out.println(Obj.s);
		System.out.println(Obj.b);
		System.out.println(Obj.f);
	}
	
	public void method() {
		System.out.println(x+" "+d+" "+s+" "+b+" "+f); // by using void method accessible.
	}

}