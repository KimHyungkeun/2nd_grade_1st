import java.util.Queue;
import java.util.LinkedList;

/**
 * An implementation of IntSet using B-Tree.
 * Note that this set doesn't allowed duplicated elements.
 * 
 * @author Phryxia (= Se kyu kwon)
 *
 */

public class BTreeNode implements Cloneable
{
	// MAX_SIZE = MIN_SIZE * 2
	private static int MIN_SIZE = 2;
	private static int MAX_SIZE = 4;
	
	private int         size;
	private int[]       data;
	private BTreeNode   parent;
	private BTreeNode[] subTree;
	
	
	
	/**
	 * Simple constructor
	 * 
	 * Create a empty node.
	 * It's parent is null, it's subTrees are also null.
	 */
	public BTreeNode()
	{
		/*
		 * The reason why gives them one more space
		 * is to make easy to write safe code when
		 * child's element was passed to parent.
		 */
		size    = 0;
		data    = new int[MAX_SIZE+1];
		parent  = null;
		subTree = new BTreeNode[MAX_SIZE+2];
	}
	
	
	
	/**
	 * Very important method to handle BTree safely.
	 * This will add a node into it's subTree.
	 * 
	 * This doesn't recursive algorithm.
	 * 
	 * @param node : can be null pointer.
	 * @param index
	 */
	private void assignSubTree(BTreeNode node, int index)
	{
		if(node != null)
		{
			node.parent = this;
		}
		this.subTree[index] = node;
	}
	
	/**
	 * Add one elements in this system.
	 * Return value is 'new root'.
	 * If there is no change, null will be
	 * returned.
	 * 
	 * @param x
	 * @return New root node of this system
	 */
	public BTreeNode add(int x)
	{
		// First, search the insert point
		int ipoint = insert_ipoint(x);
			
		// Second, insert data
		if(subTree[ipoint] == null)
		{
			// There is no child at all, so add here.
			insert(x, ipoint);
			return fixUp();
		}
		else
		{
			// Not in my business
			return subTree[ipoint].add(x);
		}
	}

	/**
	 * Helper method to perform insertion sort
	 * more easily. Note that this doesn't protect
	 * from boundary exception.
	 * 
	 * This doesn't use recursive algorithm.
	 * 
	 * @param x
	 * @return
	 */
	private int insert_ipoint(int x)
	{	
		/*
		 * This use binary search algorithm.
		 * 
		 * Note that subTree[k]'s element < data[k].
		 * This means, if you examine x with data[k]
		 * and x < data[k], you might look left side
		 * which data[k] inclusive.
		 * 
		 * Because, if you dont't include k-th value
		 * you might struggle for too small right bound.
		 */
		if(size == 0)
		{
			return 0;
		}
		else
		{
			int lpoint = 0;
			int rpoint = size-1;
			int mid;
			while(lpoint < rpoint)
			{
				mid = (lpoint + rpoint)/2;
			
				if(x <= data[mid])
				{
					// new element should put in left side.
					rpoint = mid;
				}
				else
				{
					// new element should put in right side.
					lpoint = mid+1;
				}
			}
		
			// At this time, lpoint == rpoint.
			if(x <= data[lpoint])
			{
				return lpoint;
			}
			else
			{
				return lpoint + 1;
			}
		}
	}
	
	/**
	 * Helper method to add value directly to the node.
	 * After you use this, you must check the validality.
	 * This is the only one who add the size directly.
	 * 
	 * This doesn't use recursive algorithm.
	 * 
	 * @param x
	 * @param ipoint
	 */
	private void insert(int x, int ipoint)
	{
		++size;
		
		// Shift values until insertion point
		for(int i=size-2; i>=ipoint; --i)
		{
			data[i+1] = data[i];
			subTree[i+2] = subTree[i+1];
		}
		data[ipoint] = x;
	}
	
