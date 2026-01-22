package solution;

import java.util.Scanner;

public class ReverseExceptNonLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t>0){
		    String s=sc.nextLine();
		    StringBuilder sb=new StringBuilder();
		    int l=s.length();
		    int i;
		    for(i=l-1;i>=0;i--){
		        if(Character.isLetter(s.charAt(i)))
		        sb.append(s.charAt(i));
		    }
		    for(i=0;i<l;i++){
		        if(Character.isLetter(s.charAt(i))==false)
		        sb.insert(i, s.charAt(i));
		    }
		    System.out.println(sb);
		    t--;
		}

	}

}
