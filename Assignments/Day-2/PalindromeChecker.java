package solution;

import java.util.Scanner;

public class PalindromeChecker {

	static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder();
        int l=s.length();
        int i;
        for(i=l-1;i>=0;i--)
        sb.append(s.charAt(i));
        if(s.equalsIgnoreCase(sb.toString()))
        return true;
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(isPalindrome(s))
		System.out.println("Palindrome");
		else
		System.out.println("Not Palindrome");
	}


}
