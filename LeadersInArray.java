package arrays;

public class LeadersInArray {
	public static void leadersInArray(int []arr,int n) {
		int max=0;
		L1:for(int i=0;i<n;i++) {
			L2:for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					continue L2;
				}else {
					continue L1;
				}
			}
			max=arr[i];
			System.out.print(max+" ");
		}
	}
	public static void main(String[] args) {
//		int []arr={16,17,4,3,5,2};
		int []arr={1,2,3,4,0};
		leadersInArray(arr,arr.length);
		
	}

}
