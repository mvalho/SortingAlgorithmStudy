package com.mvalho.study.sorting.quick;

import com.mvalho.study.sorting.Sort;

public class QuickSortOperation implements Sort {
	private int[]  arrayToSort;
	@Override
	public int[] sortArray(int[] arrayToSort) {
		this.arrayToSort = arrayToSort;
		
		quicksort(0, this.arrayToSort.length - 1);
		return this.arrayToSort;
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		int pivot = arrayToSort[low + (high - low)/2];
		
		while(i <= j) {
			while(arrayToSort[i] < pivot) {
				i++;
			}
			
			while(arrayToSort[j] > pivot) {
				j--;
			}
			
			if(i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		
		if(low < j) {
			quicksort(low, j);
		} 
		
		if(i < high) {
			quicksort(i, high);
		}
	}

	private void exchange(int i, int j) {
		int temp = this.arrayToSort[i];
		this.arrayToSort[i] = this.arrayToSort[j];
		this.arrayToSort[j] = temp;
	}

}
