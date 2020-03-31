/**
 * An IntSet is a set of int numbers.
 * 
 * @author Phryxia
 *
 */

public interface IntSet
{
	public abstract void    add(int x);
	public abstract boolean remove(int x);
	public abstract boolean contains(int x);
	public abstract IntSet  clone();
}
