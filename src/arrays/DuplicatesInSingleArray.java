package arrays;

import java.util.Set;
import java.util.HashSet;


public class DuplicatesInSingleArray {
	public static void main(String[] args) {
		int values[] = { 100, 200, 300, 100,100,100 };
		int i;
		int j;
		for (i = 0; i < values.length; i++) {
			for (j = i + 1; j < values.length; j++) {
				if (values[i] == values[j]) {
					System.out.println("duplicates no : " + values[i]);
					
				}
			}

		}
		findDuplicatesWithSet();
	}
	
public static void findDuplicatesWithSet()
{
	int no[]= {400,450,450,100,200};	
	Set<Integer> duplicateNo = new HashSet<>();
	for(int e : no) {
		if(!duplicateNo.add(e)) // this will return boolean and HashSet is not adding dupicate and when it going to add it return false and 
			//with ! this we convert it true and will capture
			System.out.println(e);
		{
			
		}
		
		
	}
}
}
