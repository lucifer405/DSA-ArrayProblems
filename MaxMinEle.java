package arrays_problem;

import java.util.Arrays;

public class MaxMinEle {
	public static void findMaxAndMin(int []arr,int size) {
		Arrays.sort(arr);
		System.out.println("Min Element: "+arr[0]);
		System.out.println("Max Element: "+arr[size-1]);
	}
	public static void main(String[] args) {
		int arr[]= {1,5,2,9,100,34};
		findMaxAndMin(arr,arr.length);
	}

}
