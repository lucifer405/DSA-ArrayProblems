package arrays;

import java.util.Arrays;

public class KthSmallestElement {
	public static void smallestElement(int []arr,int size,int k) {
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}
	public static void main(String[] args) {
//		int []arr= {7,10,4,3,20,15};
		int []arr= {7,10,4,20,15};
		smallestElement(arr,arr.length,4);
	}

}
