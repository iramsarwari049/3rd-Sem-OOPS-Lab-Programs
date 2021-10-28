import java.util.*;

public class Str5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the first string");
		String fStr = sc.nextLine();
		System.out.println("\nEnter the second string ");
		String sStr = sc.nextLine();
		fStr = fStr.toLowerCase();
		sStr = sStr.toLowerCase();
		if (fStr.equals(sStr))
			System.out.println("\nBoth strings are equal ");
		else
			System.out.println("\nStrings are not equal");
		sc.close();
	}
}

