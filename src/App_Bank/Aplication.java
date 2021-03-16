package App_Bank;

import java.util.Scanner;
import Bank_Logic.Bank;






//Enter account number: 8532
//Enter account holder: Alex Green
//Is there na initial deposit (y/n)? y
//Enter initial deposit value: 500.00
//Account data:
//Account 8532, Holder: Alex Green, Balance: $ 500.00
//Enter a deposit value: 200.00
//Updated account data:
//Account 8532, Holder: Alex Green, Balance: $ 700.00
//Enter a withdraw value: 300.00
//Updated account data:
//Account 8532, Holder: Alex Green, Balance: $ 395.00







public class Aplication {

	public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
		
		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);

		System.out.println("Enter account number: ");
		Integer number = sc.nextInt();
		
		System.out.println("Name: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there na initial deposit (1/2)?: ");
		int op = sc.nextInt();
		
		double balance = 0;
		
		Bank bk = new Bank(number, holder, balance);

		
		// Create your account without deposit
		if(op == 1) {
			
			System.out.println("Number account:" +bk.getNumber());
			
			System.out.println("Name: " +bk.getHolder());
			
			System.out.println("Balance: " +bk.getBalance());
			
		}
		
		// Create your account with deposit
		else if(op == 2){
			
			
			System.out.println("Initial deposit: ");
			balance = sc.nextDouble();
			
			
			System.out.println("Number account:" +bk.getNumber());
			
			System.out.println("Name: " +bk.getHolder());
			
			bk.setBalance(balance);
			
			System.out.println("Balance: " +bk.getBalance());
			
	
		}
		

		System.out.println("update deposit ");
		balance = sc.nextDouble();
		
		bk.AddBalance(balance);
		
		System.out.println("Number account:" + bk.getNumber());
		
		System.out.println("Name: " + bk.getHolder());
		
		System.out.println("Balance: " + bk.getBalance());

while(1==1) {		
		System.out.println("Add or Remove (3/4)?: ");
		int op2 = sc.nextInt();
		
		if (op2 == 3) {
			
			System.out.println("Add value ");
			balance = sc.nextDouble();
			
			bk.AddBalance(balance);
			
			System.out.println("Number account:" + bk.getNumber());
			
			System.out.println("Name: " + bk.getHolder());
			
			System.out.println("Balance: " + bk.getBalance());
			
			
		}
		
		else if(op2 == 4) {
			
			System.out.println("withdraw a value:");
			balance = sc.nextDouble();
			
			bk.NegBalance(balance);
			
			System.out.println("Number account:" + bk.getNumber());
			
			System.out.println("Name: " + bk.getHolder());
			
			System.out.println("Balance: " + bk.getBalance());
			
			
			
		}
		
		
	}
		

		
}
		
		
		
		
		
	}


