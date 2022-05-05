package arrays_problem;

public class ReverseArray {
	public static void reverseArray(int []arr,int size) {
		while(size!=0) {
			System.out.println(arr[--size]);
		}
	}
	public static void main(String[] args) {
		int []arr= {1,2,3};
		reverseArray(arr,arr.length);
	}

}
