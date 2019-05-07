package variables_3;

public class Static_Object {

	static int a = 10;
		   int b = 100;
		   
		   public static void main(String[] args) {
			
			   Static_Object s1 = new Static_Object();
			   
			   s1.a = 1000; // only for static member it override the value.
			   s1.b = 1001; // This 'b' is same where i intialize value even it written as outside of this class because of static 
			   
			   Static_Object s2 = new Static_Object();
			   
			  System.out.println(s2.a+"  "+s2.b);
		}
}
