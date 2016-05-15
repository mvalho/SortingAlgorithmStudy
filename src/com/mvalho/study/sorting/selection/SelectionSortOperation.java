package com.mvalho.study.sorting.selection;

import com.mvalho.study.sorting.Sort;

public class SelectionSortOperation implements Sort{

	@Override
	public int[] sortArray(int[] arrayToSort) {
		int min, temp;
		for (int i = 0; i < arrayToSort.length; i++) {
			min = i;
			for (int j = i+1; j < arrayToSort.length; j++) {
				if( arrayToSort[j] < arrayToSort[min] ) {
					min = j;
				}
			}
				
			temp = arrayToSort[i];
			arrayToSort[i] = arrayToSort[min];
			arrayToSort[min] = temp;
		}
		
		return arrayToSort;
	}
	
}
