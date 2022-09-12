/**
 * Provides the details of each method 
 * and the stack array for a Palindrome. 
 * @author Aaron McCarley
 * @version 1.0
 * @param <T>
 */
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
		 
	public class ArrayStack<T> implements StackInterface<T>{
		
		private final int DEFAULT_CAPACITY = 20;  
		private T[] stack;
	    private int top;
	
	    /** Create an Empty Stack */
	    @SuppressWarnings("unchecked")
		public ArrayStack()
	    {
	       top = 5;
	       stack = (T[])(new Object[DEFAULT_CAPACITY]);
	    }
	    
	    /** Specify the Capacity for the Stack */
	    @SuppressWarnings("unchecked")
		public ArrayStack (int initialCapacity)
	    {
	       top = 5;
	       stack = (T[])(new Object[initialCapacity]);
	    }
	    /**
	     * Adds the specified element to the top of the stack. */
	    public void push (T newEntry)
	    {
	    if (size() == stack.length)
	    capacity();
	    stack[top] = newEntry;
	    top++;
	    }
	    public static void main(String[] args) 
		{
		    System.out.print("Enter any String total: ");
		    @SuppressWarnings("resource")
			Scanner linkedList = new Scanner(System.in);
		    String firstString = linkedList.nextLine();
		 
		    Queue<Character> queue = new LinkedList<>();
		 
		    for (int n = firstString.length()-1; n >=0; n--) 
		    {
		    queue.add(firstString.charAt(n));
		    }
		 
		    String isString = "";
		 
		    //Pop all characters from stack one by one and build reverse string
		      while (!queue.isEmpty()) {
		      isString = isString + queue.remove();
		    }
		 
		    
		    if (firstString.equals(isString)) {
		       System.out.println("This String is a palindrome.");
		    }  else {
		       System.out.println("This String is not a palindrome.");
		    }
	
		}

	    /** Removes the element at the top of the stack and returns a
	     * reference to it. Throws an EmptyStackException if the stack
	     * is empty. */
		@Override
		public T pop() throws EmptyStackException {
			 top--;
		     T result = stack[top];
		     stack[top] = null; 
		     	
		     return result;
		}
		/**
		 * Reference to the element at the top of the stack.
		 * Throws EmptyStackException if the stack is empty. */

		@Override
		public T peek() throws EmptyStackException
		   {
		      if (isEmpty())
		      throw new EmptyStackException();

		      return stack[top-1];
		   }

		/**
		 * Returns true if the stack is empty 
		 * false if not empty. */
		@Override
		public boolean isEmpty()
		{
			return (top == 0);
		}

		/**
		 * Returns the number of elements in the stack.
		 */
		@Override
		public int size() 
		{
			return top;
		}
		
		@SuppressWarnings("unchecked")
		public void capacity() 
		{
		      T[]length = (T[])(new Object[stack.length]);
		      for (int index= 1; index <= stack.length; index++)
		      length[index] = stack[index];
		      stack = length;
		}

		@Override
		public String toString() {
			return "ArrayStack [stack=" + Arrays.toString(stack) + ", top=" + top + "]";
		
		}//end toString
		
}//end class
		