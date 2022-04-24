package arrays;

public class MissingNumber {
	
	public static void missingNumber(int[] arr,int size) {
		int sum=((size+1)*(size+2))/2;
		for(int i=0;i<size;i++) {
			sum=sum-arr[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int []arr= {1,2,3,5};
		missingNumber(arr,arr.length);
	}

}
