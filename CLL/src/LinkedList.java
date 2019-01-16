/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of the Circularly Linked List
 * 10/22/2018
 */

public class LinkedList
{
	protected Node head;
	protected Node tail;
	public int size;
	
	//constructor for Circular Linked list which sets
	//head and tail to null and size to 0
	public LinkedList() 
	{
		head = null;
		tail = null;
		size = 0;
	} 
	
	//if head node is null then the list is empty
	public boolean isEmpty() //checks if list is empty
	{
		return head == null;
	}
	
	//returns the size of the list nodes and prints the size
	//so the user knows the current size of the list
	public int getSize()
	{
		System.out.println("\nThe size of this list is: " + size + " nodes\n");
		return size;
	}
	
	//used to rotate first node to back of the list
	public void rotate()
	{
		//if the list is empty this does nothing
		if(tail != null)
		{
			tail = tail.getLink();
		}
	}
	
	//adds a node at the head of the circular linked list
	//first checks if list is null and then adds a node if that
	//evaluates to be true
	public void addFirst(int value)
	{
		Node newnode = new Node(value, null);
		newnode.setLink(head);
		//list must be empty if head is null
		if(head == null)
		{
			head = newnode;
			newnode.setLink(head);
			tail = head;
		}
		else
		{
			tail.setLink(newnode);
			head = newnode;
		}
		//increments list and prompts the user
		size++;
		System.out.println("Added " + head.getData() + " to head of the list");
	}
	
	//adds a node to the end of the list
	public void addLast(int value)
	{
		//sets up a new node to be added to the end
		Node newnode = new Node(value, null);
		newnode.setLink(head);
		//if head is null then the list is empty and the 
		//node added last will actually be the head
		if(head == null)
		{
			head = newnode;
			newnode.setLink(head);
			tail = head;
		}
		//if the list is not empty then the new node is added
		//at the end of the list
		else
		{
			tail.setLink(newnode);
			tail = newnode;
		}
		//increment the size and then let user know the tail node has
		//been added to the list
		size++;
		System.out.println("Added " + tail.getData() + " to tail of the list");
	}
	
	//removes the first node in the list
	public void removeFirst()
	{
		//if the list is empty then it prompts the user
		if(isEmpty())
		{
			System.out.println("Nothing to delete! List must be empty");
		}
		//if head node is also the tail node then 
		//then it must be the only node left
		if(head == tail)
		{
			tail = null;
		}
		//removes head element from list
		else
		{
			tail.setLink(head.getLink());
		}
		
		//decrements size of the list and prompts user
		size--;
		System.out.println("Deleted " + head.getData() + " at head of the list");
	}
	
	//removes the last node in the list
	public void removeLast()
	{
		//if the list is empty it prompts the user
		if(isEmpty())
		{
			System.out.println("Nothing to delete! List must be empty");
		}
		//if the head is the tail node then 
		//it must be the last node left
		if(head == tail)
		{
			tail = null;
		}
		//removes the tail node from the list
		else
		{
			head.setLink(tail.getLink());
		}
		//decrements the size of the list and prompts user
		size--;
		System.out.println("Deleted " + tail.getData() + " at tail of the list");
	}
	
}

