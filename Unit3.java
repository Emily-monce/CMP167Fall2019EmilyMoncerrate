import java.io.PrintWriter;
import java.io.StringWriter;


public class Unit3 {
	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.print("Celine Dion");
		String name =sw.toString();
		System.out.println(name);
		System.out.printf("her name was %10s", name);
		
		
		
		
				
	}
}
