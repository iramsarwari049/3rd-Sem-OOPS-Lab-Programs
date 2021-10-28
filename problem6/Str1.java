import java.util.*;

public class Str1 {

	static int count(String str, String word) {

		String[] a = str.split(" ");
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i]))
				c++;
		}

		return c;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);


		System.out.println("\n\nExtract a portion of string");
		System.out.println("\nEnter a string");
		String str1 =sc.nextLine();
		System.out.println("\nEnter position reference base 1");
		int m=sc.nextInt();
		System.out.println("\nEnter number of characters");
		int n=sc.nextInt();
		char[] cArr1=str1.toCharArray();
		char[] extPor=new char[n];
		for(int i=m-1;i<m-1+n;i++)
			extPor[i-m+1]=cArr1[i];
		String extPorString=new String(extPor);
		System.out.println(extPorString);


		System.out.println("\n\nCount occourances of a word");
		System.out.println("\nEnter a string");sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("\nEnter the word to be found");
		String word = sc.next();
		System.out.println("\nThe number of times the word occurs is " + count(str2, word));


		System.out.println("\n\nReplace a portion of string");
		System.out.println("\nEnter a string");sc.nextLine();
		String str3 = sc.nextLine();
		System.out.println("\nEnter the string to be replaced ");
		String oldstr = sc.nextLine();
		System.out.println("\nEnter the new string ");
		String newstr = sc.nextLine();
		String replaced = str3.replace(oldstr, newstr);
		System.out.println("\nReplaced string: " + replaced);


		System.out.println("\n\nSort the string");
		System.out.println("\nEnter a string ");
		String str4 = sc.nextLine();
		char[] cArr4 = str4.toCharArray();
		Arrays.sort(cArr4);
		System.out.println(new String(cArr4));

		
		
		System.out.println("\n\nCompare two strings ignore case");
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



		System.out.println("\n\nConcatenate the two strings");
		System.out.println("\nEnter the first string");
		String one = sc.nextLine();
		System.out.println("\nEnter the second string");
		String two = sc.nextLine();
		String three = one.concat(two);
		System.out.println("\nConactenated two strings \nThe string is now " + three);
		
		sc.close();
	}              
}
