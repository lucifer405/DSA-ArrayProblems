package arrays;

public class equilibriumPoint {
	public static int equilibriumPoint(int []arr,int n) {
		int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum
 
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];
 
        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index i
 
            if (leftsum == sum)
                return i+1;
 
            leftsum += arr[i];
        }
 
        /* If no equilibrium index found, then return 0 */
        return -1;
	}
	public static void main(String[] args) {
		int []arr= {1,3,5,2,2};
		int n=arr.length;
		System.out.println(equilibriumPoint(arr,n));
	}

}
