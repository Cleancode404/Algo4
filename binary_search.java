//import java.util.Arrays;
// public class BinarySearch
// {
	// public static int indexOf(int [] a, int key)
	// int lo =0;
	// int hi = a.length -1;
	// while (lo <= hi)
	// {
		// int mid = lo + (hi - lo)/2;
		// if 		(key < a[mid])hi = mid -1;
		// else if (key > a[mid])lo = mid + 1;
		// else					return mid;
		
	// }
	// return -1;
// }


// public static void main(STRING[] args)
// {
	// In in = new In(args[0]);
	// int [] whitelist = in.readAllInts();
	
	// Arrays.sort(whitelist);
	
	// While (!StdIn.isEmpty())
	// {
		// int key = StdIn.readInt();
		// if (indexOf(whitelist, key) == -1)
			// StdOut.printIn(key);
	// }
// }//


class BinarySearchExample{
 public static void binarySearch(int arr[], int first, int last, int key){
   int mid = (first + last)/2;
   while( first <= last ){
      if ( arr[mid] < key ){
        first = mid + 1;   
      }else if ( arr[mid] == key ){
        System.out.println("Element is found at index: " + mid);
        break;
      }else{
         last = mid - 1;
      }
      mid = (first + last)/2;
   }
   if ( first > last ){
      System.out.println("Element is not found!");
   }
 }
 public static void main(String args[]){
		int arr[] = {10,20,30,40,50};
		int key = 30;
        int last=arr.length-1;
		binarySearch(arr,0,last,key);	
 }
}
