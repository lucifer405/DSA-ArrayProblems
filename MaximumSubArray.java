package arrays_problem;

	import java.util.*;
	public class MaximumSubArray {
	static class Node
	{
	     
	    // To store the maximum sum
	    // for a sub-array
	    int _max;
	     
	    // To store the maximum prefix
	    // sum for a sub-array
	    int _pre;
	     
	    // To store the maximum suffix
	    // sum for a sub-array
	    int _suf;
	     
	    // To store the total sum
	    // for a sub-array
	    int _sum;
	 
	};
	 
	 
	// Function to create a node
	static Node getNode(int x)
	{
	    Node a = new Node();
	    a._max = x;
	    a._pre = x;
	    a._suf = x;
	    a._sum = x;
	    return a;
	}
	 
	// Function to merge the 2 nodes left and right
	static Node merg(Node l, Node r)
	{
	     
	    // Creating node ans
	    Node ans = new Node();
	 
	    // Initializing all the variables:
	    ans._max = ans._pre = ans._suf = ans._sum = 0;
	     
	    // The max prefix sum of ans Node is maximum of
	    // a) max prefix sum of left Node
	    // b) sum of left Node + max prefix sum of right Node
	    // c) sum of left Node + sum of right Node
	    ans._pre = Arrays.stream(new int[]{l._pre, l._sum+r._pre,
	                                       l._sum+r._sum}).max().getAsInt();
	 
	    // The max suffix sum of ans Node is maximum of
	    // a) max suffix sum of right Node
	    // b) sum of right Node + max suffix sum of left Node
	    // c) sum of left Node + sum of right Node
	    ans._suf = Arrays.stream(new int[]{r._suf, r._sum+l._suf,
	                                       l._sum+r._sum}).max().getAsInt();
	     
	    // Total sum of ans Node = total sum of
	  // left Node + total sum of right Node
	    ans._sum = l._sum + r._sum;
	     
	    // The max sum of ans Node stores
	    // the answer which is the maximum value among:
	    // prefix sum of ans Node
	    // suffix sum of ans Node
	    // maximum value of left Node
	    // maximum value of right Node
	    // prefix value of right Node + suffix value of left Node
	    ans._max = Arrays.stream(new int[]{ans._pre,
	                                       ans._suf,
	                                       ans._sum,
	                                       l._max, r._max,
	                                       l._suf+r._pre}).max().getAsInt();
	 
	    // Return the ans Node
	    return ans;
	}
	 
	// Function for calculating the
	// max_sum_subArray using divide and conquer
	static Node getMaxSumSubArray(int l, int r, int []ar)
	{
	 
	    if (l == r) return getNode(ar[l]);
	    int mid = (l + r) >> 1;
	     
	    // Call method to return left Node:
	    Node left = getMaxSumSubArray(l, mid, ar);
	     
	    // Call method to return right Node:
	    Node right = getMaxSumSubArray(mid + 1, r, ar);
	     
	    // Return the merged Node:
	    return merg(left, right);
	 
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int []ar = {-2, -5, 6, -2, -3, 1, 5, -6};
	    int n = ar.length;
	    Node ans = getMaxSumSubArray(0, n - 1, ar);
	    System.out.print("Answer is " +  ans._max + "\n");
	}
}