	/**
	 * When this node has MAX_SIZE + 1 elements, this should
	 * be splitten into 2 parts, and center value should be
	 * passed to the parent.
	 * 
	 * @return
	 */
	private BTreeNode fixUp()
	{
		if(size > MAX_SIZE)
		{	
			// Split this node into two pieces
			BTreeNode lChild = extract(0);
			BTreeNode rChild = extract(MIN_SIZE+1);
		
			// If there is no parent, just make a new node.
			if(parent == null)
			{
				parent = new BTreeNode();
			}
			
			int ipoint = parent.insert_ipoint(data[MAX_SIZE/2]);
			
			parent.insert(data[MAX_SIZE/2], ipoint);
			parent.assignSubTree(lChild, ipoint);
			parent.assignSubTree(rChild, ipoint+1);
		
			return parent.fixUp();
		}
		else
		{
			// There is no issue in this node
			if(parent == null)
			{
				// We are reached on the top of the tree
				return this;
			}
			else
			{
				return parent.fixUp();
			}
		}
	}
	
	/**
	 * Extract left/right half from excess BTreeNode.
	 * Note that every subtrees of targeted node should
	 * point it's mother as split one.
	 * 
	 * This doesn't use recursive algorithm.
	 * 
	 * @param startPos
	 * @return
	 */
	private BTreeNode extract(int startPos)
	{
		BTreeNode child = new BTreeNode();
		
		// Copy it's partial data
		for(int i=0; i<MIN_SIZE; ++i)
		{
			child.insert(data[startPos + i], child.insert_ipoint(data[startPos + i]));
		}
		
		// Copy it's partial subtrees
		for(int i=0; i<=MIN_SIZE; ++i)
		{
			child.assignSubTree(subTree[startPos + i], i);
		}
		
		return child;
	}
	
	/**
	 * Search BTreeNode which contains x.
	 * If there is no such BTreeNode, null will be returned.
	 * 
	 * @param x
	 * @return
	 */
	public BTreeNode search(int x)
	{
		if(size == 0)
		{
			return null;
		}
		else
		{
			// Determine search point
			int searchPoint = size;
			for(int i=0; i<size; ++i)
			{
				if(x <= data[i])
				{
					searchPoint = i;
					break;
				}
			}
			
			if(searchPoint < size && x == data[searchPoint])
			{
				// If there is an such element in this node
				return this;
			}
			else if(subTree[searchPoint] != null)
			{
				// If there is no such element, but it may be in subTrees
				return subTree[searchPoint].search(x);
			}
			else
			{
				// There is no subTrees at all.
				return null;
			}
		}
	}

	public BTreeNode remove(int x)
	{
		// Search the position of designated value
		int ipoint = insert_ipoint(x);
		
		if(0 <= ipoint && ipoint < size && x == data[ipoint]) // Is there exist such element?
		{
			// There is such element in this node
			BTreeNode fixNode;
			if(isLeaf())
			{
				/*
				 * This node is leaf.
				 * 
				 * Just simply remove the element.
				 */
				for(int i=ipoint; i<size-1; ++i)
				{
					data[i] = data[i+1];
				}
				--size;
				
				fixNode = this;
			}
			else
			{
				/*
				 * This node is non-leaf.
				 * 
				 * Copy the value from sub-set {x : x < data[ipoint]} = subTree[ipoint]
				 */
				int maxValue = subTree[ipoint].getMaxValue(); // It returns just maximum value.
				fixNode = subTree[ipoint].removeMaxValue();   // It returns where you should start fixing
				data[ipoint] = maxValue;
			}
			
			return fixNode.fixShortage();
		}
		else
		{
			/*
			 *  There is no such element in this node.
			 */
			if(subTree[ipoint] != null) // Is this node non-leaf?
			{
				// This node is non-leaf
				return subTree[ipoint].remove(x); // Not in my business
			}
			else
			{
				// This node is leaf
				return fixShortage();
			}
		}
	}
	
	private boolean isRoot()
	{
		return parent == null;
	}
	
	private boolean isLeaf()
	{
		return subTree[0] == null;
	}
	
