package ca.utoronto.utm.assignment1.q2;
/**
 * 
 * @author fartootp 
 *
 */

/**
 * IS-A : Class
 * HAS-A: String NAME, int capacity, int current
 * RESPONDS-TO: fill(from, to)
 *
 */
public class Jug{
	String name;
	int capacity;
	int current;
	// Jug class constructor.
	public Jug(String Name, int Current, int Capacity) {
		name = Name;
		capacity = Capacity;
		current = Current;	
	}
	/**
	 * Transfers the liquids form the source to destination until one of them is full or empty.
	 * @param from (the source jug)
	 * @param to (the destination jug)
	 */
	public static void fill(Jug from, Jug to) {
		while ((to.capacity > to.current) && (from.current > 0)) {
			to.current++;
			from.current--;
		}
		
	}
}