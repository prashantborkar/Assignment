package arrays;

public class Aurgument_A {

	public static void main(String[] args) {
		
		String[] argh = {"x","y","z"};
		
		args = argh; // Store args array by using argh.
		
		for(String s : args) {
			System.out.println(s);
		}
	}
}
