import StudentPackage.RegisterStudent;


class SGPAException extends Exception{
	private static final long serialVersionUID = 1L;
	private int SGPA;

	SGPAException(int SGPA) {
		this.SGPA = SGPA;
	}

	public String toString() {
		return "SGPA Exception Credit greater Than 10 i.e [" + SGPA + "]\n";
    }
 
 
} 

public class StudentResult{
  RegisterStudent stud;
  public StudentResult(RegisterStudent reg)
  {
  this.stud = reg;
  }
  public void calculateGrades()
  {
    // cgpa for each semester
    int cgpa[] = new int[4];
    int sgpa = 0;
    for(int i = 0 ; i < 4; i++)
    {
        int temp = stud.sub1[i] + stud.sub2[i] + stud.sub3[i] + stud.sub4[i]; // total marks for the particular semester
        cgpa[i] = temp / 40;
        System.out.println("The Cgpa for semester" + (i + 1) + " is " + cgpa[i]);
    }
    for(int i = 0 ; i < 4 ; i++)
    {
        sgpa += cgpa[i];
    }
    sgpa /= 4;
    try
    {
      if(sgpa > 10 ) {throw new SGPAException(sgpa);}
    } catch (Exception ex)
    {
      System.out.println(ex.toString());
    System.exit(0);
    }
    System.out.println("\n\tResult");
    System.out.println("Name :" + stud.name + "\tUSN :" + stud.usn + "\tBranch:" + stud.branch);
    if ((cgpa[0] > 5 && cgpa[1] > 5 && cgpa[2] > 5 && cgpa[3] > 5) != true)
    {  System.out.println("\tSorry, you have Failed!");}
    else {
      System.out.println("\tCongratulations! You passed with SGPA " + sgpa);
      System.out.println("Credits earned :  " + stud.credit);
    }    
  }
  public static void main(String[] args)
  {
      RegisterStudent student = new RegisterStudent();
      student.getData();
      StudentResult result = new StudentResult(student);
      result.calculateGrades();

  }
}