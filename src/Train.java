/**
 * 
 * @author ENTER YOUR NAME HERE.
 * @version 
 */
public class Train
{
    //Fields
    /* Destination of the Train */
    private String destination;

    /* Train number - identifies the Train */  
    private int TrainNumber;
    
    /* Capacity of the Train - how many customers can be in it */  
    private int capacity;
    
    /* Number of customers currently in the Train */      
    private int numberInTrain;
    
    /* Ticket price - how much a ticket costs. */
    private int ticketPrice;
    
    private int totalTakings;


   public void getTotalTakings(int totalTakings) {
     totalTakings = this.totalTakings;
   }

   public int resetTotalTakings(int totalTakings) {
    return totalTakings = 0;
   }
    
   

    /** Constructor for Train
     * @param dest the destination of the Train
     * @param num the number of the Train
     * @param cap the capacity of the Train
     */
    public Train(String dest, int num, int cap, int id)
    {
        destination = dest;
        capacity = cap;
        TrainNumber = num;
        
        numberInTrain = 0;
        ticketPrice = 50;
        //currentDriver = new Driver(driverName, id);
    }
   
  
    
    
   
    
    /* Records customer taking Train */
    public void enterTrain ()
    {
        
    	 numberInTrain = numberInTrain + 1;
       
    }

    /* Records customer leaving Train */
    public void leaveTrain ()
    {
        numberInTrain = numberInTrain - 1;
    }
    
    
}