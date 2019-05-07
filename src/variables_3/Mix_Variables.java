package variables_3;

public class Mix_Variables {
	
	int x = 1000;               // Instance Reference --> Heap Area
	static String s = "Hello";  // Static Reference   --> Method Area
	
	public static void main(String[] args) {
		
		int[] a = new int[2];  // Local Reference    --> Stack Area
	}

}
