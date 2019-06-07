package ca.utoronto.utm.assignment1.q2;
import java.io.*;
import java.util.*;
/**
 * @author fartootp
 * This class allows a console user to play an instance of JugPuzzle.
 */
/**
 * IS-A: Class
 * HAS-A: Scanner scanner, JugPuzzle jugPuzzle
 * RESPONDS-TO: getMove(String message, int lower, int upper), play(), main(String [] args)
 */
public class JugPuzzleController {
        private static final String INVALID_INPUT_MESSAGE="Invalid number, please enter 0,1 or 2";

        private Scanner scanner;
        private JugPuzzle jugPuzzle;

        /**
         * Constructs a new JugPuzzleController with a new JugPuzzle, 
         * ready to play with a user at the console.
         */
        public JugPuzzleController(){
                jugPuzzle=new JugPuzzle();
                scanner=new Scanner(System.in);
        }

        /**
         * FILL THIS IN (describe what this method is about)
         * To see what good documentation looks like, look at the API documentation, 
         * for example ArrayList (in the bottom left frame) at 
         * http://download.oracle.com/javase/8/docs/api/
         * this documentation was created using Javadoc. 
         * FILL THIS IN (takes and integer move from user and checks if its valid, the message shows what the action would be.Eg : spill from jug , into jug)
         * @param message (the message that will be printed showing the action. Eg : spill from jug , into jug)
         * @param lower   (number of the first jug)
         * @param upper   (number of the last jug
         * @return        (The integer move)
         */
        private int getMove(String message, int lower, int upper){
                int move;
                while(true){
                        try {
                                System.out.print(message);
                                String line=scanner.nextLine();
                                move=Integer.parseInt(line);
                                if(lower<=move && move<=upper){
                                        return move;
                                } else {
                                        System.out.println(INVALID_INPUT_MESSAGE);
                                }
                        }
                        catch(NumberFormatException e){
                                System.out.println(INVALID_INPUT_MESSAGE);
                        }
                }
        }
        /**
         * FILL THIS IN (Plays the jug puzzle until its solved and then shows the number of tries it took to solve the puzzle)
         */
        public void play(){
                while(!jugPuzzle.isPuzzleSolved()){
                        System.out.println(jugPuzzle); // called the toString() method of jugPuzzle
                        int from, to;
                        from = getMove("spill from jug: ", 0,2);
                        to   = getMove("into jug: ",0,2);
                        jugPuzzle.move(from,to);
                }
                if(jugPuzzle.getMoves()==1) {
                    System.out.println("Congrats you solved it in "+jugPuzzle.getMoves()+" move!!");
                } else {
                	System.out.println("Congrats you solved it in "+jugPuzzle.getMoves()+" moves!!");
                }
        }

        public static void main(String [] args){
                JugPuzzleController jpcc=new JugPuzzleController();
                jpcc.play();
        }
}
