package arrays;

public class Create_Array {
	
	// One Dimensional Array
	
	public static void main(String[] args) {
		
		int[] x = new int[2]; // Array size on 2 index not more than 2.
		
		x[0] = 1;
		x[1] = 2;
//		x[2] = 3;  Its shows error java.lang.ArrayIndexOutOfBoundsException:  
		
		System.out.println(x); // Its shows the araryId. Format : Classname@hashcode-in-hexadecimal.
		
		System.out.println(x[0]+"  "+x[1]+"   "+x[1]);
		
		
		
		
	}

}
