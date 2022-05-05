package arrays_problem;

import java.util.Arrays;

//Problem:- https://www.geeksforgeeks.org/chocolate-distribution-problem/

public class distributionProblem {
	public static int findMinDiff(int []arr,int student,int size) {
		if(student>size) {
			return -1;
		}
		if(student<0 || size<0) {
			return -1;
		}
		Arrays.sort(arr);
		int min_diff=Integer.MAX_VALUE;
		for(int i=0;i+student-1<size;i++) {
			int diff=arr[i+student-1]-arr[i];
			if(diff<min_diff) {
				min_diff=diff;
			}
		}
		return min_diff;
	}
	public static void main(String[] args) {
		int []arr= {12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43,
               50};
		int student=7;
		System.out.println(findMinDiff(arr,student,arr.length));
	}

}
