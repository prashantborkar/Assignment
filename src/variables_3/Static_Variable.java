package variables_3;

public class Static_Variable {

	static int x = 101;
	static String s;
	static float f;
	static double d;
	static boolean b;
	
	public static void main(String[] args) {
		
		System.out.println(Static_Variable.x); // We can us Static member directly by using only class name.
		System.out.println(Static_Variable.s);
		System.out.println(Static_Variable.f);
		System.out.println(Static_Variable.d);
		System.out.println(Static_Variable.b);
	}
	
	public void m1() {
		System.out.println(x);
	}
}
