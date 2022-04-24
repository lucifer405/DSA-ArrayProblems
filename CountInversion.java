package arrays;

public class CountInversion {
	public static void countInversion(int []arr,int size) {
		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if((arr[i]>arr[j]) && i<j) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {6,5,4,3,1,2};
		countInversion(arr,arr.length);
	}

}
