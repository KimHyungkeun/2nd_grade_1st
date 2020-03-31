package BTree;

public class IntBalancedSet implements Cloneable{     
    
    private static final int MINIMUM =2;     
    private static final int MAXIMUM = 2*MINIMUM;     
    int dataCount;   
    int[] data;     
    int childCount;  
    IntBalancedSet [] subset;     
   
    /**
     * Initialize an empty set.
     * @param - none
     * <dt><b>Postcondition:</b><dd>
     *   This set is empty.
     * @exception OutOfMemoryError
     *   Indicates insufficient memory for adding a new element.
     **/
    public IntBalancedSet(){     
         data =new int[MAXIMUM+1];     
         subset=new IntBalancedSet[MAXIMUM + 2];     
    }     
    
    /**
     * Add a new element to this set.
     * @param  <CODE>element</CODE>
     *   the new element that is being added
     * <dt><b>Postcondition:</b><dd>
     *   If the element was already in this set, then there is no change.
     *   Otherwise, the element has been added to this set.
     * @exception OutOfMemoryError
     *   Indicates insufficient memory for adding a new element.
     **/
    public void add(int element){     
        looseAdd(element);     
        
        if(dataCount>MAXIMUM){     
            IntBalancedSet cpy=copyData();     
            data =new int[MAXIMUM+1];     
            dataCount=0;     
            childCount=dataCount+1;     
            subset=new IntBalancedSet[MAXIMUM + 2];     
            subset[0]=cpy;     
            fixExcess(0);     
        }     
    }     
   
    
    // Precondition:
    //   The entire B-tree is valid.
    // Postcondition:
    //   If entry was already in the set, then the set is unchanged. Otherwise,
    //   entry has been added to the set, and the entire B-tree is still valid
    //   EXCEPT that the number of entries in the root of this set might be one
    //   more than the allowed maximum.

    private void looseAdd(int element){     
	    int i=firstGE(element);     
	    if(i==dataCount)
	    {     
	        
	    	if(childCount==0)
	    	{     
	            insertEle(element, i);     
	        }     
	        else
	        {     
	            subset[i].looseAdd(element);     
	            fixExcess(i);     
	        }     
	    }
	    
	    else
	    {     
	        
	    	if(data[i]==element)
	        {     
	            return;     
	        }
	        else
	        {     
	            if(childCount==0)
	            {     
	                insertEle(element, i);     
	            }     
	            
	            else
	            {     
	                subset[i].looseAdd(element);     
	                fixExcess(i);     
	            }     
	        }     
	    }     
	}

	private void insertEle(int element,int locale){     
        for(int i=dataCount;i>locale;i--){     
            data[i]=data[i-1];     
        }     
        data[locale]=element;     
        dataCount++;     
        //System.out.println(dataCount+"  "+childCount);     
    }     
   
    private void divoteSub(IntBalancedSet set1,IntBalancedSet set2,int i){     
        System.arraycopy(subset[i].data,0, set1.data, 0, MINIMUM);     
        System.arraycopy(subset[i].subset,0, set1.subset, 0, MINIMUM+1);     
        System.arraycopy(subset[i].data, MINIMUM+1, set2.data, 0, MINIMUM);     
        System.arraycopy(subset[i].subset,MINIMUM+1, set2.subset, 0, MINIMUM+1);     
        set1.dataCount=MINIMUM;     
        set1.childCount=subset[i].childCount/2;     
        set2.dataCount=MINIMUM;     
        set2.childCount=subset[i].childCount/2;     
             
    }     
   
