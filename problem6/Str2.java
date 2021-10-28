import java.util.*;

public class Str2 {

	static int count(String str, String word) {

		String[] a = str.split(" ");
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i]))
				c++;
		}

		return c;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput a string ");
		String str = sc.nextLine();
		System.out.println("\nInput the word to be found");
		String word = sc.next();
		sc.close();
		System.out.println("\nThe number of times the word occurs in String is " + count(str, word));
	}
}
