package language_fundamentals;

public class Hexa_Decimal {
	
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 010;
		int z = 0x10;
//		int a = 0786; In this value 8 contains that why it shows error.
		int a = 0777; // Valid number for hexadecimal places.
		int b = 0xBeef;
//		int b = 0xBeer; In this case "r" letter is greater so it take upto "f" character.
		
		
		// This are the integral literal of hexadecimal value.
		// This supports only 0 to 7 digit.
		
		System.out.println(x+"  "+y+"  "+z);
		
		System.out.println(a+"  "+b);
		
		
		
	}

}
