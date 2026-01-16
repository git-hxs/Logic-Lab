package capgtraining;
import java.util.*;
public class StringAnalytics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line: ");
		String line=sc.nextLine();
		int l=line.length();
		String words[]=line.split(" ");
		System.out.println("Words: "+words.length);
		int i;
		char key=' ';
		int linecounter=0;
		int digitcounter=0;
		int lettercounter=0;
		for(i=0;i<l;i++) {
			key=line.charAt(i);
			if(key=='.'|| key=='?'||key=='!')
				linecounter++;
			if(Character.isDigit(key))
				digitcounter++;
			if(Character.isLetter(key))
				lettercounter++;
		}
		System.out.println("Sentences: "+linecounter);
		System.out.println("Digits: "+digitcounter+", Letters: "+lettercounter);
		int longestlength=0;
		int longestindex=0;
		for(i=0;i<words.length;i++) {
			if(words[i].length()>longestlength) {
				longestindex=i;
			}
		}
		System.out.println("Longest word: "+words[longestindex]);
		int vowels[]=new int['z'+1];
		for(i=0;i<l;i++) {
			if(Character.isLetter(line.charAt(i)))
				vowels[line.charAt(i)]++;
		}
		System.out.println("Vowel frequency: a="+vowels['a']+" e="+vowels['e']+" i="+vowels['i']+" o="+vowels['o']+" u="+vowels['u']);
		sc.close();
	}

}
