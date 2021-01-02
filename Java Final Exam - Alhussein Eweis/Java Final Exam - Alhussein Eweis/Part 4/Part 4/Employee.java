import java.time.LocalDate;


public class Employee{
    
    private String employeeName;
    private String employeeNumber;         //format: XXX-L,each X is a digit in the range 0-9, L is a letter in range (A-M)
    private LocalDate hireDate;        //using Date class
    
    
    
    public Employee(){
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    
    }
    
    //Getters
    public String getEmployeeName(){
        return this.employeeName;
    }
    
    public String getEmployeeNumber(){
        return this.employeeNumber;
    }
    
    public LocalDate getHireDate(){
        return this.hireDate;
    }
    
    //this method to check if an object is an integer
    public boolean isObjectInteger(Object o){
        if(o instanceof Integer){
            return true;
        }else{
            return false;
        }
    }
    
    //Setters
    
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    public void setEmployeeNumber(String employeeNumber) throws InvalidEmployeeNumber{
        try{
            this.employeeNumber = employeeNumber;
            throw new InvalidEmployeeNumber("Invalid Employee Number!   (ie.Number should be between 0 and 9999");
            
       }catch(InvalidEmployeeNumber e){
           char firstChar = '\0'; 
           char secondChar = '\0';
           char thirdChar = '\0'; 
           char fourthChar = '\0'; 
           int afterConversion = '\0';
           
           if(employeeNumber.length() >=1){
               if(isObjectInteger(firstChar)==true){
               firstChar = employeeNumber.charAt(0);}
               if(isObjectInteger(secondChar)==true){
               secondChar = employeeNumber.charAt(1);}
               if(isObjectInteger(thirdChar)==true){
               thirdChar = employeeNumber.charAt(2);}
               if(isObjectInteger(fourthChar)==true){
               fourthChar = employeeNumber.charAt(3);}
               
               
               if(employeeNumber.length() == 5){
                   if(!(Character.isDigit(employeeNumber.charAt(0)) && Character.isDigit(employeeNumber.charAt(1)) && Character.isDigit(employeeNumber.charAt(2))) && employeeNumber.charAt(3)=='-'){
                       throw new InvalidEmployeeNumber("Employee Number should be in the format xxx - L  (x: numbers > 0, L: letter Aa-Mm");
                    }
                    if(!(employeeNumber.charAt(4) >='A' && employeeNumber.charAt(4) <='M' || employeeNumber.charAt(4) >='a' && employeeNumber.charAt(4) <='m')){
                     throw new InvalidEmployeeNumber("Employee Number should be in the format xxx - L  (x: numbers > 0, L: letter Aa-Mm"); 
                }
               }else if (employeeNumber.length() == 6){
                   if(!(Character.isDigit(employeeNumber.charAt(0)) && Character.isDigit(employeeNumber.charAt(1)) && Character.isDigit(employeeNumber.charAt(2)) && Character.isDigit(employeeNumber.charAt(3)))){
                       throw new InvalidEmployeeNumber("Employee Number should be in the format xxx - L  (x: numbers > 0, L: letter Aa-Mm");
                    }
                    if(!(employeeNumber.charAt(5) >='A' && employeeNumber.charAt(5) <='M' || employeeNumber.charAt(5) >='a' && employeeNumber.charAt(5) <='m')){
                     throw new InvalidEmployeeNumber("Employee Number should be in the format xxx - L  (x: numbers > 0, L: letter Aa-Mm"); 
                }
                }
                
            }else{
                throw new InvalidEmployeeNumber("Invalid Employee Number!  (ie.Number should be between 0 and 9999)");
            }
            
              
            
            if(employeeNumber.length() <= 4 || employeeNumber.charAt(0)== '-' || employeeNumber.charAt(1)== '-' || employeeNumber.charAt(2)== '-'){ throw new InvalidEmployeeNumber("Employee Number should be in the format xxx - L  (x: numbers > 0, L: letter Aa-Mm");}
           
            
            
        if(employeeNumber.length() > 6){     //taking care of numbers above 9999
               throw new InvalidEmployeeNumber("Invalid Employee Number!  (ie.Number should be between 0 and 9999)");
            }
       }
    }
    
    public void setHireDate(LocalDate hireDate){
        this.hireDate = hireDate;
    }
    
    
    //Str Method
    public String toString(){
        return "Employee Name: "+ this.employeeName + " - Employee Number: " + this.employeeNumber + " - Hire Date: " + this.hireDate; 
    }
    
}


class InvalidEmployeeNumber extends Exception{
    public InvalidEmployeeNumber(String s){
        super(s);        //calling the constructor of the exception class
    }
}