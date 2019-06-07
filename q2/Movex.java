package ca.utoronto.utm.assignment1.q2;
import ca.utoronto.utm.assignment1.puzzle.Move;
/**
 * 
 * 
 * @author fartootp
 * 
 */

/**
 * IS-A : Move (Implements)
 * HAS-A : int source, int destination
 * RESPONDS-TO : toString()
 */

public class Movex implements Move{
	int source;
	int destination;
	// Move constructor
	public Movex(int Source, int Destination) {
		source = Source;
		destination = Destination;
	}
	// return a String representation 
	public String toString() {
		return ("Move from: "+ source +" to: "+ destination);
		
	}
}
