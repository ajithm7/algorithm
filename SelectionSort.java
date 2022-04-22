package com.algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort selection = new SelectionSort();
		selection.sorting();
	}

	private void sorting() {
		int array[] = { 6, 7, 5, 3, 1 };
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			boolean swap = true;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					swap = false;
				}
			}
			if (swap) {
				break;
			}

		}
		for (int arr : array) {
			System.out.print(arr + " ");
		}
	}

}
