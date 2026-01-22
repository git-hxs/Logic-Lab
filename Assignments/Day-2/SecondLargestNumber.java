package solution;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int num[]=new int[n];
		for(i=0;i<n;i++)
		num[i]=sc.nextInt();
		int max=num[0];
		int secmax=max;
		for(i=1;i<n;i++){
		    if(num[i]>max){
		        secmax=max;
		        max=num[i];
		    }
		    else if(num[i]>secmax)
		    secmax=num[i];
		}
		System.out.println("second maximum number: "+secmax);

	}

}
