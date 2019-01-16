/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of the Circularly Linked List
 * 10/22/2018
 */

public class Node 
{
	protected int data;
	protected Node link;
	
	//constructor for the node that sets data element to 0
	//and sets the new link to null
	public Node()
	{
		data = 0;
		link = null;
	}
	
	//constructor for Node 
	public Node(int d, Node n)
	{
		data = d;
		link = n;
	}
	
	public void setLink(Node n) //sets link to the next node
	{
		link = n;
	}
	
	//sets data in the node
	public void setData(int d)
	{
		data = d;
	}
	
	//gets a node called "Link" when asked to
	public Node getLink()
	{
		return link;
	}
	
	//gets the data from the current node named "link"
	public int getData()
	{
		return data;
	}
}

