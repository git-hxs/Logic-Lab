package solution;

import java.util.Scanner;

public class SmallesElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int i;
		    for(i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    int min=Integer.MAX_VALUE;
		    for(i=0;i<n;i++){
		        if(a[i]<min)
		        min=a[i];
		    }
		    System.out.println(min);
		    t--;
		}
	}

}
