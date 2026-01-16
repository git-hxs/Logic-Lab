package capgtraining;
import java.util.*;
public class DayOfWeek {
	
	public static String dayofweek(int h) {
		HashMap<Integer, String>map=new HashMap<>();
		map.put(0,"Saturday");
		map.put(1,"Sunday");
		map.put(2,"Monday");
		map.put(3,"Tuesday");
		map.put(4,"Wednesday");
		map.put(5,"Thursday");
		map.put(6,"Friday");
		return map.get(h);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in dd mm yyyy format");
		int q=sc.nextInt(); //day
		int m=sc.nextInt();  //month
		int year=sc.nextInt();
		if(m==1)
			m=13;
		else if(m==2)
			m=14;
		int k=year%100;
		int j=year/100;
		int h= (q + (13*(m+1))/5 + k + (k/4) + (j/4) + (5*j)) % 7;
		System.out.println(dayofweek(h));
		sc.close();
	}
}
