package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMaxOccurrence {

	public static void main(String[] args) {
		 Integer[] ar = new Integer[] {5,2,8,8,5,5,8,1,9,0,1,1,0,1};
		 //0,0,1,1,1,1,2,5,5,5,8,8,8,9
		 
		 Arrays.asList(ar);
		 List<Integer> list=new ArrayList<Integer>(Arrays.asList(ar));
		 Collections.sort(list);
		 System.out.println(list);
		 List<Integer> key=new ArrayList<Integer>();
		 List<Integer> value=new ArrayList<Integer>();
		 
		 for(int i=0;i<ar.length-1;i++){
			 int count=0;
			 if(!key.contains((Integer)ar[i])){
			 for(int j=0;j<ar.length;j++){
				if(ar[i]==ar[j])
					++count;
			 }
			 key.add(ar[i]);
			 value.add(ar[i]);
			 value.add(count);
			 }
		 }
		 System.out.println(value);
		 //System.out.println(value);
		 //Collections.sort(value);
		 //System.out.println(value);
		 int temp1;
		 int temp2;
		 Integer[] array=value.toArray(new Integer[value.size()]);
		 for(Integer a:array){
			 System.out.print(a); 
		 }
		 for(int z=0;z<array.length;z++){
		 for(int k=0;k<array.length;k++){
			 if(k<array.length-2){
			 if(array[z+1]<=array[k+3]){
				 temp1=array[k];
				 array[k]=array[k+2];
				 array[k+2]=temp1;
				 temp2=array[k+1];
				 array[k+1]=array[k+3];
				 array[k+3]=temp2;
				 
			 }
			 k++;
			 }
		 }
		 }
		 System.out.println();
		 for(Integer a:array){
			 System.out.print(a); 
		 }
		 
	}

}