 // Precondition: 
    //   (i < childCount) and the entire B-tree is valid EXCEPT that
    //   subset[i] has MAXIMUM + 1 entries. Also, the root is allowed to have
    //   zero entries and one child.
    // Postcondition: 
    //   The tree has been rearranged so that the entire B-tree is valid EXCEPT
    //   that the number of entries in the root of this set might be one more than
    //   the allowed maximum.
    private void fixExcess(int i){     
        if(subset[i].dataCount>MAXIMUM){     
            IntBalancedSet set1=new IntBalancedSet();     
            IntBalancedSet set2=new IntBalancedSet();     
            insertEle(subset[i].data[MINIMUM], i);//在父节点插入该中间元素.     
            divoteSub(set1, set2, i);     
            subset[i]=set1;     
            for(int j=childCount;j>i+1;j--){     
                subset[j]=subset[j-1];     
            }     
            subset[i+1]=set2;     
            childCount++;     
            //System.out.println(data[0]);     
        }     
    }     
    
    
    private IntBalancedSet copyData(){     
        IntBalancedSet copy;     
        copy=new IntBalancedSet();     
        copy.data=data;     
        copy.dataCount=dataCount;     
        copy.childCount=childCount;     
        copy.subset=subset;     
        return copy;     
    }     
    /**
     * Generate a copy of this set.
     * @param - none
     * @return
     *   The return value is a copy of this set. Subsequent changes to the
     *   copy will not affect the original, nor vice versa. Note that the return
     *   value must be type cast to an <CODE>IntBalancedSet</CODE> before it 
     *   can be used.
     * @exception OutOfMemoryError
     *   Indicates insufficient memory for creating the clone.
     **/ 
    public Object clone(){     
        IntBalancedSet copy;     
        copy=new IntBalancedSet();     
        copy.data=data.clone();     
        copy.dataCount=dataCount;     
        copy.childCount=childCount;     
        copy.subset=subset.clone();     
        return copy;     
             
    }    
    
    /**
     * Accessor method to determine whether a particular element is in this set.
     * @param <CODE>target</CODE>
     *   an element that may or may not be in this set
     * @return
     *   <CODE>true</CODE> if this set contains <CODE>target</CODE>;
     *   otherwise <CODE>false</CODE>
     **/
    public boolean contains(int target){     
        int i=firstGE(target);     
        //System.out.println("i:"+i);     
        if(i==dataCount){     
            if(childCount==0)     
                return false;     
            else    
                return subset[i].contains(target);     
            }     
        else{     
            if(target==data[i])     
                {     
                return true;     
                }     
            else{     
                if(childCount==0)     
                    return false;     
                else    
                    return  subset[i].contains(target);     
            }     
                     
        }     
        }     
    
    // Postcondition: The return value, x, is the first location in the root
    // such that data[x] >= target. If there is no such location, then the
    // return value is dataCount.
    private int firstGE(int target){     
        int i=0;     
        for(;i<dataCount;i++){     
            if(data[i]>=target)     
                return i;     
        }     
        return i;     
    }     
    /**
    * Remove a specified element from this set.
    * @param <CODE>target</CODE>
    *   the element to remove from this set
    * <dt><b>Postcondition:</b><dd>
    *   if <CODE>target</CODE> was found in this set, then it has been removed
    *   and the method returns <CODE>true</CODE>. Otherwise this set remains
    *   unchanged and the method returns <CODE>false</CODE>.
    **/
    public boolean remove(int target){     
        boolean answer = looseRemove(target);     
          
        if((dataCount==0)&&(childCount==1))
        {     
            dataCount=subset[0].dataCount;     
            childCount=subset[0].childCount;     
            data=subset[0].data;     
            subset=subset[0].subset;     
        }     
        return answer;     
    }     
   
