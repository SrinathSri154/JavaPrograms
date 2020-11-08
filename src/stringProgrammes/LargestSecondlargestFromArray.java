package stringProgrammes;

public class LargestSecondlargestFromArray {

	public static void main(String[] args) {
	
		
		int largestNumber = 0;
		int SecondLargestNumber = 0;
		
	//String[] array1= {"Srinath","Sri"};
	//char[] array2 = {'s','2','r'}; 
		
		int[] array = new int[]{1,300,450,6,898,900};
		
		for(int i=0;i<array.length;i++) {
			
			
			if(array[i]>largestNumber) {
				
				SecondLargestNumber = largestNumber; //50
				largestNumber = array[i]; //98
					}
			else if(array[i]>SecondLargestNumber)
			{
				SecondLargestNumber = array[i];//97
			}
			
			
			
		}	
		
		System.out.println("Largest number in array is : " + largestNumber );
		System.out.println("SecondLargest number in array is : " + SecondLargestNumber );
	}

}
