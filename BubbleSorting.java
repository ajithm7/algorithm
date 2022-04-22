package com.algorithm;

public class BubbleSorting {

	public static void main(String[] args) {
		BubbleSorting bubble = new BubbleSorting();
		bubble.sorting();
	}

	private void sorting() {
		int array[] = { 6, 2, 5, 3, 9 };
		int n = array.length, temp;
		for (int i = 0; i < n - 1; i++) {
			boolean numOfSwap = false;
			for (int j = 1; j < n - i; j++) {
				System.out.println(array[2]);
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					numOfSwap = true;
				}
			}
			if (!numOfSwap) {
				break;
			}
		}
		for (int arr : array) {
			System.out.print(arr + " ");
		}
	}

}
