package com.mvalho.study.sorting.main;

import com.mvalho.study.sorting.bubble.BubbleSortOperation;
import com.mvalho.study.sorting.insertion.InsertionSortOperation;
import com.mvalho.study.sorting.quick.QuickSortOperation;
import com.mvalho.study.sorting.selection.SelectionSortOperation;

public class SortExecution {

	public static void main(String[] args) {
		int[] arrayToSort = {18,8,7,2,11,0,1,4,20,10,17,13,12,19,6,14,4,16,15,3,5,9};
		System.out.println("Array to be sorted out: " + printArray(arrayToSort));
		
		/*
		 * BUBBLE SORT
		 */
		BubbleSortOperation bubbleSort = new BubbleSortOperation();
		System.out.println( "Array sorted by Bubble Sort: " + printArray( bubbleSort.sortArray( arrayToSort ) ) );
		
		/*
		 * INSERTION SORT
		 */
		int[] arrayToSort2 = {18,8,7,2,11,0,1,4,20,10,17,13,12,19,6,14,4,16,15,3,5,9};
		InsertionSortOperation insertionSort = new InsertionSortOperation();
		System.out.println( "Array sorted by Insertion Sort: " + printArray( insertionSort.sortArray(arrayToSort2) ) );
		
		/*
		 * SELECTION SORT
		 */
		int[] arrayToSort3 = {18,8,7,2,11,0,1,4,20,10,17,13,12,19,6,14,4,16,15,3,5,9};
		SelectionSortOperation selectionSort = new SelectionSortOperation();
		System.out.println("Array sorted by Selection Sort: " + printArray( selectionSort.sortArray(arrayToSort3) ));
		
		/*
		 * QUICK SORT
		 */
		int[] arrayToSort4 = {18,8,7,2,11,0,1,4,20,10,17,13,12,5,5,19,6,14,4,16,15,3,5,9};
		QuickSortOperation quickSort = new QuickSortOperation();
		System.out.println("Array sorted by Quick Sort: " + printArray( quickSort.sortArray(arrayToSort4) ) );
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
