
/* This program will show you how to reverse a string using stack data structure
 
 Input: helloworld
 Output: dlrowolleh
 
 	** Link to question: https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Stack&sortBy=submissions

 */


import java.util.Stack;


public class reverseString {
	
	private static String reverseTheString(String input) {
		
		Stack<Character> st = new Stack<Character>();         //creating a stack 
		int size = input.length();							  
		for(int count = 0; count < size; count++){			 
			
			char toPush = input.charAt(count);	// Pushing each character of string into the stack
			st.push(toPush);
		}
		
		// Now when we pop out the elements of stack, the last element to be added will come out first
		String reversedString  = "";
		while(!st.empty()){
			char toAdd = st.peek();      // storing the top element
			reversedString = reversedString + toAdd; 
			st.pop();					// Pop out the top element
		}
		
		return reversedString; 			// return the reversed string
	}
	 
	 public static void main(String[] args) {
		
		 String input = "Aayan";
		 String output = reverseTheString(input);   // reverse operation is carried out in diffrent function
		 System.out.println("Output: " + output);
		 
	}

}
