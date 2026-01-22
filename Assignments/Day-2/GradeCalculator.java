package solution;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 marks: ");
		int a[]=new int[5];
		int i;
		for(i=0;i<5;i++)
		a[i]=sc.nextInt();
		int sum=0;
		for(i=0;i<5;i++)
		sum+=a[i];
		double per=(sum/500.0)*100;
		System.out.println("Percentage: "+per);
		if(per>=90)
		System.out.println("A");
		else if(per>=75)
		System.out.println("B");
		else if(per>=60)
		System.out.println("C");
		else if(per>=40)
		System.out.println("D");
		else
		System.out.println("F");

	}

}
