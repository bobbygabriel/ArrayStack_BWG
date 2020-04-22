package jsjf;
import java.util.*;

/**
 * Application class uses a Stack to reverse a String. User will input the string (sentence) they choose.
 * 
 * @author Bobby
 * @version 1.0
 * Programming Project 4
 * Spring/2020
 */
public class Application {

	public static String reverseString(String s) {
		
		//This creates an empty stack
		Stack<Character> st = new Stack<Character>();
		
		//puts every letter/character into the string input by the user.
		char[] cha = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++)
			st.push(s.charAt(i));
		
		//starts from the index 0
		int top = 0;
		
		//pops letters/characters from stack back to the character array
		while(!st.isEmpty())
			cha[top++] = st.pop();
		
		
		//will turn the array of characters into a String and return back to user.
		return String.copyValueOf(cha);
		
	
	}//end reverseString
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String str;
		boolean playing = true;
		
		//2 nested while loops to prompt the user if they want to play again. If yes, it starts over. If no, it ends with a message.
		while(playing) {
			System.out.print("Type a sentence: ");
			str = scan.nextLine();
			
			str = reverseString(str);
			
			System.out.println("Reversed: " + str);
			
			boolean repeat = true;
			
			while(repeat) {
				System.out.print("Would you like to enter another sentence? ");
				str = scan.nextLine();
				
				if(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes")) {
					playing = true;
					repeat = false;
				}	
				else if(str.equalsIgnoreCase("n") || str.equalsIgnoreCase("no"))
					playing = false;
					repeat = false;
			}
		}
		System.out.println("<<Goodbye>>");
		
	}//end main	
}//end Application
