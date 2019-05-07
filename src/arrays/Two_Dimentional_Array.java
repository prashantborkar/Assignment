package arrays;

public class Two_Dimentional_Array {

	public static void main(String[] args) {
		
		
		int[][] x = new int[2][2];
		
		x[0][0] = 2;
		x[0][1] = 3;
		x[1][0] = 4;
		x[1][1] = 5;
		
				
		int[][] y = {{1,2},{1,2}};  // This array is called as Anonymous Array.
			
		System.out.println(y[0]+" "+y[1]);
		
		
		System.out.println(x[0][0]+"   "+x[0][1]);
		System.out.println(x[1][0]+"   "+x[1][1]);
		
		// For Loop
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<2;j++)
			{
				System.out.print(x[i][j]+"   ");
			}
		}
		System.out.println("    ");
		
		// ForEach Method
		for(int[] x1:x) {
			System.out.println();
			for(int x2:x1) {
				System.out.print(x2+"   ");
			}
		}
 		
	}
	
}
