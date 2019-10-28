import java.util.Scanner;
public class callWork2 {
	public static void  main(String [] args ) {
		Scanner num= new Scanner (System.in);
		double input= 0;
		double total= 1.0;
		double num1 = 0;
		System.out.println("Enter a number to find the factorial:");
		input= num.nextDouble();
		for (int i = 1; i <= input; i++) {
			total = total * i;
			
		
			
			
			
		}
		System.out.println(total);
	}

}
