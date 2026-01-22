package solution;

import java.util.Scanner;

public class ATMSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance=1000;
		int choice=-1;
		while(choice!=4){
		    System.out.println("1. Check Balance \n2. Deposit \n3. Withdraw \n4. Exit");
		    choice=sc.nextInt();
		    switch(choice){
		        case 1: 
		            System.out.println("Balance: "+balance);
		            break;
		        case 2:
		            System.out.println("Enter amount: ");
		            int amtdep=sc.nextInt();
		            balance+=amtdep;
		            System.out.println("New balance: "+balance);
		            break;
		        case 3: 
		            System.out.println("Enter amount: ");
		            int amtwtd=sc.nextInt();
		            if(amtwtd<=balance){
		                balance-=amtwtd;
		                System.out.println("New balance: "+balance);
		            }
		            else
		            System.out.println("Insufficient Balance: "+balance);
		            break;
		        case 4: 
		            System.out.println("Exiting.......\nFinished");
		            break;
		    }
		}

	}

}
