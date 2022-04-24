package arrays;

public class RearrangeArray {
	public static void rearrangeArray(int []arr,int size) {
		int []arr1=new int[size];
		int k=size-1,l=0;
		for(int i=0;i<size;i+=2) {
				arr1[i]=arr[k--];
				arr1[i+1]=arr[l++];
		}
		
		for(int j=0;j<size;j++) {
			System.out.print(arr1[j]+" ");
		}
	}
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6};
		rearrangeArray(arr,arr.length);

	}

}
