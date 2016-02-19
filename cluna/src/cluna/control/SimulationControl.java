
package cluna.control;

/**
 *
 * @author lindsayprigmore
 */
public class SimulationControl {
    
    public String runSimulation(int numDoses, double doseVolume) {
        
        int doseLimit = 1500;
        double cureAmount = 1000;
        double idealDose = 4;
        
        if (numDoses > doseLimit) {
            return "You have input too many doses to run the simulation."; }
        
        if (numDoses < 0){
            return "The number of doses must be greater than zero to return the simulation.";}
        
        if (doseVolume < 0) {
            return "The dose volume must be greater than zero to run the simulation."; }
        
        double cureUsed = doseVolume * numDoses;
        
        if (cureUsed > cureAmount) {
            return "There's not enough cure for that many doses at that volume."; }
       
        double cureLeft = (cureAmount - cureUsed); 
        
        double effectiveness = (doseVolume/idealDose)*100;
   
        
        String answer = "At " + numDoses + " doses of "+ doseVolume+ "ml each, there will be " + cureLeft + "mls of cure left, and "+effectiveness+ "% of individuals should develop an immunity.";
        return answer;
        
        
    }
}
