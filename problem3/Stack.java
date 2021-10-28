import java.util.*;
public class Stack {
	int top, max;
	int[] a;
	Stack (int n) {
		top = -1;
		max = n;
		a= new int[max];
	}
	void push () {
		if (top ==(max-1))
			System.out.println("\nStack Overflow\n");
		else {
			System.out.print("\nEnter the Element you want to push : ");
			Scanner sc = new Scanner (System.in);
			a[++top] = sc.nextInt();
		}
	}
	int pop () {
		return a[top--];
	}
	void display () {
		System.out.print("\nThe elements are : [ ");
		for(int i=0; i<=top; i++)
			System.out.print(a[i]+" ");
		System.out.println("]\n");
	}
	public static void main (String[] args) {
		int i=0 ,s; boolean f = true;
		Scanner sc = new Scanner (System.in);
		System.out.print("\nEnter the max size of Stack : ");
		s = sc.nextInt();
		Stack w = new Stack (s);
		while (f) {
			System.out.println("\n1. Pop\n2. Push\n3. Display");
			System.out.println("Any other number to exit");
			System.out.print("Enter your choice : ");
			i = sc.nextInt();
			switch (i) {
				case 1:
				if (w.top == -1) 
					System.out.println("\nStack Underflow\n");
				else
					System.out.println("\nElement poped is : "+w.pop());
				break;
				case 2:
				w.push(); break;
				case 3:
				w.display(); break;
				default:
				f = false; break;			
			}
		}sc.close();
	}
}