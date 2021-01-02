public class ShiftSupervisor extends Employee{

    private double annualSalary;
    private double annualProductionBonus;
    
    public ShiftSupervisor(){
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }
    
    //Getters (accessers)
    
    public double getAnnualSalary(){
        return this.annualSalary;
    }
    
    public double annualProductionBonus(){
        return this.annualProductionBonus;
    }
    
    //Setters (Mutators)
    
    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }
    
    public void setAnnualProductionBonus(double annualProductionBonus){
        this.annualProductionBonus = annualProductionBonus;
    }
    
    //Str method
    
    public String toString(){
        return "Employee Name: "+ getEmployeeName() + " - Employee Number: " + getEmployeeNumber() + " - Hire Date: " + getHireDate() + " - Annual Salary: "+ this.annualSalary + " - Annual Production Bonus: " + this.annualProductionBonus; 
    } 

}