import java.util.*;
public class FiboWithRecurr {
	static int t1=0, t2=1, t3=0;
	static void printFibo(int c) {
		if (c>0) {
			t3 = t1+t2;
			t1=t2;
			t2=t3;
			System.out.print("\t"+t3);
			printFibo(c-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter the number of Fibonacci you want ");
		int c = sc.nextInt();
		sc.close();
		System.out.println("The first "+c+" terms are");
		System.out.print(t1+"\t"+t2);
		printFibo(c-2);
		System.out.println();
	}
}
