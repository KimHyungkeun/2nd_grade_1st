package Sort;

public class Sort {
	
	//Precondition : data has at liast n components starting at data[first]
	//Postcondition : The elements of data have been rearranged so
	//that data[first] <= data[first+1] <= ... <= data[first + n - 1]
	public void selectionsort(int[] data,int first,int n)
	{
		int i,j; //Loop control variables
		int big; //Index of largest value in data[first]...data[first+i]
		int temp;//Used during the swapping of two array values
		
		
		for(i=n-1;i>0;i--)
		{
			//Calculate big as the index of the largest value in data[first]...data[first+i];
			big = first;
			for(j=first+1;j<=first+i;j++)
				if(data[big] < data[j])
					big = j;
			
			//swap data[first+i]with data[big]
			temp = data[first +i];
			data[first+i]=data[big];
			data[big]=temp;
			
			for(int k=0;k<n;++k)
				System.out.print(" "+data[k]);
			
			System.out.println();
		}
	}
	
	    //Precondition : data has at liast n components starting at data[first]
		//Postcondition : The elements of data have been rearranged so
		//that data[first] <= data[first+1] <= ... <= data[first + n - 1]
	public void insertionsort(int[] data,int first,int n)
	{
		
		
		for(int i = first+1;i<n;i++)
		{
			
			int temp = data[i];
			int j;
			for(j = i-1 ; j >= 0 && temp < data[j] ; j--){
			data[j+1] = data[j];
			
		}
			
			data[j+1] = temp;
			
			for(int k=0;k<n;++k)
				System.out.print(" "+data[k]);
		  System.out.println();
		
		}
	}
	
	//Sort an array of integers from smallest to largest
	//Parameter : 
	//data - the array to be sorted
	//first - the start index for the portion of the arrat that will be stored
	//n - the number of elements to sort
	//Precondition:
	//data[first] through data[first + n - 1]are valid parts of the array
	//Postcondition:
	//If n is zero or negative, then no work is done. Otherwise, the elements of data have been
	//rearranged so that data[first] <= data[first+1] <= data[first + n -1]
	//Throws : ArrayIndexOutOfBoundsException
	//Indicates that first + n - 1 is an index beyond the end of the array
	//Throws : OutOfMemoryError
	//Indicates insufficient memory of creating a temporary array in the merge step.
	
	public void mergesort(int data[], int first,int n)
	{
		int n1; //Size of the first half of the array
		int n2; //Size of the second half of the array
		
		if(n>1)
		{
			n1 = n / 2;
			n2 = n - n1;
			
			mergesort(data,first,n1); //Sort data[first] through data[first + n - 1]
			mergesort(data,first+n1,n2); //Sort data[first+n1] to the end
			
			//Merge the two sorted halves
			merge(data,first,n1,n2);
			
		}
		
		
		
	}
	//Precondition : data has at least n1+n2 components starting at data[first]. The first
	//n1 elements (from data[first] to data[first + n - 1]are sorted from smallest
	//to largest, and the last n2(from data[first + n] to data[first + n1 + n2 - 1]) are also
	//sorted from smallest to largest
	//Postcondition : Starting at data[first],n1 + n2 elements of data
	//have been rearranged to be sorted from smallest to largest.
	//Note : An OutOfMemoryError can be thrown if there is insufficient
	//memory for an array of n1+n2 ints
	public void merge(int[] data,int first,int n1,int n2)
	{
		int[] temp = new int[n1+n2];
		int copied = 0;
		int copied1 = 0;
		int copied2 = 0;
		int i;
		
		
		while((copied1 < n1) && (copied2 < n2))
		{
			if(data[first + copied1] < data[first + n1 + copied2]){
				temp[copied] = data[first + copied1];
				copied++;
				copied1++;
			}
			else{
				temp[copied] = data[first + n1 + copied2];
				copied++;
				copied2++;
			}
		}
		
		while(copied1 < n1)
			temp[copied++] = data[first + (copied1++)];
		
		for(i=0;i<copied;i++){
			data[first + i] = temp[i];
		    
		}
		
		for(int k=0;k<data.length;++k)
			System.out.print(" "+data[k]);
		
		System.out.println();
	}
	
	//Precondition : data has at least n components starting at data[first]
	//Postcondtion : The elements of data have been rearranged so
	//that data[first] <= data[first + 1] <= ... <= data[first + n - 1]
	public void quicksort(int[] data,int first,int n)
	{
		int pivotIndex; //Array index for the pivot element
		int n1; //Number of elements before the pivot element
		int n2; //Number of elements after the pivot element
		
		
		if(n>1)
		{
			//Partition the array, and set the pivot index
			pivotIndex = partition(data,first,n);
			
			//Compute the sizes of the two pieces
			n1 = pivotIndex - first;
			n2 = n - n1 -1;
			
			//Recursive calls will now sort the two pieces
			quicksort(data,first,n1);
			quicksort(data,pivotIndex + 1,n2);
			
			
		}
		
			
	}
	
	//Precondition : n>1, and data has at least n elements starting at
	//data[first]
	//Postcondition : The method has selected some "pivot value" that occurs
	//in data[first] ... data[first + n - 1]. The elements of data have then been
	//rearranged and the method returns a pivot index so that
	// data[pivot index] is equal to the pivot
	// each element before data[pivot index] is <= the pivot
	// each element after data[pivot index] is > the pivot
	public int partition(int[] data,int first,int n)
	{
		int pivot;
		int tooBigIndex;
		int tooSmallIndex;
		
		pivot = data[first];
		tooBigIndex = first + 1;
		tooSmallIndex = first + n - 1;
		
		
		while(tooBigIndex <= tooSmallIndex){	
			while( (data[tooBigIndex] <= pivot) && (tooBigIndex < tooSmallIndex))
				tooBigIndex++;
			
			//System.out.println("("+data[tooBigIndex]+","+pivot+")");
			
			while( (data[tooSmallIndex] > pivot))
			    tooSmallIndex--;
			
			//System.out.println("("+data[tooSmallIndex]+","+pivot+")");
			
			if(tooBigIndex < tooSmallIndex){
				 int temp; 
				 temp = data[tooBigIndex];
				 data[tooBigIndex] = data[tooSmallIndex];
				 data[tooSmallIndex] = temp;
			}
			
			else
				break;
		}
		
		
		data[first] = data[tooSmallIndex];
		data[tooSmallIndex] = pivot;
		
		for(int k=0;k<data.length;++k)
		System.out.print(" "+data[k]);
		System.out.println();
		
		return tooSmallIndex;
	}
	
	
	
}
