import java.util.Scanner;
public class classWork3 {
	public static void main(String []args) {
		Scanner scnr= new Scanner(System.in);
		int input;
		int result=0;
		System.out.println("Enter a number: ");
		input = scnr.nextInt();
		
		for (int i= 1; i <= input; i++) { 
			if ( i % 2 == 0 ) {
				result= result + i;
				
				}
			}
		System.out.println(result);
		
				
			
	        
	    
	    
		
				
	}

}
