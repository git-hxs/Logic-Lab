package capgtraining;
import java.util.*;
public class RLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice:\n1.Compress\n2.Decompress");
		int choice=sc.nextInt();
		System.out.println("enter expression");
		String exp=sc.next();
		int l=exp.length();
		char key=' ';
		int i;
		StringBuilder sb=new StringBuilder();
		switch(choice) {
		case 1:
			key=exp.charAt(0);
			int count=1;
			for(i=1;i<l;i++) {
				if(exp.charAt(i)==key){
					count++;
					if(count>9) {
						System.out.println("Character count greater than 9 not allowed");
						break;
					}
				}
				else {
					sb.append(key);
					sb.append(Integer.toString(count));
					key=exp.charAt(i);
					count=1;
				}
			}
			sb.append(key);
			sb.append(Integer.toString(count));
			System.out.println(sb.toString());
			break;
		case 2:
			i=0;
			while(i<=l-2) {
				key=exp.charAt(i);
				i++;
				int limit=exp.charAt(i)-'0';
				int j;
				for(j=1;j<=limit;j++) {
					sb.append(key);
				}
				i++;
			}
			System.out.println(sb.toString());
			break;
		default:
			System.out.println("Invalid Choice!!");
		}
		sc.close();
	}

}
