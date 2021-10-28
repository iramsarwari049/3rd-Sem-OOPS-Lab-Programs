import java.util.Scanner;

public class Str6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the first string");
		String one = sc.nextLine();
		System.out.println("\nEnter the second string");
		String two = sc.nextLine();
		String three = one.concat(two);
		System.out.println("\nConacttenated two strings \nThe string is now " + three);
		sc.close();
	}

}
