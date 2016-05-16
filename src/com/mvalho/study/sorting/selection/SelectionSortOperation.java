package com.mvalho.study.sorting.selection;

import com.mvalho.study.sorting.Sort;

public class SelectionSortOperation implements Sort{

	@Override
	public int[] sortArray(int[] arrayToSort) {
		int min, temp;
		/*
		 * First loop will work at total length of arrayToSort parameter.
		 */
		for (int i = 0; i < arrayToSort.length; i++) {
			/*
			 * Selection sort will always find the small number inside the array,
			 * but to do it, it must start with some value.
			 * As we don't know what's expecting inside the array, we take the first position of the array pretending that on this position the value is the smaller one. 
			 */
			min = i;
			/*
			 * Than, we interate again over the arrayToSort, but, in this second loop
			 * it will always start from i position + 1. Why?
			 * Because we already know the i position is the min (supposably), what we would like to find out now is if there is some
			 * position ahead that have a value smaller than the actual one. 
			 * Its easy to think that, for example, if we have an array with 10 position, and the actual position (i) is 5,
			 * we already know that positions 0,1,2,3 and 4 is smaller and positions 6,7,8 and 9 still need to be compared.  
			 */
			for (int j = i+1; j < arrayToSort.length; j++) {
				/*
				 * Here we compare all values from position i+1 ahead with the min position in the array
				 */
				if( arrayToSort[j] < arrayToSort[min] ) {
					/*
					 * If we find, we set the min position as j.
					 * from now, we know that the current j position hold a value smaller than the initial one.
					 */
					min = j;
				}
				/*
				 * loop will continue till the end of the array.
				 */
			}
			
			/*
			 * at this point, the second loop already find out (or not) if there is a value smaller than the value at position i.
			 * So now, we're going to reorder the array.
			 * First, we set the temp variable with the i (actual) position it the array 
			 */
			temp = arrayToSort[i];
			
			/*
			 * Supposably that we find a smaller value than the initial, we set the actual position with me valeu of the min position found.
			 * What it means, during our second loop, we found out that there is in the array on value that compared to the current one, is
			 * smaller and we must swap their position.
			 */
			arrayToSort[i] = arrayToSort[min];
			arrayToSort[min] = temp;
		}
		
		return arrayToSort;
	}
	
}
