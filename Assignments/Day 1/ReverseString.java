package solution;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t>0){
		    String s=sc.nextLine();
		    int l=s.length();
		    for(int i=l-1;i>=0;i--)
		    System.out.print(s.charAt(i));
		    System.out.println();
		    t--;
		}
	}

}
