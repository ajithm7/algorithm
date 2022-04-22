package com.algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort insertion = new InsertionSort();
		insertion.sorting();

	}

	private void sorting() {
		int array[] = { 6, 2, 5, 3, 9 };
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j >0; j--) {
				if (array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int arr : array) {
			System.out.print(arr + " ");
		}
	}

}
