package ISE;
import java.util.Scanner;
public class Faculty{
	public String membername;
	public	String designation;
	public 	int yoe; // years of experience;
	public int age;
	public 	int joinDate; // in year
	public	String subjects;
	public boolean project;
	
	
	public Faculty()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		membername = sc.nextLine();
		System.out.print("Enter age : ");
		age = sc.nextInt();  // Consume newline left-over

		System.out.print("Enter Designation : ");
		sc.nextLine();
		
		designation = sc.nextLine();
		System.out.print("Enter Years of experience : ");
		yoe = sc.nextInt();
		System.out.print("Enter joining date (year): ");
		joinDate = sc.nextInt();
		System.out.print("Enter Subject handled (single string): ");
		sc.nextLine();
		
		subjects = sc.nextLine();
		System.out.print("Working as research consultant? (1.YES , 0.NO)");
        project = (sc.nextInt() == 1)  ? true : false;
 		
	}
}