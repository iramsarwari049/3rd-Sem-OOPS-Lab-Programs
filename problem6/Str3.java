import java.util.*;

public class Str3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the string ");
		String str = sc.nextLine();
		System.out.println("\nEnter the string to be replaced ");
		String oldstr = sc.nextLine();
		System.out.println("\nEnter the new string ");
		String newstr = sc.nextLine();
		sc.close();
		String replaced = str.replace(oldstr, newstr);
		System.out.println("\nReplaced string: " + replaced);
	}
}