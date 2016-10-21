package arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr = {2,3,4,6,9,11,12,15};
		swap(arr,0, arr.length-1);
		//if(checkHalfway(arr,12,0, arr.length-1)){
			//System.out.println("The number you are searching for is less than the value in the middle of the array");
		//}else{
			//System.out.println("The number you are searching for is greater than is equal to the value in the middle of the array");
		}
	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
		
		
	}
	
	
	
	
/**
 * returns true if searchValue is less than the element
 * halfway between beginning and end
 * @param arr the int[] to be searched 
 */
	private static void checkHalfway(int[] arr, int searchValues, int begin, int end) {
		if (searchValues < arr[(begin + end + 1) /2 ]);
			
		}
		
	}
