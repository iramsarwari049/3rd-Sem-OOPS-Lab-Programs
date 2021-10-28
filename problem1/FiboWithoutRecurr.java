import java.util.*;
public class FiboWithoutRecurr {
	public static void main (String[] args) {
		Scanner sc =new Scanner (System.in);
		FiboWithoutRecurr fib = new FiboWithoutRecurr ();
		System.out.println("\nEnter the number of Fibonacci you want");
		int n = sc.nextInt();
		sc.close();
		fib.fiboWithoutRecurr(n);
	}

	public void fiboWithoutRecurr(int n) {
		int t1=0, t2=1;
		System.out.println("The first "+n+" terms are ");
		for(int i=1; i<=n; i++) {
			System.out.print(t1+"\t");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		System.out.println();
	}
}