	/**
	 * 
	 * @return
	 */
	private BTreeNode fixShortage()
	{
		if(isRoot() || size >= MIN_SIZE)
		{
			/*
			 * Root can have elements less then MIN_SIZE
			 */
			if(size == 0)
			{
				/*
				 * There are two case when root is null
				 * 
				 * i)  0-Level Tree with no data
				 * ii) 1-Level subTrees were merged
				 */
				if(isLeaf())
				{
					return this;
				}
				else
				{
					subTree[0].parent = null;
					return subTree[0];
				}
			}
			else
			{
				/*
				 * In this case, there is no problem in the
				 * system. All you have to do is searching
				 * root.
				 */
				if(isRoot())
				{
					return this;
				}
				else
				{
					return parent.fixShortage();
				}
			}
		}
		else
		{
			// First, you have to check previous sibling can lend to you
			int currentIndex = getCurrentSubTreeNumber();
			
			if(currentIndex > 0 && parent.subTree[currentIndex-1].size > MIN_SIZE)
			{
				// Rotate Tree into right direction
				parent.rotateRight(currentIndex-1);
			}
			else if(currentIndex < parent.size && parent.subTree[currentIndex+1].size > MIN_SIZE)
			{
				// Rotate Tree into left direction
				parent.rotateLeft(currentIndex);
			}
			else if(currentIndex > 0)
			{
				// Merge left sibling & this
				parent.merge(currentIndex-1);
			}
			else
			{
				// Merge right sibling and this
				parent.merge(currentIndex);
			}
			
			return parent.fixShortage();
		}
	}
	
	private void merge(int index)
	{
		BTreeNode newNode = new BTreeNode();
		int bias = 0;
		
		// Assign left child
		for(int i=0; i<subTree[index].size; ++i)
		{
			newNode.insert(subTree[index].data[i], i);
		}
		
		for(int i=0; i<subTree[index].size+1; ++i)
		{
			newNode.assignSubTree(subTree[index].subTree[i], i);
		}
		
		// Assign middle value from this
		newNode.insert(data[index], newNode.size);
		
		bias = subTree[index].size+1;
		
		// Assign right child
		for(int i=0; i<subTree[index+1].size; ++i)
		{
			newNode.insert(subTree[index+1].data[i], bias + i);
		}
		
		for(int i=0; i<subTree[index+1].size+1; ++i)
		{
			newNode.assignSubTree(subTree[index+1].subTree[i], bias + i);
		}
		
		subTree[index] = newNode;
		subTree[index+1] = null;
		
		// Assign newNode to this
		assignSubTree(newNode, index);
		
		// Shift right side node
		for(int i=index; i<size-1; ++i)
		{
			data[i] = data[i+1];
			subTree[i+1] = subTree[i+2];
		}
		--size;
	}
	
	/**
	 * Helper method to fixShortage
	 * 
	 * @param index
	 */
	private void rotateRight(int index) // start index is left child
	{
		// First, send root's data to right child
		subTree[index+1].insert(data[index], 0); // Note that child size increased
				
		// Second, assign left child's last subTree to the right child
		subTree[index+1].assignSubTree(subTree[index].getLastSubTree(), 0);
			
		// Third, copy the left child's last data to the root
		data[index] = subTree[index].data[subTree[index].size-1];
				
		// Last, remove right child's first data
		subTree[index].eraseRear();
	}
	
	/**
	 * Helper method to fixShortage
	 * 
	 * @param index
	 */
	private void rotateLeft(int index) // start index is left child
	{
		// First, send root's data to left child
		subTree[index].insert(data[index], subTree[index].size); // Note that child size increased
		
		// Second, assign right child's first subTree to the left child
		subTree[index].assignSubTree(subTree[index+1].getFirstSubTree(), subTree[index].size);
		
		// Third, copy the right child's first data to the root
		data[index] = subTree[index+1].data[0];
		
		// Last, remove right child's first data
		subTree[index+1].eraseFront();
	}
	
