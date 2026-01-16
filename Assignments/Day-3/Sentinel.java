package capgtraining;
import java.util.*;
public class Sentinel {
	
	int min(ArrayList<Integer> list) {
		int min=Integer.MAX_VALUE;
		for(int x:list) {
			if(x<min)
				min=x;
		}
		return min;
	}
	
	double average(ArrayList<Integer> list) {
		long sum=0;
		for(int x:list) {
			sum+=x;
		}
		return Double.parseDouble(String.format("%.2f",(double)sum/list.size()));
	}
	
	int mode(ArrayList<Integer> list) {
		HashMap<Integer, Integer>map=new HashMap<>();
		for(int x:list) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		int max=list.get(0);
		for(int x:map.keySet()) {
			if(map.get(x)>map.get(max)) {
				max=x;
			}
		}
		return max;
	}
	
	double median(ArrayList<Integer> list) {
		int count=list.size();
		double median;
		if(count%2==0) {
			median=(list.get(count/2)+list.get((count/2)-1))/2.0;
		}
		else
			median=list.get(count/2);
		
//		return Double.parseDouble(String.format("%.2f", median));
		return median;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			if(sc.hasNextInt()){
				list.add(sc.nextInt());
				if(list.getLast()==-999) {
					list.removeLast();
					break;
				}
			}
			else
				sc.next();
		}
		Sentinel obj=new Sentinel();
		System.out.println(obj.median(list));
		sc.close();
	}

}