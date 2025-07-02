package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest01 {

	private static int findBiggestNumber(int arr[]) {
		int maxValue = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	private static int findSmallestNumber(int arr[]) {
		int minValue = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	private static List<Integer> findDuplicateNumber(int arr[]) {
		List<Integer> dupList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					dupList.add(arr[i]);
					break;
				}
			}
		}
		return dupList;
	}

	private static List<Integer> removeDuplicate(int arr[]) {
		List<Integer> removeList = new ArrayList<Integer>();

		int newLength = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < newLength; j++) {
				if (arr[i] == removeList.get(j)) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				newLength++;
				removeList.add(arr[i]);
			}

		}
		return removeList;
	}
	private static List<Integer> uniqueNumbers(int[] arr) {
		List<Integer> uniqueNumList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int freq = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					freq++;
				}
				if (freq == 2) {
					break;
				}
			}
			if (freq == 1) {
				uniqueNumList.add(arr[i]);
			}
		}
		return uniqueNumList;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 5, 20, 7, 1, 3, 10, 5, 3 ,-8,-1};

		int max = findBiggestNumber(arr);
		System.out.println("Biggest number : " + max + "\n______________________");

		int min = findSmallestNumber(arr);
		System.out.println("\nSmallest number : " + min + "\n______________________");

		List<Integer> dupList = findDuplicateNumber(arr);
		System.out.println("\nDuplicate numbers : " + Arrays.toString(dupList.toArray()) + "\n______________________");

		List<Integer> removeList = removeDuplicate(arr);
		System.out.println("\nDuplicate numbers : " + Arrays.toString(removeList.toArray())+ "\n______________________");

		List<Integer> uniqueList = uniqueNumbers(arr);
		System.out.println("\n Unique numbers : " + Arrays.toString(uniqueList.toArray()));

	}

}
