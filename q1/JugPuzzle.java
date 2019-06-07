package ca.utoronto.utm.assignment1.q1;
/**
 * 
 * @author fartootp 
 *
 */

/**
 * ISA-A: Class
 * HAS-A : int moves, Jug Jug_0, Jug Jug_1, Jug Jug_2
 * RESPONDS-TO: toString(), isPuzzleSolved(), getMoves(), move(int From, int To)
 */

public class JugPuzzle {
	private int moves = 0;
	Jug Jug_0 = new Jug("Jug 0 ",8,8);
	Jug Jug_1 = new Jug("Jug 1 ",0,5);
	Jug Jug_2 = new Jug("Jug 2 ",0,3);
	
	
	public String toString() {
		return (Jug_0.name + Jug_0.current +"\n"+ Jug_1.name + Jug_1.current +"\n" + Jug_2.name + Jug_2.current +"\n");
		
	}
	/**
	 * Check to see if the solved conditions are true.
	 * @return a boolean showing whether the puzzle is solved or not
	 */
	public boolean isPuzzleSolved(){
		boolean result;
		result = false;
		if (Jug_0.current == 4 && Jug_1.current == 4) {
			result = true;
		}
		return result;		
	}
	/**
	 * returns the number of moves that we keep track of in the method move(From,To).
	 * @return the number of moves made so far
	 */
	public int getMoves() {
		return moves;
	}
	
	/**
	 * Initiate a transfers of liquids form the source to the destination and adds "1" to the number of moves made so far.
	 * @param From the source of the transfer
	 * @param To the destination of the transfer
	 */
	public void move(int From, int To) {
		Jug from = null;
		Jug to = null;
		// Finds out the source Object and the destination Object from the integer arguments.
		if (From == 0) {
			from = Jug_0;	
		}
		if (From == 1) {
			from = Jug_1;	
		}
		if (From == 2) {
			from = Jug_2;	
		}
		if (To == 0) {
			to = Jug_0;	
		}
		if (To == 1) {
			to = Jug_1;	
		}
		if (To == 2) {
			to = Jug_2;	
		}
		Jug.fill(from,to);
		moves++; // adds one to the number of the moves
		
	}
	

}
