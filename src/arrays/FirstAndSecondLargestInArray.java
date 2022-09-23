package arrays;

public class FirstAndSecondLargestInArray {
	public static void main(String[]args) {
		int array [] = {100,24,26,27,28,300};

		for(int i =0; i<array.length ; i++) {
			if(array[0]<array[i]) 
			{
				array[0]=array[i];
			}
			else if (array[1]>array[i]) {
				array[1]=array[i];
			}
		}
		System.out.println("largest in the arrays= "+array[0]);
		System.out.println("smallest in the array= "+array[1]);
	}
	
	
	
	
	
	
	
	
	
}



