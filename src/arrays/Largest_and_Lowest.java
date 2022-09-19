package arrays;

import java.util.Arrays;

public class Largest_and_Lowest {
	public static void main(String[] args) {
		int marks[] = {1000,2000,250,400};
		System.out.println(Arrays.toString(marks));
		int i;
		int maxNo = marks[0];
		int minNo = marks[0];
		int j;
		for (i = 0; i < marks.length; i++) {
			if (maxNo < marks[i]) {
				maxNo = marks[i];
			}
		}
		System.out.println("maximum of the Array =" + maxNo);

			for (j = 0; j < marks.length; j++) {

				if (minNo > marks[j]) {
					minNo = marks[j];
				}
			}
			System.out.println("minimum no = " + minNo);
		
		for (i = 0; i < marks.length; i++) {
			if (maxNo < marks[i]) {
				maxNo = marks[i];
			} else if (minNo > marks[i]) {
				minNo = marks[i];
			}
		}
		
	}
}
