/**
 * Java API Interface List <E> An ordered collection (also known as a sequence).
 * Provides the details of each method
 * @author Aaron McCarley
 * @version 1.0
 * @param <T>
 */

public interface StackInterface<T> {
	
	public void push (T newEntry);  
	public T pop();
	public T peek();
	public boolean isEmpty();
	public int size();
	public void capacity();

}// end Stack Interface