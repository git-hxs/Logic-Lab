package solution;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int num[]=new int[n];
		for(i=0;i<n;i++)
		num[i]=sc.nextInt();
		int sumodd=0;
		int sumeven=0;
		for(i=0;i<n;i++){
		    if(num[i]%2==0)
		    sumeven+=num[i];
		    else
		    sumodd+=num[i];
		}
		System.out.println("Sum of Even = "+sumeven);
		System.out.println("Sum of Odd = "+sumodd);

	}

}
