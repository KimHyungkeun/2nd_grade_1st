/**
 * Master class of BTreeNodes
 * 
 * @author Phryxia (=Se Kyu Kwon)
 */

public class BTreeInt implements IntSet
{

	private BTreeNode root;
	
	/**
	 * Simple constructor
	 * 
	 * Create a empty node inside the tree
	 */
	public BTreeInt()
	{
		// Create empty root
		root = new BTreeNode();
	}
	
	/**
	 * Add specified value.
	 * Note that duplicated value will not be added.
	 */
	@Override
	public void add(int x)
	{
		if(root.search(x) == null)
		{
			BTreeNode newRoot = root.add(x);
			
			if(newRoot != null)
			{
				root = newRoot;
			}
		}
	}

	@Override
	public boolean remove(int x)
	{
		root = root.remove(x);
		return false;
	}

	/**
	 * Return whether specified value exists in this set.
	 */
	@Override
	public boolean contains(int x)
	{
		return root.search(x) != null;
	}

	/**
	 * Clone the set using BTreeNode.clone()
	 */
	@Override
	public IntSet clone()
	{
		BTreeInt result = new BTreeInt();
		result.root = root.clone();
		return result;
	}
	
	public String toString()
	{
		return root.toString();
	}

}
