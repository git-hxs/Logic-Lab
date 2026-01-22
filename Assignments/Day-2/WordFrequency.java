package solution;

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<String, Integer>map=new HashMap<>();
		String words[]=s.split(" ");
		for(String x:words){
		    map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(String x:map.keySet()){
		    System.out.println(x+": "+map.get(x));
		}

	}

}
