package capgtraining;
import java.util.*;
public class Cmdgradebook {
	
	public static void printall(int n, String names[], int marks[]) {
		int i;
		for(i=0;i<n;i++) {
			System.out.println(names[i]+"("+marks[i]+")");
		}
	}
	
	public static void printtopper(int n, String names[], int marks[]) {
		int i;
		int topper=0;
		for(i=1;i<n;i++) {
			if(marks[i]>marks[topper])
				topper=i;
		}
		System.out.println("Topper: "+names[topper]+"("+marks[topper]+")");
	}
	
	public static void classavg(int n, int marks[]) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=marks[i];
		}
		System.out.println("Average: "+ sum/(double)n);
	}
	
	public static void searchbyname(int n, String names[], int marks[], String key) {
		int i;
		for(i=0;i<n;i++) {
			if(key.equalsIgnoreCase(names[i])) {
				System.out.println("Found : "+names[i]+"("+marks[i]+")");
				i=-1;
				break;
			}
		}
		if(i!=-1)
			System.out.println("No record found");
	}
	
	public static void curvegrades(int n, int marks[]) {
		for(int i=0;i<n;i++) {
			marks[i]=Math.min(100, marks[i]+5);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students: ");
		int n=sc.nextInt();
		String names[]=new String[n];
		int marks[]=new int[n];
		int i;
		System.out.println("enter name and marks of student in 'Name Marks' format : ");
		for(i=0;i<n;i++) {
			names[i]=sc.next();
			marks[i]=sc.nextInt();
		}
		int choice=0;
		while(true) {
			System.out.println("1. print all\n2. print topper\n3. class average\n4. Search by name\n5. Curve grades\n6. exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				printall(n, names, marks);
				break;
			case 2:
				printtopper(n, names, marks);
				break;
			case 3: 
				classavg(n, marks);
				break;
			case 4: 
				System.out.println("Search by name: ");
				String key=sc.next();
				searchbyname(n, names, marks, key);
				break;
			case 5:
				curvegrades(n, marks);
				printall(n, names, marks);
				break;
			case 6:
				System.out.println("Exiting.....");
				System.exit(0);
			default:
				System.out.println("Invalid Choice!!!!!");
			}
		}
	}

}
