package oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MaximumOccurance {

	public static void main(String[] args) {
		
		int[] array={1,2,3,4,5,1,4,1,3,1,1,4,1,1,5,3,6,7,8,9,1,4,1,4,1,1,4,1,1};
		int keypair=array[0];
		int valuepair=0;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int value=-1;
	    for (int i = 0; i < array.length; i++) {
	    	Integer key = new Integer(array[i]);
	        if ( hm.containsKey(key) ) {
	            value = (Integer) hm.get(key);
	            hm.put(key, value + 1);
	        } else {
	            hm.put(key, 1);
	        }
	    }
	    System.out.println(hm);
	    Iterator itr= hm.entrySet().iterator();
	    while(itr.hasNext()){
	    	Map.Entry pair = (Map.Entry)itr.next();
	    	if(keypair==(int)pair.getKey()){
	    		
	    		int value1=(int) pair.getValue();
	    		if(valuepair<value1){
	    			keypair=(Integer) pair.getKey();
	    			valuepair=(int) pair.getValue();
	    		}
	    		
	    		
	    	}
	    }
	    System.out.println(keypair+" has "+valuepair);
	    
	    /* given an array and integer n find the no in array 
	    * whose frequencey is more than  half of the integer n
	    * code starts here 
	    */
	    int n=4;
	    int halfoFN=n/2;
	    List<Integer> frequencyList=new ArrayList<Integer>();
	    Iterator itr1= hm.entrySet().iterator();
	    while(itr1.hasNext()){
	    	Map.Entry pair = (Map.Entry)itr1.next();
	    	int value1=(int) pair.getValue();
	    		if(halfoFN<value1){
	    			frequencyList.add((Integer)pair.getKey());
	    		}
	    }
	    System.out.println(frequencyList);

	}
	
}