	/**
	 * Method to help rotateLeft
	 * This doesn't preserve invariant, so first subTree will be
	 * set to the next one.
	 */
	private void eraseFront()
	{
		for(int i=0; i<size-1; ++i)
		{
			data[i] = data[i+1];
			subTree[i] = subTree[i+1];
		}
		subTree[size-1] = subTree[size];
		subTree[size] = null;
		--size;
	}
	
	private void eraseRear()
	{
		subTree[size] = null;
		--size;
	}
	
	// Accessor
	private BTreeNode getFirstSubTree()
	{
		return subTree[0];
	}
	
	private BTreeNode getLastSubTree()
	{
		return subTree[size];
	}
	
	/**
	 * Helper method to search current subTree's index
	 * in the parent node. This takes O(MAX_SIZE) time
	 * complexity.
	 * 
	 * If there is no such node, or there is no parent,
	 * then -1 will be returned.
	 * 
	 * This is not recursive algorithm.
	 * 
	 * @return
	 */
	private int getCurrentSubTreeNumber()
	{
		if(parent == null)
		{
			return -1;
		}
		else
		{
			for(int i=0; i<parent.size+1; ++i)
			{
				if(parent.subTree[i] == this)
				{
					return i;
				}
			}
			return -1;
		}
	}
	
	/**
	 * This method will search the maximum value in this node's system.
	 * 
	 * This use recursive algorithm.
	 * 
	 * @return
	 */
	private int getMaxValue()
	{
		if(isLeaf())
		{
			// This node is leaf.
			return data[size-1];
		}
		else
		{
			// This node is non-leaf. Dive to the child.
			return subTree[size].getMaxValue();
		}
		
	}
	
	private BTreeNode removeMaxValue()
	{
		if(subTree[size] == null)
		{
			--size;
			return this;
		}
		else
		{
			return subTree[size].removeMaxValue();
		}
	}
	
	/**
	 * Clone this node and it's subTrees.
	 * 
	 * This method using recursive algorithm.
	 */
	public BTreeNode clone()
	{
		BTreeNode result = new BTreeNode();
		
		// Copy data
		for(int i=0; i<size; ++i)
		{
			result.insert(data[i], result.insert_ipoint(data[i]));
		}
		
		// Copy the subtrees
		for(int i=0; i<size+1; ++i)
		{
			if(subTree[i] != null)
			{
				result.assignSubTree(subTree[i].clone(), i);
			}
			else
			{
				result.subTree[i] = null;
			}
		}
		
		return result;
	}
	
	/**
	 * Make a string represent this node.
	 * Note that this method should be only called
	 * from root.
	 */
	public String toString()
	{
		String result = "";
		
		Queue <BTreeNode> bfs = new LinkedList <BTreeNode> ();
		Queue <Integer>   lev = new LinkedList <Integer> ();
		bfs.add(this);
		lev.add(0);
		
		// Using BFS, trace every nodes in the BTree
		BTreeNode temp;
		int currentLev = 0;
		while(!bfs.isEmpty())
		{
			temp = bfs.remove();

			// New Line when level is changed
			if(currentLev != lev.peek())
			{
				currentLev = lev.peek();
				result += '\n';
			}
			lev.remove();
			
			result += temp._toString() + ' ';
			
			// Iterate via every subset (except null)
			// Because queue deosn't accept null usually.
			for(int i=0; i<=temp.size; ++i)
			{
				if(temp.subTree[i] != null)
				{
					bfs.add(temp.subTree[i]);					
					lev.add(currentLev + 1);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Only return this node's data.
	 * 
	 * @return
	 */
	private String _toString()
	{
		String result = "(";
		
		for(int i=0; i<size; ++i)
		{
			result += Integer.toString(data[i]);
			if(i < size-1)
			{
				result += ", ";
			}
		}
		
		return result + ")";
	}
	
	/**
	 * Return this node's size
	 * 
	 * @return
	 */
	public int size()
	{
		return size;
	}
}
