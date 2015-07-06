package com.count;

public class CountOccurances {

	public static void main(String[] args)
	{
		int a[] = {1,2,3,3,4,5};
		 int left = getLeftMostPosition(a, -1, a.length-1, 3);
		    int right = getRightMostPosition(a, 0, a.length-1, 3);
		 int key=3;
		    // What if the element doesn't exists in the array?
		    // The checks helps to trace that element exists
		   int occurance= (a[left] == key && key == a[right])?
		           (right - left + 1) : 0;
		           
		           System.out.println("Floor Problem="+occurance);
	}
	
	private static int getLeftMostPosition(int a[], int low, int hi, int key)
	{
		while(hi-low >1)
		{
			int mid = low + (hi-low)/2;
			if(key<=a[mid])
				hi = mid;
			else
				low = mid;
			
		}
		return hi;
	}
	
	private static int getRightMostPosition(int[] a, int low, int hi, int key)
	{
		while(hi - low >1)
		{
			int mid = low + (hi -low)/2;
			if(key>=a[mid])
			{
				low = mid;
				
			}
			else
				hi = mid;
		}
		return low;
	}
}
