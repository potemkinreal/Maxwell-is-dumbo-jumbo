import java.util.*;
/**
 * Each player or team will create their own Player, this is only an example....
 * 
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 * 
 * You can create additional methods but must have the move method
 * 
 */
public class PlayerExample implements Player
{
    private static String name = "Eaton";
    /**
     * An example of a method - replace this comment with your own
     * You must create some kind of logic of what to play against your opponent...start thinking!
     * 
     * @return      the move you want to play against opponent
     *              "r" - rock
     *              "p" - paper
     *              "s" - scissors
     *              anything else - forfeit the turn
     */
    private int tommy = 0;
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
    //
        if (tommy % 3 ==0 || tommy == 31){
            return "r";
        }
        if (tommy*2 == 15 || tommy%2 ==0){
            return "s";
        }
         if (tommy%5 ==0){
            return "p";
        tommy +=1;
        return "p";
    }
    /**
     * Returns the name of the player
     * 
     * @return      the name of the player              
     */
    public String getName()
    {
        return name;
    }
}

