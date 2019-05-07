public class Split {
	 
	public static void main(String[] args) {
		
		String s = new String("     Hello my name is abc");
		
		
		String Space = s.trim();
		
		System.out.println("Returning string : "+Space);
		System.out.println("abchjd");
		
		String Words[] = Space.split(" ");
		
		for(String a: Words) {
			
			System.out.println(a);
			
		}
		
		System.out.println("The number of words above sentence : "+Words.length);
		
	} 
}
