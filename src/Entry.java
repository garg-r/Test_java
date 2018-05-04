/**
 * 
 */

/**
 * @author pot30241
 *
 */
public class Entry<K, V> {

	private Entry<K,V> next;
	private final K key;
	private V value;
	
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public Entry<K, V> getNext() {
		return next;
	}

	public void setNext(Entry<K, V> next) {
		this.next = next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	
	
}
