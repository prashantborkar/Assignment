package arrays;

public class Anonymous_Array {
	
	public static void main(String[] args) {
		
		sum(new int[] {100,200,30,20,10,0});
		
	}
	
	public static void sum(int[] x) {
		
		int total = 0;
		for(int a:x) {
			
			total = total + a;
			
		}
		
		System.out.println("The Sum of array :"+total);
		
		
	}

}
