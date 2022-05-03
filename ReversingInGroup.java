package arrays;

public class ReversingInGroup {
	public static void reverseVector(int []arr,int size,int k) {
		int temp=k;
		while(k!=0) {
			System.out.println(arr[--k]);
		}
		k=temp;
		while(size!=k) {
			System.out.println(arr[--size]);
		}
	}
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		reverseVector(arr,arr.length,3);

	}

}
