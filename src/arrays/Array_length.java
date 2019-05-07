package arrays;

public class Array_length {
	
	public static void main(String[] args) {
		
		String[] s = {"Alpha","Beta","Gyma","Delta"};
		
		System.out.println(s.length); // This is also the method to do print Length off String in Array.
		
		System.out.println("   ");
		
		System.out.println(s[1].length());
		
		System.out.println("   ");
		
		System.out.println(s[0]+"  "+s[1]+"  "+s[2]+"  "+s[3]);
		
		System.out.println("   ");
		
		// By Using ForEach Loop we can also print String.
		for(String s1:s) {
			
			System.out.println(s1);
			
		}
	}

}
