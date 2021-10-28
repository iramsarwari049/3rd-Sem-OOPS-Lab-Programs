import java.util.*;
public class Matrix {
	static int sum, r1, c1, r2, c2;
	static int [][] a, b, c;
	static Scanner sc = new Scanner(System.in);
	Matrix() {
		System.out.println("\nEnter the number of rows and columns of first matrix");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		System.out.println("\nEnter the number of rows and columns of second matrix");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		a = new int[r1][c1];
		b = new int[r2][c2];

	}
	public static void main(String[] args) {
		
		Matrix m = new Matrix();
		
		if (c1 != r2) {
			System.out.println("\nMatrix multiplication not possible");
			System.exit(0);
		}
		mulMatrix();
		m.display();
		sc.close();
	}
	
	void display() {
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}

	static void mulMatrix() {
		System.out.println("\nEnter the elements of matrix one");
		for (int i = 0; i < r1; i++)
			for (int j = 0; j < c1; j++)
				a[i][j] = sc.nextInt();

		System.out.println("\nEnter the elements of matrix two");
		for (int i = 0; i < r2; i++)
			for (int j = 0; j < c2; j++)
				b[i][j] = sc.nextInt();
		c = new int[r1][c2];
		System.out.println("\nThe matrix will be of " + r1 + "*" + c2);
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				sum = 0;
				for (int k = 0; k < c1; k++)
					sum = sum + a[i][k] * b[k][j];
				c[i][j] = sum;
			}
		}
	}
}