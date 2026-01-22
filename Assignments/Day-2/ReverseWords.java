package solution;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String word[]=s.split(" ");
		int n=word.length;
		int i;
		for(i=0;i<n;i++){
		    word[i]=new StringBuilder(word[i]).reverse().toString();
		}
		System.out.println(String.join(" ", word));
	}

}
