package edu.colorado;

public class DoubleLinkedSeq implements Cloneable
{

private DoubleNode head;//pointer to first element in sequence
private DoubleNode tail;//pointer to last element in sequence
private DoubleNode cursor;//pointer to current element
private DoubleNode precursor;//pointer to element just before current element
private int manyNodes;//number of elements in sequence
   
  
   public DoubleLinkedSeq( )
   {
       head = null;
       tail = null;
       cursor = head;
       precursor = head;
       manyNodes = 0;
   }
    
 
  
    public void addAfter(double element)
    {
       if(isCurrent())
       {//if there is a current element, then add this element after
           cursor.addNodeAfter(element);//create new node
           precursor = cursor;//move precursor
           cursor = cursor.getLink();//move cursor
        }
        else
        {
            if(tail == null)
            {//when there is not a tail reference, there's no head reference either
                tail = new DoubleNode(element, null);//create new node and point
                // tail to this new node
                cursor = tail;//move cursor to the new node
                precursor = tail;//move precursor to tail
                head = tail;//move head to the same node as tail
            }
            else
            {//when tail is not null, there is a head, so do nothing there
                tail.addNodeAfter(element);//create new node and point tail to
                // this new node
                precursor = tail;//point precurser to original tail
                tail = tail.getLink();//tail gets updated link to new node
                cursor = tail;//update cursor to the new node
            }
       manyNodes++;//update invariant
    }
   }


   
   public void addBefore(double element)
   {
       if(isCurrent())
       {// if there is a current element
           if(cursor==head)
           {// where cursor is the head
               precursor = new DoubleNode(element, cursor);//add new node
               head = precursor;//move head
            }
            else
            {//if cursor is not the head
                precursor.addNodeAfter(element);//add new node
                cursor = precursor.getLink();//move cursor
            }
        }
        else
        {//no current element
            if(head == null)
            {//if head is null
                head = new DoubleNode(element, null);
                cursor = head;//move cursor
                precursor = head;//move precursor
                tail = head;//move tail
            }
            else
            {//otherwise, add the node after the precursor, before cursor
                precursor.addNodeAfter(element);//add after precursor
            }
        }
        manyNodes++;//update invariant
    }
   
   
   
    public void addAll(DoubleLinkedSeq addend)
    {
        DoubleNode [] copy;
        if(addend == null)
            throw new IllegalArgumentException
                ("addAll:  addend is null");
        if(addend.size()>0)
        {
            copy = DoubleNode.listCopyWithTail(addend.head);
            //listCopyWithTail returns a 2 element array:  index[0] is the head
            // of copy, and index[1] is the tail of the copy
            tail.getLink().setLink(copy[0]);//set what used to be the last node
            // to the start of the new linked list
            copy[1].setLink(null);//set link of last item to null
            tail.setLink(copy[0]);//set tail link to the first element of the copy
            manyNodes += addend.size();//update invariant
        }    
   }   
   
   
   
   public void advance()
   {
       if(!isCurrent())//if current there is no current element
           return;//we're at the end of the sequence, nothing to move to
        precursor = cursor;//move precursor to where cursor is
        cursor = cursor.getLink();//move cursor to the next link
    }
   
   
    public Object clone( )
    {
        DoubleLinkedSeq answer;
        try{
            answer = (DoubleLinkedSeq) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            throw new RuntimeException
                ("This class does not implement Cloneable.");
        }
        answer.head = DoubleNode.listCopy(head);
        return answer;//return object reference
    }
   

   
    public static DoubleLinkedSeq catenation(DoubleLinkedSeq s1, DoubleLinkedSeq s2)
    {
        if((s1 == null) || (s1 == null))//throw exception if either is null
            throw new IllegalArgumentException
                ("concatenation:  one argument is null");
        DoubleLinkedSeq answer = new DoubleLinkedSeq();
        answer.addAll(s1);//add all from the first sequence
        answer.addAll(s2);//add all from the second sequence
        return answer;//return the union DoubleLinkedSeq object
    }


    
    public double getCurrent( )
    {
        if(!isCurrent())
            throw new IllegalStateException
                ("getCurrent: isCurrent() is null");
        return cursor.getData();//return double value of data at cursor
    }


   
   public boolean isCurrent()
   {
        if(cursor == null)
            return false;
        return true;
    }
    
   
   
   
   
    public void removeCurrent( )
    {
        if(!isCurrent())
            throw new IllegalStateException
                ("removeCurrent: isCurrent() is null");
        if(tail == head)//only one node case
        {
            head = null;
            tail = null;
            cursor = head;
            precursor = head;
            manyNodes--;//update invariant
            return;
        }
        
        if(cursor == tail)//if cursor is at the last node
        {
            tail = precursor;//remove last node
            tail.setLink(null);
            cursor = tail;//move cursor
            precursor = head;//move precursor to beginning
            while(precursor.getLink() != cursor)
            {//and search for a link for precursor
                if(precursor.getLink() == null)
                    break;
                precursor = precursor.getLink();
            }
            manyNodes--;//update invariant
            return;
        }
        
        if(cursor == head)//if cursor is at first node
        {
            head = head.getLink();
            cursor = head;
            precursor = head;
            manyNodes--;
            return;
        }
        //regular case
        cursor = cursor.getLink();
        precursor.setLink(cursor);
        manyNodes--;
    }
                 
   
   
    public int size( )
    {
      return manyNodes;
    }
   
   
    
    public void start( )
    {
        if(head == null)//if there are no elements in the sequence
            cursor = null;//no cursor
        cursor = head;//move cursor to first node
        precursor = head;
    }


	public void displaySeq(DoubleLinkedSeq s) {
		// TODO Auto-generated method stub
		s.start();
    	while(s.isCurrent())
    	{
    		System.out.print("  "+s.getCurrent());
    		s.advance();
    	}
    	System.out.println(" ");
	}
    
   
   

    
}
           