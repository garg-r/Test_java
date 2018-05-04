package oops;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SusStrinExample {

	public static void main(String[] args) {
		String str="cat";
		subString1(str,str.length());

	}
	public static void  subString1(String str, int n){
		Set<String> ch=new HashSet<String>();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<=n;j++){
				ch.add(str.substring(i,j));
			}
		}
		List<String> list=new ArrayList<String>(ch);
		Collections.sort(list);
		System.out.println(list);
	}

}
