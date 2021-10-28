import java.util.ArrayList;
import java.util.Scanner;

public class QueueString{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> queue = new ArrayList<String>();
		System.out.println("1 : enqueue, 2 : dequeue, 3 : show , 4 : exit");
		int input = 0;
		while(input != 4)
		{
			System.out.print("Enter choice : ");
			input = sc.nextInt();
			sc.nextLine();
			switch (input)
			{
				case 1 : System.out.print("Enter the string : ");
				          queue.add(0,sc.nextLine());break;
				case 2 : 
				if(queue.size() == 0)
					System.out.println("Queue Underflow!");
			    
				else
					System.out.println("Element removed is " + queue.remove(queue.size() - 1));
				break;
				case 3 : System.out.println("Queue is : " + queue);break;
				case 4 : break;
				default : System.out.println("Invalid input!");
				
			}
		}
		sc.close();
	}
}