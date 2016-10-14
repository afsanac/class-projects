package arrays;

import java.lang.reflect.Array;

public class ArraysMain {
	
	
	public static void main(String[] args){
		//This is how you time how you quickly a computer processes
		long startTime = System.currentTimeMillis();

		long endTime = System.currentTimeMillis();
		System.out.println("Completed method is " + (endTime - startTime) + " millieseconds");
	}
	
	public static void passByValueDemostration(){
		String[] someStrings = new String[100];
		populateArray(someStrings);
		printArray(someStrings);
		//in this method, we pass the ELEMENT
		//(a variable) not the array, so
		//no change will be made
		changeString(someStrings[99]);		
		changeArray (someStrings);
		System.out.println("After \"changeArray"\);
		
		int ten = 10;
		increase(ten);
	}
	
	
	private static void changeArray(String[] someStrings) {
		// TODO Auto-generated method stub
		
	}


	// this method does nothing since local variables are destroyed when the method is complete
	private static void increase(int x) {
		x = x + 1;
		
	}

	private static void changeString(String s) {
		s = "This string has been changed";
		
	}

	private static void printArray(String[] array) {
		for (String s : array){
			System.out.println(s);
		}
	}

	private static void populateArray(String[] array) {
		for(int index = 0; index < array.length; index++) {
			array[index] = "value " + (index + 1);
		
		}
	}

	public static void arrayIntroMethod(){
		//construct 2 integers arrays
		//these two methods do the same thing
		//primitive type arrays fill with ZEROES 0, 0.0, false
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
		
		//example
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		//WHEN TO USE THIS FOR LOOP
		//	-the index for the is important to reference
		//	-you need to customize how you iterate
		//(increase by 2, backwards, etc...)
		for(int index = 0; index< booleans.length; index ++){
			System.out.println(index+ (" ") + booleans[index]);
		}
		
		//SECOND METHOD: "FOR-EACH"
		//always goes in order, does not keep track of index
		//easier to type
		for(boolean b: booleans){
			System.out.println(b + "");
		}
		
		//these two constructor are different
		String[] strings1 = { "", "", "" };
		String[] strings2 = new String[3];
		
		
		
		for(int index = 0; index < strings2.length; index ++){
			strings2[index] = "Value " +(index+1);
		}
		
		//this loop prints the strings
		for(String s : strings2){
			System.out.println(s);
		}
			
			
		}
	}

