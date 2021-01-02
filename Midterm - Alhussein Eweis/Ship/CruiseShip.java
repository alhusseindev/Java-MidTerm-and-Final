public class CruiseShip extends Ship{
    
    private int maxNoPassengers;
    private int noRmsAvailable;
    
    //here we are inheriting the constructor, we will add our custom stuff, we will define the variables of this class 

    public CruiseShip(String name, String year, int maxNoPassengers /*, int noRmsAvailable*/){
        super(name, year);
        
        this.maxNoPassengers = maxNoPassengers;
        this.noRmsAvailable = noRmsAvailable;
        
    }
    

    //Getters
    public int getMaxNoPassengers(){
        return this.maxNoPassengers;
    }

    public int getNoRmsAvailable(){
        return this.noRmsAvailable;
    }

    
    //Setters
    public void setMaxNoPassengers(int maxNoPassengers){
        this.maxNoPassengers = maxNoPassengers;
    }
    
    public void setNoRmsAvailable(int noRmsAvailable){
        this.noRmsAvailable = noRmsAvailable;
    }
    
    //Str method
    public String toString(){
        return "Ship Name: " + getName() + " - Max no. of Pssngrs: " + this.maxNoPassengers + " - No. of Rooms Available: " + this.noRmsAvailable;
    }


}