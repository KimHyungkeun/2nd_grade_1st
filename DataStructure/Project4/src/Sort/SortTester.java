package Sort;

public class SortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data1 = { 100,180,170,190,130,140,110,120,150,160,80,10,50,70,60,90,20,30,40,0 };
		int[] data2 = { 100,180,170,190,130,140,110,120,150,160,80,10,50,70,60,90,20,30,40,0 };
		int[] data3 = { 100,180,170,190,130,140,110,120,150,160,80,10,50,70,60,90,20,30,40,0 };
		int[] data4 = { 100,180,170,190,130,140,110,120,150,160,80,10,50,70,60,90,20,30,40,0 };
		Sort sort = new Sort();
		
		System.out.println("SelectionSort");
		sort.selectionsort(data1,0,data1.length);
		
		System.out.println("InsertionSort");
		sort.insertionsort(data2,0,data2.length);
		
		System.out.println("MergeSort");
		sort.mergesort(data3,0,data3.length);
		
		System.out.println("QuickSort");
		sort.quicksort(data4,0,data4.length);
	}

}
