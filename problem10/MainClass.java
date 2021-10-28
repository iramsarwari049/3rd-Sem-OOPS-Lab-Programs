import ISE.ISE_department;
public class MainClass{
	public static void main(String args[])
	{
		ISE_department ise = new ISE_department();
		ise.readdata();
		System.out.println("\nFaculty whose years of experience is aboce 20 : ");
		for (int i = 0; i < ise.number;i++)
		{
			if(ise.faculty[i].yoe > 20)
			{
				ise.printdata(i);
			}
		}
		System.out.println();
		ise.print_designations();
		ise.number_research_consultancy_projs();
	}
	
}