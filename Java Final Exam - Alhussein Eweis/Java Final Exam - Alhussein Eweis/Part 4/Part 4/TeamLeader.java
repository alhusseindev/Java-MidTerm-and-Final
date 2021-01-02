public class TeamLeader extends ProductionWorker{
    
    private double monthlyBonus;
    private int requiredTrainingHours;
    private int attendedTrainingHours;
    
    public TeamLeader(){
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.attendedTrainingHours = attendedTrainingHours;
    }
    
    //Getters (accessors)
    
    public double getMonthlyBonus(){
        return this.monthlyBonus;
    }
    
    public int getRequiredTrainingHours(){
        return this.requiredTrainingHours;
    }
    
    public int attendedTrainingHours(){
        return this.attendedTrainingHours;
    }
    
    //Setters (Mutators)
    
    public void setMonthlyBonus(double monthlyBonus){
        this.monthlyBonus = monthlyBonus;
    }
    
    public void setRequiredTrainingHours(int requiredTrainingHours){
        this.requiredTrainingHours = requiredTrainingHours;
    }
    
    public void setAttendedTrainingHours(int attendedTrainingHours){
        this.attendedTrainingHours = attendedTrainingHours;
    }
    
    //Str method
    public String toString(){
        return "Employee Name: "+ getEmployeeName() + " - Employee Number: " + getEmployeeNumber() + " - Hire Date: " + getHireDate() + " - Shift: " + getShift() + " - Hourly Pay Rate($): " + getHourlyPayRate() + " - Monthly Bonus: " + this.monthlyBonus + " - Required Training Hours: " + this.requiredTrainingHours + " - Attended Training Hours: " + this.attendedTrainingHours;
    }
    
    


}