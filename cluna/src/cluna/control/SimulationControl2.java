
package cluna.control;

/**
 *
 * @author lindsayprigmore
 */

/**
 *Problem Statement to Access Locked Cure:
 * A = 82
 * C = 46 + A
 * A = B + 67
 * 
 * Question:
 * B = ?
 * C = ?
 * A+B+C = ?
 */
public class SimulationControl2 {
    
    public String runSimulation2(int guessB, int guessC, int guessAnswer) {
        
        int answerB = 15;
        int answerC = 128;
        int finalAnswer = 225;
        
        if (guessB != answerB) {
            return "Incorrect. You may not access the cure."; }
        
        if (guessC != answerC){
            return "Incorrect. You may not access the cure.";}
        
        if (guessAnswer != finalAnswer) {
            return "Incorrect. You may not access the cure."; }
        
        if (cureUsed > cureAmount) {
            return "Incorrect. You may not access the cure."; }
       
       
        String answer = "A = 82, B = 15, C = 128, and the answer is 225. The cure has been unlocked.";
        return answer;
        
        
    }
}
