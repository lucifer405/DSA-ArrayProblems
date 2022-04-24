package arrays;

import java.util.Arrays;

public class SortArrayBy1_To_2 {
	public static void sort012(int []arr,int size) {
		Arrays.sort(arr);
		for(int a:arr) {
		System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		int []arr= {0,1,0};
		sort012(arr,arr.length);
	}
}
