import java.util.Scanner;

public class classwork1 {
	public static void main(String[] args) {
		Scanner name= new Scanner(System.in);
		String name1;
		String petName;
		int lenght;
		System.out.println("Enter your name: ");
		name1= name.nextLine();
		System.out.println("Enter your pet's name: ");
		petName= name.nextLine();
		lenght= petName.length();
		System.out.printf("%s, %s has %d characters.", name1, petName, lenght);
		
	}

}
