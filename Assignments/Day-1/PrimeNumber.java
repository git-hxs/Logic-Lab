package solution;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t>0) {
            int n=sc.nextInt();
            if(n==1)
                System.out.println(n + " is not Prime");
            else{
                int i;
                for(i=2;i<n;i++){
                    if(n%i==0){
                        System.out.println(n + " is Not Prime");
                        i=-1;
                        break;
                    }
                }
                if(i!=-1)
                    System.out.println(n + " is Prime");
            }
            t--;
        }

	}

}
