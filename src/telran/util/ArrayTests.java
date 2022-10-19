package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayTests {

	/**
	 * The method doesn't update a given array
	 * @param <T>
	 * @param array
	 * @return true if there is exactly one swap for getting sorted array
	 * examples: {1,2,3,10,-1,5,6} false
	 * {1,2,3,5,6,10} false
	 * {1,3,2,4,3,10} false
	 * {10,2,3,4,1} true
	 * {1,2,4,3,5,10} true
	 * {1,5,3,4,2,10} true
	 * {"lmn","ab","bc","cd","a"} true
	 * An Array should contain comparable elements
	 */
	
	<T> boolean isOneSwapForSorted(T[] array) {
		T[] copyAr = array.clone();
		Arrays.sort(copyAr);
		int count =0;
		for (int i=0; i<copyAr.length;i++) {
			if (!copyAr[i].equals(array[i]))
				{
				count++;
				}	
		}	
		return count==2 ;	
	}
	
	@Test
	void isOneSwapTest() {
		Integer[] expected1 = {1,2,3,10,-1,5,6};
		Integer[] expected2 = {1,2,3,5,6,10};
		Integer[] expected3 ={1,3,2,4,3,10};	
		Integer[] expected4 ={10,2,3,4,1}; 
		Integer[] expected5 ={1,2,4,3,5,10};
		Integer[] expected6 ={1,5,3,4,2,10} ;
		String [] expected7 = {"lmn","ab","bc","cd","a"};
		
		assertFalse(isOneSwapForSorted(expected1));
		assertFalse(isOneSwapForSorted(expected2));
		assertFalse(isOneSwapForSorted(expected3));
		assertTrue(isOneSwapForSorted(expected4));
		assertTrue(isOneSwapForSorted(expected5));
		assertTrue(isOneSwapForSorted(expected6));
		assertTrue(isOneSwapForSorted(expected7));
	}

}
