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
		if (searchValues < arr[(begin + end + 1) /2 ]){
			
		}
		
	}


	public static int countUnderBound(double[] arr, double d){
		int ctr = 0;
		for( int index = 0; index < arr.length; index++ ){
			if (arr[index] < d){
				ctr++;
			}
		}
		return ctr;
	}
	
	public static int[] getSubArray(int[] arr, int startIndex, int endIndex){
		int[] subArray = new int [endIndex - startIndex +1];
		for(int i = 0; i < subArray.length; i++){
			subArray[i] = arr[startIndex + i];
		}
		return subArray;
	}
	
	public static boolean contains(int[] arr, int[] subArray){
		for ( int i = 0; i < arr.length; i++){
				int j = 0;
				while(j < arr.length){
					if(subArray[j] == arr[i + j] && j == subArray.length-1){
					System.out.println("Found a match ");
					return true;
					}else if(subArray[j] != arr[i + j]){
						break;
					}
					j++;
				}
			}
		return false;
		}
	}