 // Precondition:
    //   The entire B-tree is valid.
    // Postcondition:
    //   If target was in the set, then it has been removed from the set and the
    //   method returns true; otherwise the set is unchanged and the method 
    //   returns false. The entire B-tree is still valid EXCEPT that the
    //   number of entries in the root of this set might be one less than the
    //   allowed minimum.
    private boolean looseRemove(int target){     
        int i=firstGE(target);     
        if(childCount==0){     
            if(i!=dataCount&&data[i]==target){     
                   
                cover(i);     
                return true;     
            }else{     
                return false;     
            }     
        }else{     
            if(i!=dataCount&&data[i]==target){     
               
                data[i]= subset[i].removeBiggest();     
                if(subset[i].dataCount<MINIMUM)     
                    fixShortage(i);     
                return true;     
            }     
            else{     
                   
                boolean answer=subset[i].looseRemove(target);     
                if(subset[i].dataCount<MINIMUM)     
                fixShortage(i);     
                return answer;     
            }     
        }     
    }     
    // Precondition: 
    //   (i < childCount) and the entire B-tree is valid EXCEPT that
    //   subset[i] has only MINIMUM - 1 entries.
    // Postcondition: 
    //   The tree has been rearranged so that the entire B-tree is valid EXCEPT
    //   that the number of entries in the root of this set might be one less than
    //   the allowed minimum.
    private void fixShortage(int i){     
             
        if(i!=0&&subset[i-1].dataCount>MINIMUM){     
            
            subset[i].insertEle(data[i-1], 0);     
            data[i-1]=subset[i-1].cover(subset[i-1].dataCount-1);     
            if(subset[i-1].childCount!=0){     
            subset[i].addSubset(subset[i-1].coverSub(subset[i-1].childCount-1),0);     
            }     
            return;     
        }     
            if(i!=0&&subset[i-1].dataCount==MINIMUM){     
                subset[i-1].insertEle(data[i-1], subset[i-1].dataCount);     
                cover(i-1);     
                combineSub(subset[i-1],subset[i]);     
                coverSub(i);     
            return ;     
            }     
            if(i<dataCount&&subset[i+1].dataCount>MINIMUM){     
                subset[i].insertEle(data[i], subset[i].dataCount);     
                data[i]=subset[i+1].cover(0);     
                if(subset[i+1].childCount!=0){     
                    subset[i].addSubset(subset[i+1].coverSub(0), subset[i].childCount);     
                }     
                return;     
            }     
            if(i<dataCount&&subset[i+1].dataCount==MINIMUM){     
                subset[i+1].insertEle(data[i], 0);     
                cover(i);     
                combineSub(subset[i],subset[i+1]);     
                coverSub(i+1);     
                return;     
            }     
             
    }     
 
    // Precondition: 
    //   (dataCount > 0) and the entire B-tree is valid.
    // Postcondition:
    //   The largest item in the set has been removed, and the value of this
    //   item is the return value. The B-tree is still valid EXCEPT
    //   that the number of entries in the root of this set might be one less than
    //   the allowed minimum.
    private int removeBiggest(){     
        if(childCount==0){     
                 
            return data[--dataCount];     
        }else{     
            int answer = subset[childCount-1].removeBiggest();     
            if(subset[childCount-1].dataCount<MINIMUM){     
                fixShortage(childCount-1);     
            }     
            return answer;     
        }     
                 
    }     
         
   
    private void combineSub(IntBalancedSet set1,IntBalancedSet set2){     
             
        for(int i=0;i<set2.dataCount;i++){     
            //System.out.println(" combineSub "+set1.dataCount+"  "+set2.dataCount);     
            set1.data[set1.dataCount++]=set2.data[i];     
        }     
        for(int i=0;i<set2.childCount;i++){     
            set1.subset[set1.childCount++]=set2.subset[i];     
        }     
    }     
    
    private IntBalancedSet coverSub(int i){     
        IntBalancedSet answer=subset[i];     
        for(int j=i;j<childCount;j++){     
            subset[j]=subset[j+1];     
        }     
        childCount--;     
        return answer;     
    }     
     
    private int cover(int i){     
        int answer=data[i];     
        for(int j=i;j<dataCount;j++){     
            data[j]=data[j+1];     
        }     
        dataCount--;     
        return answer;     
    }     
//  private void tranferEle(int i,int flag){     
//      int dl=i+(flag==-1?0:flag);//datalocation     
//      subset[i].insertEle(data[dl], 0);     
//      data[dl]=subset[i+flag].data];     
//      if(subset[i-1].childCount!=0){     
//      subset[i-1].addSubset(subset[subset[i-1].childCount--],0);     
//          }     
//      }     
    
    private void  addSubset(IntBalancedSet sub,int l){     
        for(int i=childCount;i>l;i--){     
            subset[i]=subset[i-1];     
        }subset[l]=sub;     
        childCount++;     
    }     

 // Print a representation of this set's B-tree, useful during debugging.
    public void print(int indent){     
        final int EXTRA_INDENTATION=4;     
        int i;     
        int space;     
        for(space=0;space<indent;space++){     
            System.out.print(" ");     
        }     
        for(i=0;i<dataCount;i++){     
            System.out.print(data[i]+",");     
        }     
        System.out.print("DC:"+dataCount+"  CC:"+childCount);     
        System.out.println();     
        for(i=childCount-1;i>=0;i--){     
            subset[i].print(indent+EXTRA_INDENTATION);     
        }     
 }
}