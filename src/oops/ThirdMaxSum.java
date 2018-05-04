package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThirdMaxSum {

	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5};
		Set<Integer> sumSet=new HashSet<Integer>();
		int sum=0;
		for (int i = 0; i < arr1.length; i++) {
			for(int j=i+1;j<arr1.length;j++){
				sum=arr1[i]+arr1[j];
				sumSet.add(sum);
			}
		}
		List<Integer> list=new ArrayList<Integer>(sumSet);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(list.size()-3));
	}

}
