
import java.util.Stack;
public class Problem1 {

	public static void main(String[] args) {
		
		String parenthesis = "][]{{}}";
		//{[(])
		//{}ac
		//{(11)}
		//{(12])
		//@#$$#@
		//][]{{}}
		
		System.out.println(parenthesis);
		Character ch;
		Stack<Character> st = new Stack<>();
		for(int i = 0; i<parenthesis.length();i++) {
			ch = parenthesis.charAt(i);
			if(st.empty()) {
				st.push(ch);	
			} else if (ch == '{' || ch == '[' || ch =='(') {
				st.push(ch);
			} else if(ch == ')' && st.peek()=='(') {
				st.pop();
			} else if(ch == ']' && st.peek()=='[') {
				st.pop();
			}else if(ch == '}' && st.peek()=='{') {
				st.pop();
			} else
				break;
		}
		
		if(st.empty()) {
			System.out.println("Balanced Parenthesis");
		}else {
			System.out.println("Unbalanced Parenthesis");
		}
	}
	
//	int divide (int a){
//		int output;
//		int remainder;
//		if(a!=)
//		remainder = a%2;
//		output = 
//		
//		divide(a/2);
//		
//		
//		
//		return output;
//	}
	
	
	int testDivide(int a) {
		if(a!=0) {
			return testDivide(a/2);
		}
		return a;
	}
	
	
	
	
	

	
	

}
