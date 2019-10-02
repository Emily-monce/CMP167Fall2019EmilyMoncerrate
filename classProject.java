import java.util.Scanner;
public class classProject {
	public static void main(String[] args) {
		int num1;
		int num2;
		int numTotal;
		
		Scanner num = new Scanner (System.in);
		System.out.println("Enter Number:");
		num1 = num.nextInt();
		System.out.println("Enter Second Number:");
		num2 = num.nextInt();
		numTotal = num1 + num2;
		System.out.println(numTotal);
		
	}
}
