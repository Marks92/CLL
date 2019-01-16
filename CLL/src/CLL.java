/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of the Circularly Linked List
 * 10/22/2018
 */
public class CLL 
{
	public static void main(String[] args)
	{
		//this title is a work in progress
		System.out.println("Time is a flat circle");
		System.out.println("---------------------");
		//creates a list similar to Singly Linked List project
		//with no parameters and is extendable
		LinkedList List = new LinkedList();  
		List.addFirst(55);  //inserts a node that holds 55 at the start
		List.addLast(22);   //inserts a node that holds 22 after previous node
		List.addFirst(8);
		List.addFirst(9);
		List.addLast(5);
		List.removeFirst();
		List.removeLast();
		List.getSize();
		List.addLast(12);
		List.addLast(57);
		List.addFirst(78);
		List.getSize();
		List.removeLast();
		List.removeLast();
		List.getSize();
	}
}