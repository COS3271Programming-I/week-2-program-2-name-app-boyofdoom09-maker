

package test;
import java.util.Scanner;
public class Im {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter your first name");
		String first = scanner.nextLine();
		System.out.println("Enter your middle name");
		String middle = scanner.nextLine();
		System.out.println("Enter your last name");
		String last = scanner.nextLine();
		char j = '\u2713';
		System.out.printf("%s %s %s, you're doing great. %s %n", first, middle, last, j);

		
		
	}

}
