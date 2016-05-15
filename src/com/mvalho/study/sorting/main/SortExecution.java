package com.mvalho.study.sorting.main;

import com.mvalho.study.sorting.bubble.BubbleSortOperation;
import com.mvalho.study.sorting.insertion.InsertionSortOperation;

public class SortExecution {

	public static void main(String[] args) {
		int[] arrayToSort = {8,7,2,0,1,4,3,5,9};
		System.out.println("Array to be sorted out: " + printArray(arrayToSort));
		
		/*
		 * BUBBLE SORT
		 */
		BubbleSortOperation bubbleSort = new BubbleSortOperation();
		System.out.println( "Array sorted by Bubble Sort: " + printArray( bubbleSort.sortArray( arrayToSort ) ) );
		
		/*
		 * INSERTION SORT
		 */
		int[] arrayToSort2 = {8,7,2,0,1,4,3,5,9};
		InsertionSortOperation insertionSort = new InsertionSortOperation();
		System.out.println( "Array sorted by Insertion Sort: " + printArray( insertionSort.sortArray(arrayToSort2) ) );
	}
	
	/*
	 * Prints the array values in a simple way.
	 */
	private static String printArray(int[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i : array) {
			stringBuilder.append(i + " ");
		}
		
		return stringBuilder.toString();
	}

}
