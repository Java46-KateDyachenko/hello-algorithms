package telran.structure;

import java.util.Set;

public interface MultiCounters {
/**
 * @param item
 * @return How many times the item has been added
 * if item is the new one then 1 will be returned
 */
	Integer addItem(Object item); //O[LogN]
/**
* @param item
 * @return how many times given item has been added 
 * if no one then null then null will be returned
 */
	Integer getValue(Object item); //O[1]

/**
 * 	
 * remove item with all counters
 * @param item
 * @return true if item has been removed otherwise false(if given item not exists) 
 */
	
	boolean remove (Object item); //O[LogN]
	/**
	 * 
	 * @return set of items with maximum counters
	 */
	Set<Object> getMaxItems();  //O[LogN]
}
