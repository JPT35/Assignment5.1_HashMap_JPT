/**
 * 
 * @author johnpaulthomas
 * Stores and manages a dictionary map of archaic words
 * 
 */
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

public class archaicWords<K, V> implements DictionaryMapInterface<K, V>{

	private HashMap <String, String> archaicMap;

	public archaicWords() {
		archaicMap = new HashMap<String, String>();
		
	}//end constructor

	
	@Override
	public V put(K key, V value) {
	archaicMap.put(value.keySet(), value);
	

	}//end put

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public V get(Object key) {
		
		return (V) archaicMap.get(key);
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public Set<K> keySet() {
		
		return (Set<K>) archaicMap.entrySet();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<V> values() {
	
		return (Collection<V>) archaicMap.entrySet();
	}

	

	public void readFile(Scanner data) {
		while(data.hasNext()) {
			String achaicWord = data.next();
			String definition = data.next();
			
			archaicWords<K, V> archaicMap = new archaicWords<K, V>();
			
		}//end while loop
		data.close();
	}//end readFile
	
	
}//end class
