package ca.utoronto.utm.assignment1.q2;
import ca.utoronto.utm.assignment1.puzzle.Puzzle;
import ca.utoronto.utm.assignment1.puzzle.States;

/**
 * 
 * @author fartootp 
 *
 */

/**
 * IS-A : Puzzle(extends)
 * HAS-A :int moves, Jug Jug_0, Jug Jug_1, Jug Jug_2 
 * RESPONDS-TO: toString(), isPuzzleSolved(), getMoves(), move(int From, int To) , copy(), nextStates(States states)
 *
 */
public class JugPuzzle extends Puzzle {
	private int moves = 0;
	Jug Jug_0 = new Jug("Jug 0 ",8,8);
	Jug Jug_1 = new Jug("Jug 1 ",0,5);
	Jug Jug_2 = new Jug("Jug 2 ",0,3);
	
	/**
	 * returns the String representation of the class
	 * @return String
	 */
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
	/**
	 * Creates a deep copy of the JugPuzzle class
	 * @return puzzle
	 */
	public JugPuzzle copy() {
		JugPuzzle puzzle = new JugPuzzle();
		puzzle.Jug_0.name = Jug_0.name;
		puzzle.Jug_0.current = Jug_0.current;
		puzzle.Jug_0.capacity = Jug_0.capacity;
		puzzle.Jug_1.name = Jug_1.name;
		puzzle.Jug_1.current = Jug_1.current;
		puzzle.Jug_1.capacity = Jug_1.capacity;
		puzzle.Jug_2.name = Jug_2.name;
		puzzle.Jug_2.current = Jug_2.current;
		puzzle.Jug_2.capacity = Jug_2.capacity;
		return puzzle;
				
	}
	
	/**
	 * Goes thought all the possible next moves of the current puzzle and adds them to the states
	 * 
	 */
	public void nextStates(States states) {
		int[] possiable = {0,1,2};
		for (int move_1 : possiable) {
			for (int move_2 : possiable) {
				if (move_1 != move_2) {
					Movex move = new Movex(move_1,move_2);
					JugPuzzle puzzle = this.copy();
					puzzle.move(move.source, move.destination);
					states.add(puzzle, move);	
					}								
				}		
			}	
		}
		
	
}

