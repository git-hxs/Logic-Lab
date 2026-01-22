package solution;

import java.util.Scanner;

public class FactorialRecursion {

	public static int factorial(int n){
        if(n==0)
        return 1;
        return n*factorial(n-1);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}


}
