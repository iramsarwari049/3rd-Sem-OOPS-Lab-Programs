package ISE;
import java.util.Scanner;
interface Department {
	public void readdata();
	public void printdata(int i);
	public void print_designations();
	public void number_research_consultancy_projs();
}
class AgeException extends Exception{
	private int age;
	public AgeException(int age)
	{
		this.age = age;
	}
	public String toString(){
		return "Age is over 58";
	}
}

public class ISE_department implements Department
{
	public Faculty faculty[];
	public int number;
 	public ISE_department(){}
		
	public void readdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of faculty : ");
		number = sc.nextInt();
		faculty = new Faculty[number];
		for (int i = 0; i < number;i++)
		{
			System.out.println("Enter Details of faculty member : " + (i + 1));
			faculty[i] = new Faculty();
			try{
				if (faculty[i].age > 58)
				{
					throw new AgeException(faculty[i].age);
				}
			} catch(AgeException e)
			{
				System.out.println("Error :" + e);
				System.exit(0);
			}
		}
		
	}
	public void printdata(int i){
		// i is index
			System.out.println("Faculty Details");
			System.out.println("Name : " + faculty[i].membername + "\tDesignation : " + faculty[i].designation + "Years of experience " + faculty[i].yoe);
			System.out.println("Join date  : " + faculty[i].joinDate + "\tSubjects taught : " + faculty[i].subjects );
			
		
	}
	public void print_designations()
	{
		for(int i = 0; i < number; i++)
		{
			System.out.println("Faculty Designations : ");
			System.out.println("Name : " + faculty[i].membername + "\tDesignation : " + faculty[i].designation );
 			
		}
	}
	public void number_research_consultancy_projs()
	{
		int count = 0;
		for(int i = 0; i < number; i++)
		{
			if(faculty[i].project) {count++;}
			
		}
		System.out.println("\nNumber of faculty working on research Consultancy projects : " + count);
		
		
	}
} 
