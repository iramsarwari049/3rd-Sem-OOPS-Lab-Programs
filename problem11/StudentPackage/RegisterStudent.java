package StudentPackage;

import java.util.Scanner;


 class CreditException extends Exception{
 	private int credits;

	CreditException(int credits) {
		this.credits = credits;
	}

	public String toString() {
		return "credits Exception Credit greater Than 30 i.e [" + credits + "]\n";
	}
} 
public class RegisterStudent implements Student {
   public  String name,usn;   public String branch;
  public  int credit;
    public int sub1[] = new int[5] ,sub2[] = new int[5] ,sub3[] = new int[5] ,sub4[] = new int[5];
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name:");
        name = sc.nextLine();
        System.out.print("Enter Usn:");
        usn = sc.nextLine();
        System.out.print("Enter Branch:");
        branch = sc.nextLine();
        System.out.print("Enter Credits:");
        try
        {
        credit = sc.nextInt();
        if (credit > 30 )
        {   sc.close();
            throw new CreditException(credit);
        }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
			System.exit(0);
        }
        

        
        System.out.println("Enter Sub 1 marks for all sems:");
        for(int j = 0 ; j < 4;j++)
        {
            int temp = sc.nextInt();
            sub1[j] = temp;
            sub1[4] += temp;
        }
        System.out.println("Enter Sub 2 marks for all sems:");
        for(int j = 0 ; j < 4;j++)
        {
            int temp = sc.nextInt();
            sub2[j] = temp;
            sub2[4] += temp;
        }
        System.out.println("Enter Sub 3 marks for all sems:");
        for(int j = 0 ; j < 4;j++)
        {
            int temp = sc.nextInt();
            sub3[j] = temp;
            sub3[4] += temp;
        }
        System.out.println("Enter Sub 4 marks for all sems:");
        for(int j = 0 ; j < 4;j++)
        {
            int temp = sc.nextInt();
            sub4[j] = temp;
            sub4[4] += temp;
        }

   sc.close();

    }
  
}
