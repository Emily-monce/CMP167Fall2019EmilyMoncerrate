import java.util.Scanner;

public class abreviations {
	public static void main(String[] args) {
	Scanner scnr= new Scanner(System.in);	

	System.out.println("Enter The SMS abbrevation; ");
	String abbreviation= scnr.nextLine();
	
	String LOL="laughing out loud";
	String BFF="Best friend forever";
	String TMI="Too much information"; 
	String translation= "";
	if (abbreviation.equalsIgnoreCase("LOL")) {
		System.out.println(LOL);
		}
	else if (abbreviation.equalsIgnoreCase("BFF")) {
		System.out.println(BFF);
	}
	else if (abbreviation.equalsIgnoreCase("TMI")) {
		System.out.println(TMI);
	}
	else {
		System.out.println("Unknown Abbreviation");
	}
	
	} 
	
	
	
	
	

}
