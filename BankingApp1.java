package bankingApp;

import java.util.Scanner;

public class BankingApp1 {
	public String cname="sarat chandra";
	public String cid="605432";

	public static void main(String[] args, String cname, String cid) {
		// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			@SuppressWarnings("unused")
			//BankAccount bank1=new BankAccount();
			 BankAccount bank1=new  BankAccount(cname, cid);
			
			bank1.showMenu();
	}
}
	class BankAccount{
		int balance;
		int previousTransaction;
		String customerName;
		String customerId;
		
		BankAccount(String cname,String cid){
			customerName=cname;
			customerId=cid;
		}
		
		
		public BankAccount(String cname) {
			// TODO Auto-generated constructor stub
		}


		void deposit(int amount) {
			if(amount!=0) {
				balance= balance+amount;
				previousTransaction =amount;
				
			}
		}
	
		void withdraw(int amount) {
			if(amount!=0) {
				balance = balance-amount;
				previousTransaction=-amount;
			}
		}
		void getPreviousTransation() {
			if(previousTransaction>0) {
				System.out.println("Deposited"+previousTransaction);
			}
			else if(previousTransaction<0) {
				System.out.println("Withdrawn:"+Math.abs(previousTransaction));
			}
			else {
				System.out.println("NO TRANSACTION OCCURED!!!!");
			}
			
		}
		void showMenu() {
			char option='\0';
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome"+customerName);
			System.out.println("your ID is"+customerId);
			System.out.println("A.Check Balance");
			System.out.println("B.Deposit");
			System.out.println("C.Withdraw");
			System.out.println("D.Previous Transaction");
			System.out.println("E.Exit");
			
			do {
				System.out.println("====================");
				System.out.println("enter Option");
				System.out.println("====================");
				option=sc.next().charAt(0);
				Character.toUpperCase(option);
				switch(option) {
				case 'A':
					System.out.println("==================");
					System.out.println("Balance is:"+balance);
					System.out.println("==================");
					System.out.println();
					break;
				case 'B':
					System.out.println("====================");
					
					System.out.println("Enter the amount to deposit");
					System.out.println("====================");
					int amount=sc.nextInt();
					deposit(amount);
					System.out.println();
					break;
				case 'C':
					System.out.println("====================");
					System.out.println("Enter the amount to be withdrawn");
					
					System.out.println("====================");
					int amount2=sc.nextInt();
					withdraw(amount2);
					System.out.println();
					break;
				case'D':
					System.out.println("====================");
					getPreviousTransation();
					
					System.out.println("====================");
					System.out.println("====================");
					System.out.println("Enter the amount to be withdrawn");
					
					System.out.println();
					break;
				case 'E':
					System.out.println("====================");
					break;
				default:
					System.out.println("Invalid option try again");
					break;
				}
				
			}while(option!='E');
		}
	}


