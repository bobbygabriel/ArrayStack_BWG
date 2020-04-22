package jsjf;
/**
 * TestStack class completely tests all methods of ArrayStack class
 * 
 * @author bobby
 * @version 1.0
 * Programming Project 4
 * Spring/2020
 */
public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------Testing ArrayStack----------");
		ArrayStack<Integer> s = new ArrayStack<>();
		
		
		
		
		System.out.println("Test 1");
		//adding a value to the stack
		s.push(20);
		
		//checking top value of stack (will be 20)
		System.out.println(s.peek());
		
		//Checking size of stack
		System.out.println(s.size());
		
		//checking if stack is empty
		System.out.println(s.isEmpty() + "\n");
		
		//String representation of stack with each element on a line of its own
		System.out.println(s.toString() + "\n");
		
		//removing that value
		s.pop();
		
		
		
		System.out.println("Test 2");
		//adding another 2 values
		s.push(3);
		s.push(5);
		
		//checking the top value of the stack (will now be 5 since that was just added)
		System.out.println(s.peek());
		
		//checking how many items are in the stack (total of 2 now)
		System.out.println(s.size());
		
		//checking if stack is empty
		System.out.println(s.isEmpty() + "\n");
		
		//String representation of Stack with each element on a line of its own
		System.out.println(s.toString());
		
		
		
		System.out.println("Test 3");
		//removing both items in stack
		s.pop();
		s.pop();
		
		//checking size of stack
		System.out.println(s.size());
		//checking if stack is empty (will return true now since i have removed both items).
		System.out.println(s.isEmpty());
		
		//also tested System.out.println(s.peek()); at the end of this test to make sure it gave me the EmptyCollectionException
		
		
		
		System.out.println("--------------------------------------");
	}//end main

}//end TestStack
