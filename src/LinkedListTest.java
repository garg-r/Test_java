
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> aa=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
		aa.add(i);
	
	for(int i=0;i<11;i++)
		try {
			System.out.println("aaa  "+aa.get(i));
		} catch (OutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
