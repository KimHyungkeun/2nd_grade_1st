import java.util.EmptyStackException;


public class ArrayStack<E> implements Cloneable{
	
	private Object[] data;
	private int manyItems;
	
	public ArrayStack() {
		// TODO Auto-generated constructor stub
		final int INITIAL_CAPACITY = 10;
		manyItems = 0;
		data = new Object[INITIAL_CAPACITY];
	}
	
	public ArrayStack(int initialCapacity)
	{
		if(initialCapacity < 0)
			throw new IllegalArgumentException("initialCapacity too small "+initialCapacity);
		manyItems = 0;
		data = new Object[initialCapacity];
	}
	
	public ArrayStack<E> clone()
	{	//Clone an ArrayStack
		ArrayStack<E> answer;
		
		try
		{
			answer = (ArrayStack<E>)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			throw new RuntimeException("This class does not implement Cloneable.");
		}
		
		answer.data = data.clone();
		return answer;
	}
	
	public void ensureCapacity(int minimumCapacity)
	{
		Object[]biggerArray;
		
		if(data.length < minimumCapacity)
		{
			biggerArray = new Object[minimumCapacity];
			System.arraycopy(data,0,biggerArray,0,manyItems);
		}
	}
	
	public int getCapacity()
	{
		return data.length;
	}
	
	public boolean isEmpty()
	{
		return (manyItems == 0);
	}
	
	public E peek()
	{
		if(manyItems == 0)
			//EmptyStackException is from java.util,and its constructor has no argument
			throw new EmptyStackException();
		return (E) data[manyItems-1];
		
	}
	
	public E pop()
	{
		E answer;
		if(manyItems == 0)
			//EmptyStackException is from java.util, and its constructor has no argument
			throw new EmptyStackException();
		answer = (E) data[--manyItems];
		data[manyItems] = null; //For the garbage collector
		return answer;
	}
	
	public void push(E item)
	{
		if(manyItems == data.length)
			ensureCapacity(manyItems*2+1);
		
		data[manyItems] = item;
		manyItems++;
	}
	
	public int size()
	{
		return manyItems;
	}
	
	public void trimToSize()
	{
		Object[] trimmedArray;
		
		if(data.length != manyItems)
		{
			trimmedArray = new Object[manyItems];
			System.arraycopy(data, 0, trimmedArray, 0, manyItems);
			data = trimmedArray;
		}
	}
}
