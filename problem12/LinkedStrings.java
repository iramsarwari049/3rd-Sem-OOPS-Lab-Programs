import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;

public class LinkedStrings{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<String> linkedString = new LinkedList<String>();
		System.out.print("Enter number of names : ");
		int input = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter names:");
		while(input != 0)
		{
			input -= 1;
			linkedString.add(sc.nextLine());
		}
		System.out.println(linkedString);
		ListIterator iterate = linkedString.listIterator();
		System.out.print("Printing names which have length more than five : [ ");
		while(iterate.hasNext())
		{
			String value = iterate.next().toString();
			if(value.length() >= 5)
				System.out.print(value + " ");
		}
		System.out.println("]");
		sc.close();
	}
}