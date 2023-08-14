/* > Stack is a Linear Data Structure.
   > It follows the principle of Last in First out (LIFO) i.e the element entered last
     in the stack will be the first one to come out.
   > To implement the stack in Java, we have a Stack class in Java Collections Framework.
   > Methods in Stack class: 
						1) push() --- To add a element on top of the stack
						2) pop() --- To remove the top element from the stack
						3) peek() --- Returns the top most element of the stack
						4) empty() --- Return boolean whether the stack is empty or not
						TC of above three method is O(1)
						
	> Below is the implementation of Stack Data Structure					
*/





import java.util.*;
public class Implementation {

	public static void main(String[] args) {
		
		// Creating a new Stack
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);   // Pushing elements at the top
		st.push(2);	  
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println("Is stack empty: " + st.empty());   // Check if the stack is empty or not
		
		while(!st.empty()){
			System.out.println(st.peek() + " removed from stack");   // Prints the top element
			st.pop();    // removes the top element
		} 
		System.out.println("Is stack empty: " + st.empty());
		
	}
}
