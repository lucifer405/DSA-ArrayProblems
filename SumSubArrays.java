package arrays;
import java.util.*;
public class SumSubArrays {
	public static int SumOfSubArray(int []arr,int n,int sum) {
		int total;
		for(int i=1;i<=n;i++) {
			total=arr[i];
			for(int j=i+1;j<=n;j++) {
				if(total==sum) {
					int p=j-1;
					System.out.println(i+" "+p);
					return 1;
				}
				if(total>sum || j==n) {
					break;
				}
				total=total+arr[j];
			}
		}
		System.out.println("No SubArray");
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int s=sc.nextInt();
		int n=sc.nextInt();
		int []arr=new int[50];
		for(int i=1;i<=s;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		SumOfSubArray(arr,s,n);
	}

}
