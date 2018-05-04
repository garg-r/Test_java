import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaPtest {

	public static void main(String[] args) {
		Map<String, String> mymap=new HashMap<String,String>();
		mymap.put("aa", "aa");
		mymap.put("bb", "bb");
		mymap.put("cc", "cc");
		mymap.put("dd", "dd");
		mymap.put("ee", "ee");
		mymap.put(null, null);
		mymap.put("gg", null);
		mymap.put(null, null);
		mymap.put(null, "gg");
	
		Iterator<Entry<String, String>> itr=mymap.entrySet().iterator();
		
		while(itr.hasNext()){
			Entry<String, String> entry=itr.next();
			System.out.println(entry.getValue());
			
		}
		System.out.println(mymap);
	}
		
		/*Iterator<Entry<String,String>> itr=mymap.Set().iterator();
		
		while(itr.hasNext()){
			String entry=itr.next();
			if(entry.equalsIgnoreCase("cc"))
				mymap.remove(entry);
			//System.out.println(mymap.get(entry));
			
		}
		
	}
	private static Map<String, String> translatorMap = new HashMap<String,String>();

	   static
	   {
	      translatorMap.put("zero", "cero");
	      translatorMap.put("one", "uno");
	      translatorMap.put("two", "dos");
	      translatorMap.put("three", "tres");
	      translatorMap.put("four", "cuatro");
	      translatorMap.put("five", "cinco");
	      translatorMap.put("six", "seis");
	      translatorMap.put("seven", "siete");
	      translatorMap.put("eight", "ocho");
	      translatorMap.put("nine", "nueve");
	      translatorMap.put("ten", "diez");
	   }

	   public static void main(final String[] arguments)
	   {
	      System.out.println("Pre-Size: " + translatorMap.size());
	      for ( final String translatorKey : translatorMap.keySet() )
	      {
	         // Line below is commented out to avoid ConcurrentModificationException
	         // (cannot remove directly on the Map while iterating; must remove from
	         // the Iterator, but the enhanced for-each loop "hides" the Iterator).
	         //translatorMap.remove(translatorKey);
	      }
	       Iterator mapIter = translatorMap.keySet().iterator();
	      while ( mapIter.hasNext() )
	      {
	         // Line below is commented out to avoid IllegalStateException (need to
	         // call Iterator's hasNext() method first.
	         //mapIter.remove();

	         // Line below is commented out to avoid ConcurrentModificationException
	         // (cannot remove directly on the Map while iterating; must remove from
	         // the Iterator).
	         //translatorMap.remove((String)mapIter.next());

	         mapIter.next();
	         mapIter.remove();
	      }
	      System.out.println("Post-Size: " + translatorMap.size());
	   }*/

}
