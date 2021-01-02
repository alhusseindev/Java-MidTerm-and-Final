public class ProductionWorker extends Employee{

    private int shift;
    private double hourlyPayRate;
    
    public ProductionWorker(){
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    //Getters
    public int getShift(){
        return this.shift;
    }
    
    public double getHourlyPayRate(){
        return this.hourlyPayRate;
    }
    
    //Setters
    public void setShift(int shift) throws InvalidShift{
        try{
        this.shift = shift;
        throw new InvalidShift("Please enter a valid shift (1:Day - 2:Night)");
       }catch(InvalidShift e){
        if(this.shift > 2 || this.shift < 1){
            throw new InvalidShift("Please enter a valid shift (1:Day - 2:Night)");
        }
       }
    }
  
    public void setHourlyPayRate(double hourlyPayRate) throws InvalidPayRate{
        try{
        this.hourlyPayRate = hourlyPayRate;
        throw new InvalidPayRate("Hourly Pay Rate cannot be negative!");
       }catch(InvalidPayRate e){
           if(hourlyPayRate < 0){
               throw new InvalidPayRate("Hourly Pay Rate cannot be negative!");
            }
        }
    }
    
    
    public String toString(){
        return "Employee Name: "+ getEmployeeName() + " - Employee Number: " + getEmployeeNumber() + " - Hire Date: " + getHireDate() + " - Shift: " + this.shift + " - Hourly Pay Rate($): " + this.getHourlyPayRate();
    }
}

class InvalidShift extends Exception{
    public InvalidShift(String s){
        super(s);               //calls the constructor of the parent class which is the Exception class
    }
}

class InvalidPayRate extends Exception{
    public InvalidPayRate(String a){
        super(a);       //calling the constructor of the Exception class
    }
}