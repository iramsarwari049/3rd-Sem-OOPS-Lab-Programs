import java.util.*;
public class ToCheckPrime {
	public boolean checkPrime(int n) {
		boolean f = true;
		if (n==1) {
			System.out.println("Its Neither Prime nor Composite");
			System.exit(0);
		}
		else if (n<=0) {
			System.out.println("Not a valid number since not positive");
			System.exit(0);
		}
		for (int i=2; i<n; i++)
			if (n%i==0)
				f = false;
		return f;
	}
	public static void main (String[] args) {
		ToCheckPrime c = new ToCheckPrime ();
		System.out.println("\nEnter the number to be checked if Prime or not");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.close();
		if (c.checkPrime(n))
			System.out.println("Yes, It is a prime number");
		else 
			System.out.println("No, It is not a prime number");
	}
}