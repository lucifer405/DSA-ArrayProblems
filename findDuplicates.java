package arrays_problem;

import java.util.HashSet;

public class findDuplicates {

	public static boolean containsDuplicate(int[] nums) {
	    if(nums==null || nums.length==0)
	        return false;
	 
	    HashSet<Integer> set = new HashSet<Integer>();
	    for(int i: nums){
	        if(!set.add(i)){
	            return true;
	        }
	    }
	 
	    return false;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,4};
		System.out.println(containsDuplicate(arr));
	}

}
