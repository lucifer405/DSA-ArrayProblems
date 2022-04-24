package arrays;

import java.util.Scanner;

public class CountTheTriplets {
	public static void countOfTriplets(int []arr,int size) {
		int total=0;
		int count=0;
		
		for(int i=0;i<size-2;i++){
			for(int j=i+1;j<size-1;j++) {
				for(int k=j+1;k<size;k++) {
					if(arr[i]+arr[j]==arr[k] || arr[j]+arr[k]==arr[i] || arr[k]+arr[i]==arr[j]) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int []arr=new int[50];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		countOfTriplets(arr,n);
	}
}
