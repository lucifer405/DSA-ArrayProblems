package arrays;

import java.util.*;

public class NumberOfPairs {
	public static void countPairs(int []x,int []y,int size1,int size2) {
		int count=0;
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				if(Math.pow(x[i], y[j])>Math.pow(y[j], x[i])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x= {2,3,4,5};
		int []y= {1,2,3};
		countPairs(x,y,x.length,y.length);
	}

}
