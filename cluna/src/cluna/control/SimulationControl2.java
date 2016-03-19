package cluna.control;

/**
 *
 * @author lindsayprigmore
 */
/**
 * Problem Statement to Access Locked Cure: A = 82 C = 46 + A A = B + 67
 *
 * Question: B = ? C = ? A+B+C = ?
 */
public class SimulationControl2 {

    public boolean runSimulation2(int guessB, int guessC, int guessAnswer) {

        int answerB = 15;
        int answerC = 128;
        int finalAnswer = 225;

        if (guessB != answerB) {
            return false;
        }

        if (guessC != answerC) {
            return false;
        }

        if (guessAnswer != finalAnswer) {
            return false;
        }

        if (guessB == answerB && guessC == answerC && guessAnswer == finalAnswer) {
            return true;
        }

        return false;
    }
}
