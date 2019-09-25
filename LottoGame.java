import java.util.Scanner;
import java.util.Random;
public class LottoGame { 
	public static void main(String[] args) {
		double budget = 99.99;
		double ticketCost = 1.45;
		Scanner in = new Scanner (System.in);

		System.out.println("LottoGame is a lotto game for you to play");
		System.out.printf("You have a bufget of $%.2f to spend%n", budget);

		System.out.println("would you like to play?");
		String answer = in.next();
		while(answer.equalsIgnoreCase("yes")) {
			if (budget>=ticketCost) {
				budget = budget -ticketCost;
				System.out.println("You have playes!");
				System.out.printf("You have $%.2f to spend%n", budget);
				if(play()) {
					System.out.println("you lost");
				}
			}
			else {
				System.out.println("not enough money, Go Make money and come back");
				break;

			}
			System.out.println("Awesome, Would you like to play again? Yes/No");
			answer=in.next(); 
		}
		System.out.println("ok, come back soon!");
		}
	public static boolean play() {
		Random rGen= new Random();
		int num = rGen.nextInt(2);

		return (num>0)? true:false;

	}


}


