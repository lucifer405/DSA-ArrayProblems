package arrays;

import java.util.Arrays;

public class MergeSortedArrays {
	public static void merge(int []arr1,int []arr2,int size1,int size2) {
		int []arr3=new int[size1+size2];
		int k=0;
		for(int i=0;i<size1;i++) {
			arr3[k++]=arr1[i];
		}
		for(int j=0;j<size2;j++) {
			arr3[k++]=arr2[j];
		}
		Arrays.sort(arr3);
		k=0;
		
		for(int i=0;i<size1;i++) {
			arr1[i]=arr3[k++];
		}
		for(int i=0;i<size2;i++) {
			arr2[i]=arr3[k++];
		}
		for(int i=0;i<size1;i++) {
		System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<size2;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int []a1= {1,3,5,7};
		int []a2= {10,15,12};
		
		merge(a1,a2,a1.length,a2.length);
	}

}
