import java.time.LocalDate;

public class MainRun{

    public static void main(String[]args) throws InvalidEmployeeNumber, InvalidPayRate, InvalidShift{
    
        Employee myEmployee = new Employee();
        ProductionWorker myProductionWorker = new ProductionWorker();
        
        myEmployee.setEmployeeName("John");
        myEmployee.setEmployeeNumber("100-a");
        myEmployee.setHireDate(LocalDate.of(2010, 01,01));
        
        System.out.println(myEmployee);
        
        myEmployee.setEmployeeName("Jane");
        myEmployee.setEmployeeNumber("101-A");
        myEmployee.setHireDate(LocalDate.of(2011, 02,02));
        
        System.out.println(myEmployee);
      
        
        myProductionWorker.setEmployeeName("Jack");
        myProductionWorker.setEmployeeNumber("102-b");
        myProductionWorker.setHireDate(LocalDate.of(2012, 03,04));
        myProductionWorker.setShift(1);
        myProductionWorker.setHourlyPayRate(10);
        
        System.out.println(myProductionWorker);
        
        myProductionWorker.setEmployeeName("Jolie");
        myProductionWorker.setEmployeeNumber("117-c");
        myProductionWorker.setHireDate(LocalDate.of(2013, 04,05));
        myProductionWorker.setShift(2);
        myProductionWorker.setHourlyPayRate(15);
        
        System.out.println(myProductionWorker);
        
    }
}