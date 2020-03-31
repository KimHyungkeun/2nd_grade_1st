package edu.colorado.nodes;

public class IntNode {
	private int data;
	private IntNode link;
	
	//Initialize a node with specified initial data and a link to the next node.
	public IntNode(int initialData,IntNode initialLink) {
		// TODO Auto-generated constructor stub
		data = initialData;
		link = initialLink;
	}
	
	//Modification method to add a new node after this node
	public void addNodeAfter(int element)
	{
		link = new IntNode(element,link);
	}
	
	//Accessor method to get the data from this node
	public int getData()
	{
	return data;
	}
	
	//Accessor method to get a reference to the next node after this node
	public IntNode getLink()
	{
		return link;
	}
	
	//Copy a list
	public static IntNode listCopy(IntNode source)
	{
		IntNode copyHead;
		IntNode copyTail;
		
		//Handle the special case of an empty list.
		if(source == null)
			return null;
		
		//Make the first node for the newly created list
		copyHead = new IntNode(source.data,null);
		copyTail = copyHead;
		
		//Make the rest of the nodes for the newly created list
		while(source.link != null)
		{
			source = source.link;
			copyTail.addNodeAfter(source.data);
			copyTail = copyTail.link;
		}
		
		//Return the head reference for the new list
		return copyHead;
	}
	
	//Copy a list, returning both a head and tail reference for the copy.
	public static IntNode[] listCopyWithTail(IntNode source)
	{
		//Notice the the return value is an array of two IntNode components
		IntNode copyHead;
		IntNode copyTail;
		IntNode[] answer = new IntNode[2];
		
		//Handle the special case of an empty list
		if(source == null)
			return answer; //The answer has two null reference
		
		//Make the first node for the newly created list
		copyHead = new IntNode(source.data,null);
		copyTail = copyHead;
		
		//Make the rest of the nodes for the newly created list
		while(source.link != null)
		{
			source = source.link;
			copyTail.addNodeAfter(source.data);
			copyTail = copyTail.link;
		}
		
		//Return the head and tail references for the new list
		answer[0] = copyHead;
		answer[1] = copyTail;
		return answer;
	}
	
	//Compute the number of nodes in a linked list
	public static int listLength(IntNode head)
	{
		IntNode cursor;
		int answer;
		
		answer = 0;
		for(cursor = head;cursor != null;cursor = cursor.link)
			answer++;
		
		return answer;
	}
	
	//Copy part of a list, providing a head and tail reference for the new copy
	public static IntNode[] listPart(IntNode start, IntNode end)
	{
		//Notice that the return value is an array of two IntNode components
		IntNode copyHead;
		IntNode copyTail;
		IntNode[] answer = new IntNode[2];
		
		//Check for illegal null at start or end
		if(start == null)
			throw new IllegalArgumentException("Start is null");
		
		if(end == null)
			throw new IllegalArgumentException("end is null");
		
		//Make the first node for the newly created list
		copyHead = new IntNode(start.data,null);
		copyTail = copyHead;
		
		//Make the rest of the node for the newly created list
		while(start != end)
		{
			start = start.link;
			if(start == null)
				throw new IllegalArgumentException("end Node was not found on the list");
			copyTail.addNodeAfter(start.data);
			copyTail = copyTail.link;
		}
		
		//Return the head and tail reference for the new list
		answer[0] = copyHead;
		answer[1] = copyTail;
		return answer;
	}
	
	
	//Find a node at a specified position in a linked list
	public static IntNode listPosition(IntNode head,int position)
	{
		IntNode cursor;
		int i;
		
		if(position <= 0)
			throw new IllegalArgumentException("position is not positive");
		
		cursor = head;
		for(i=1 ; (i<position) && (cursor!=null); ++i)
			cursor = cursor.link;
		
		return cursor;
	}
	
	//Search for a particular piece of data in a linked list
	public static IntNode listSearch(IntNode head,int target)
	{
		IntNode cursor;
		
		for(cursor = head; cursor != null;cursor = cursor.link)
			if(target == cursor.data)
				return cursor;
		
		return null;
	}
	
	//Modification method to remove the node after this node
	public void removeNodeAfter()
	{
		link = link.link;
	}
	
	//Modification method to set the data in this node
	public void setData(int newData)
	{
		data = newData;
	}
	
	//Modification method to set a reference to the next node after this node
	public void setLink(IntNode newLink)
	{
		link = newLink;
	}
}
