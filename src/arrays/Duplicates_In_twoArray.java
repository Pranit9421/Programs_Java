package arrays;

public class Duplicates_In_twoArray 
{
	public static void main(String[]args) 
	{
		int a[] = new int [4];
		a[0]= 40;
		a[1]= 10;
		a[2]= 20;
		a[3]= 30;
				 
		int b[] = new int[4];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=400;
		int i;
		int j;
        for (i=0;i<a.length; i++) 
        {
        	for(j=0;j<b.length;j++)
        	{
        	if(a[i] == b[j]) 
        	{
        		System.out.println(a[i]);
        	}
		  }
        } 		
	}
	
	
	
	
	
	
	

}
