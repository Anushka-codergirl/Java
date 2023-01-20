
/* Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]”
are correct in exp. For example, the function should return 'true' for exp = “[()]{}{[()()]()}” 
and 'false' for exp = “[(])”. 


Algo:  Here for every opening bracket in the expression, we push its corresponding closing bracket
	   to the stack. And for every closing bracket, we pop out the top element IF the stack is not
	   empty and the top element is EXACTLY same as the element in that iteration. Otherwise we 
	   return FALSE.
	   
	   After coming out of the loop, we check if the stack is empty ot not.
	   			i) If Empty: Return true
	   			ii) If not Empty: Return false
	   			
	   	** Link to the question: https://www.codingninjas.com/codestudio/problems/valid-parenthesis_795104?topList=love-babbar-dsa-sheet-problems
*/
                        
                        
import java.util.Stack;
                        
public class BalanceParaenthesis {
	
	public static void main(String[] args) {
		
		String inputParans = "{{{{{{{{{{{{{{{{{{)))))))))((((((()))))))}}}}}}}}}}}}}}}}}}";
		boolean valid = checkParanthesis(inputParans);
		System.out.println("Paranthesis are balanced: " + valid);
	}

	private static boolean checkParanthesis(String exp) {
		
		Stack<Character> st = new Stack<Character>();
		
		int n = exp.length();
	    for(int i = 0; i < n; i++){
	        
	            if(exp.charAt(i) == '['){
	                st.push(']');
	            }
	            else if(exp.charAt(i) == '('){
	                st.push(')');
	            }
	            else if(exp.charAt(i) == '{'){
	                st.push('}');
	            }
	            else {
	                if(!(st.empty()) && exp.charAt(i) == st.peek()){
	                st.pop();
	             }
	            else{
	                return false;
	            }
	            }

	    
	    }
	    if(st.empty()){
	        return true;
	    }
	    return false;
		
		
		
		
	}
}
