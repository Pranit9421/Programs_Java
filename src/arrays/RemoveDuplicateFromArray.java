package arrays;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args)
	{
		RemoveDuplicateFromArray object= new RemoveDuplicateFromArray();
		
		int arrayWithDups [] = {1,2,3,4,5,6,4,5,6};
		Integer arrayWithoutDups [] = object.removeDups(arrayWithDups);
		System.out.println(Arrays.toString(arrayWithoutDups));
	}
 
	public Integer[] removeDups(int arrayWithDups []) {
		Set<Integer>set = new HashSet<>();
		
		for(int e : arrayWithDups) {
		set.add(e);
		}
		Integer arr [] = set.toArray(new Integer[set.size()]);
			 return arr;
			 
		}

	}


