package capgtraining;
import java.util.*;
public class Expeval {
	static ArrayList<Character>stack=new ArrayList<>();
	
	public static int evaluate(String exp) {
		push('(');
		String token[]=exp.split(" ");
		int tokens=token.length;
		ArrayList<String>postfix=new ArrayList<>();
		int i;
		for(i=0;i<tokens;i++) {
			if(isoperator(token[i])) {
				char operator=token[i].charAt(0);
				if(precedence(top())==-1)
					push(operator);
				else if(precedence(operator)<=precedence(top())) {
					char ch=pop();
					postfix.add(Character.toString(ch));
					push(operator);
				}
				else
					push(operator);
			}
			else {
				postfix.add(token[i]);
			}
		}
		while(stack.size()>1) {
			char ch=pop();
			postfix.add(Character.toString(ch));
		}
		ArrayList<String>solve=new ArrayList<>();
		for(i=0;i<postfix.size();i++) {
			if(isoperator(postfix.get(i))) {
				char operator=postfix.get(i).charAt(0);
				int x=Integer.parseInt(solve.getLast());
				solve.removeLast();
				int y=Integer.parseInt(solve.getLast());
				solve.removeLast();
				switch(operator) {
				case '^':
					solve.add(Integer.toString((int)Math.pow(y,x)));
					break;
				case '/':
					solve.add(Integer.toString(y/x));
					break;
				case '*':
					solve.add(Integer.toString(y*x));
					break;
				case '+':
					solve.add(Integer.toString(y+x));
					break;
				case '-':
					solve.add(Integer.toString(y-x));
					break;
				default:
				}
			}
			else 
				solve.add(postfix.get(i));
		}
		return Integer.parseInt(solve.get(0));
	}
	
	public static boolean isoperator(String s) {
		if(s.equals("^") || s.equals("/") || s.equals("/") || s.equals("*") || s.equals("+") || s.equals("-"))
			return true;
		return false;
	}
	
	public static int precedence(char ch) {
		if(ch=='^')
			return 3;
		if(ch=='/' || ch=='*')
			return 2;
		if(ch=='+' || ch=='-')
			return 1;
		return -1;
	}
	
	public static void push(char ch) {
		stack.add(ch);
	}
	
	public static char pop() {
		int size=stack.size();
		char ch=stack.get(size-1);
		stack.remove(size-1);
		return ch;
	}
	
	public static char top() {
		return stack.getLast();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter expression to evaluate: ");
		String exp=sc.nextLine();
		System.out.println("Result: "+evaluate(exp));
		sc.close();
	}

}
