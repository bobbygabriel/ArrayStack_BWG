package jsjf.exceptions;

/**
 * Represents the situation in which a collection is empty.
 *
 * @author Bobby
 * @version 1.0
 * Programming Project 4
 * Spring/2020
 */
public class EmptyCollectionException extends RuntimeException
{
	/**
	 * Sets up this exception with an appropriate message.
	 * @param collection the name of the collection
	 */
	public EmptyCollectionException(String collection)
	{
		super("The " + collection + " is empty.");
	}
}//end EmptyCollectionException
