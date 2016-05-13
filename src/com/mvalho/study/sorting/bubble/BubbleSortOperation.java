package com.mvalho.study.sorting.bubble;

import com.mvalho.study.sorting.Sort;

public class BubbleSortOperation implements Sort {

	@Override
	public int[] sortArray(int[] arrayToSort) {
		/*
		 * If the actual position of array is greater than the next one, the algorithm must swap place of the next with the actual one.
		 * temp variable holds the actual position to be swapped 
		 */
		int temp;
		for (int i = 0; i < arrayToSort.length; i++) {
			
			/*
			 * the range for the bellow loop is dinamic, it means, every loop it decrease the range for the loop
			 */
			for (int j = 0; j < arrayToSort.length - i - 1; j++) { 
				
				/*
				 * Check if the actual position is greater than the next one.
				 */
				if(arrayToSort[j] > arrayToSort[ j+1 ]) {
					/*
					 * if so, save the actual position in the temp variable...
					 */
					temp = arrayToSort[j];
					/*
					 * ... than, replace the actual position with the next...
					 */
					arrayToSort[j] = arrayToSort[ j+1 ];
					/*
					 * ... and finally, replace the next position with the value saved in temp variable
					 */
					arrayToSort[j+1] = temp;
					
					/*
					 * Here, the actual position swap its place with the next one.
					 */
				}
			}
		}
		
		return arrayToSort;
	}

}
