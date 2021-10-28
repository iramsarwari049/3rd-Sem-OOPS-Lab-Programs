import java.util.*;
class BankInfo {
	int accno;
	long phoneNo;
	String name;
	float balanceAmt;
	Scanner sc = new Scanner(System.in);
	void getInput () {
		System.out.println("\nEnter the name");
		name = sc.nextLine();
		System.out.println("Enter the Account number");
		accno = sc.nextInt();
		System.out.println("Enter the phone number");
		phoneNo = sc.nextLong();
		System.out.println("Enter the current balance");
		balanceAmt = sc.nextFloat();
	}
	void deposit(float amt) {	
		balanceAmt += amt;
		System.out.println("Deposited "+amt+" in the account");
		System.out.println("Current Balance is "+balanceAmt);
	}
	void withdraw(float amt) {		
		if (amt <= balanceAmt) {
			balanceAmt -= amt;
			System.out.println("Current Balance is "+balanceAmt);
		}
		else {
			System.out.println("Transaction Failed");
			System.out.println("Current Balance is "+balanceAmt);
		}
	}
}
public class Account {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BankInfo ac = new BankInfo();
		float amt;
		ac.getInput();
		System.out.println("Enter the amount you want to withdraw : ");
		amt = sc.nextFloat();
		ac.withdraw(amt);
		System.out.println("Enter the amount you want to deposit : ");
		amt = sc.nextFloat();
		ac.deposit(amt);
		sc.close();
	}
}