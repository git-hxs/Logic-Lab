package solution;
import java.util.*;
public class LetterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t>0){
		    String s=sc.nextLine();
		    int l=s.length();
		    int i;
		    HashMap<Character, Integer>map=new HashMap<>();
		    for(i=0;i<l;i++){
		        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		    }
		    for(Character x:map.keySet()){
		        if(map.get(x)!=0&&Character.isLetter(x))
		        System.out.print(x+":"+map.get(x)+", ");
		    }
		    System.out.println();
		    t--;
		}

	}

}
