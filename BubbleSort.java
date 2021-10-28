import java.util.*;
public class BubbleSort {
	void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1]; a[j + 1] = t;
				}
	}
	void printArray(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; ++i)
			System.out.print(a[i] + "\t");
		System.out.println();
	}
	public static void main(String[] args) {
		BubbleSort ob = new BubbleSort();
		Scanner sc =new Scanner(System.in);
		System.out.println("\nEnter the size of the array : ");
		int n=sc.nextInt(); int[] a= new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		ob.bubbleSort(a);
		System.out.println("The Sorted array");
		ob.printArray(a); sc.close();
	}
}

