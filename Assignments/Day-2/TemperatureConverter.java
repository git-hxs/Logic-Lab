package solution;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1. CtoF\n2. FtoC");
		int choice=sc.nextInt();
		double itemp=0.0;
		double rtemp=0.0;
		switch(choice){
		    case 1:
		        System.out.println("Enter temperature in C: ");
		        itemp=sc.nextDouble();
		        rtemp= (itemp*1.8)+32;
		        System.out.println("temperature in F: "+rtemp);
		        break;
		    case 2: 
		        System.out.println("Enter temperature in F: ");
                itemp=sc.nextDouble();
		        rtemp= (itemp-32)/1.8;
		        System.out.println("temperature in C: "+rtemp);
		        break;
		    default:
		    System.out.println("Invalid Choice!!!!");
		}

	}

}
