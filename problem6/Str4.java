import java.util.Arrays;
import java.util.Scanner;

public class Str4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a string ");
		String str = sc.nextLine();
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		sc.close();
		System.out.println(new String(charArray));
	}
}

