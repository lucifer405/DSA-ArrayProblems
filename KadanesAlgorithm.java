package arrays;

public class KadanesAlgorithm {
	
	public static void findSubArray(int []arr,int size) {
		int max_ending_here=0;
		int max_so_far=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			max_ending_here+=arr[i];
			if(max_so_far<max_ending_here) {
				max_so_far=max_ending_here;
			}
			if(max_ending_here<0) {
				max_ending_here=0;
			}
		}
		System.out.println(max_so_far);
	}
	public static void main(String[] args) {
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		findSubArray(a,a.length);
	}

}
