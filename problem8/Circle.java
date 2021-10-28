import java.util.*;

public class Circle {
	float r;

	Circle(float r) {
		this.r = r;
	}

	float calcArea() {
		float area = (float) (3.14 * r * r);
		return area;
	}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the radius of circle");
		float r=sc.nextFloat();
		Circle cir=new Circle(r);
		System.out.println("The area of the circle is "+cir.calcArea());
		System.out.println("Enter the value of theta in radian");
		float radian=sc.nextFloat();
		Sector sec = new Sector(r,radian);
		System.out.println("The area of the sector is "+sec.calcArea());
		System.out.println("Enter the value of length");
		float l=sc.nextFloat();
		Segment seg = new Segment(r,l);
		System.out.println("The area of the Segment is "+seg.calcArea());
		sc.close();
	}
}

class Sector extends Circle {
	float radian;
	Sector(float r,float radian) {
		super(r);
		this.radian = radian;
	}
	
	float calcArea() {
		float area = (float) (0.5 * radian * r * r);
		return area;
	}
}

class Segment extends Circle {
	float l;

	Segment(float r,float l) {
		super(r);
		this.l = l;
	}

	float calcArea() {
		float area=(float) ((r*r)*((r-l)/r)-(r-l)*Math.pow((2*r*l-(l*l)),0.5));
		return area;
	}
}
