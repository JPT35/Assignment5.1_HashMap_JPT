/**
 * 
 * @author johnpaulthomas
 *
 * @param <K>
 * @param <V>
 */

import java.util.Collection;
import java.util.Set;
public interface DictionaryMapInterface<K, V> {
	/**
	 * adds a new entry to the dictionary
	 * 
	 */
	public V put(K key, V value);
	
	/**
	 * removes a specific entry
	 */
	public V remove(K key);

	/**
	 * retrieves value associated with specific key
	 * 
	 */
	public V get(Object key);
	/**
	 * Sees whether a specific word is in this dictionary
	 * 
	 * @param key
	 * @return
	 */
	
	public Set<K> keySet();
	/**
	 * interface for setting the key with method iterator
	 * @return
	 */
	public Collection <V> values();
	/**
	 * interface for collection of values in dictionary with method iterator
	 * @return
	 */


}//end interface
