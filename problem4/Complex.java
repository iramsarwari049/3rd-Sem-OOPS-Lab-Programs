import java.util.Scanner;
public class Complex {
	float x1,x2,y1,y2,r,im;
	Scanner sc=new Scanner(System.in);
	Complex () {
		System.out.println("\nEnter the real and imaginary parts of first number");
		x1=sc.nextFloat(); y1=sc.nextFloat();
		System.out.println("\nEnter the real and imaginary parts of second number");
		x2=sc.nextFloat(); y2=sc.nextFloat();
	}
	void addComplex() {
		r=x1+x2; im=y1+y2;
		System.out.println("\nThe result of Addition is "+r+"+i("+im+")");
	}
	void subComplex() {
		r=x1-x2; im=y1-y2;
		System.out.println("\nThe result of Subtraction is "+r+"+i("+im+")");
	}
	void mulComplex() {
		r=x1*x2-y1*y2; im=x1*y2+x2*y1;
		System.out.println("\nThe result of Multiplication is "+r+"+i("+im+")");
	}
	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		int i; boolean f = true;
		Complex c= new Complex ();
		while (f) {
			System.out.println("\n1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("Any other number to exit");
			System.out.print("Enter your Choie : ");
			i=s.nextInt();
			switch (i) {
				case 1:
				c.addComplex();
				break;
				case 2:
				c.subComplex();
				break;
				case 3:
				c.mulComplex();
				break;
				default:
				f = false;
				break;
			}
		}s.close();
	}
}