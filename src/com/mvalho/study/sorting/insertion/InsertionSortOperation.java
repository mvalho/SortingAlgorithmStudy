package com.mvalho.study.sorting.insertion;

import com.mvalho.study.sorting.Sort;

public class InsertionSortOperation implements Sort {

	@Override
	public int[] sortArray(int[] arrayToSort) {
		/*
		 * In Insertion Sort, key will be always the position 1 (position starts at 0)
		 */
		int key, j;
		
		/*
		 * Loop starts at position 1 instead of 0. This is because Insertion Sort always starts in position 1.
		 */
		for (int i = 1; i < arrayToSort.length; i++) {
			/*
			 * key is setted to the actual i position in array 
			 */
			key = arrayToSort[i];
			
			/*
			 * j is setted to be the number of time the key must compare with the previous numbers.
			 */
			j = i - 1;
			
			/*
			 * Depending the number of J. Key will be compared with its predecessors 
			 * It means, if the loop is, for example, at position five.
			 * Key (position 5) will be compared with positions: 4, 3, 2, 1 and 0.
			 * The loop must be break when key find a value where it is greater than or J is smaller than 0.
			 */
			while( j >= 0 && key < arrayToSort[ j ] ) {
				/*
				 * When the array at J position is greater than key,
				 * The key position in the array is relocated with the value of J position. 
				 */
				arrayToSort[ j+1 ] = arrayToSort[ j ];
				
				/*
				 * Than J position is decremented 
				 */
				j--;
			}
			
			/*
			 * and the new position is setted to key value.
			 */
			arrayToSort[ j+1 ] = key;
		}
		
		return arrayToSort;
	}

}
