import java.time.LocalDate;

public class MainRun{

    public static void main(String[]args) throws InvalidEmployeeNumber, InvalidPayRate, InvalidShift{
    
        Employee myEmployee = new Employee();
        ProductionWorker myProductionWorker = new ProductionWorker();
        ShiftSupervisor myShiftSupervisor = new ShiftSupervisor();
        
        /* *********************Employee Instances(Objects)**************************** */
        
        myEmployee.setEmployeeName("John");
        myEmployee.setEmployeeNumber("100-a");
        myEmployee.setHireDate(LocalDate.of(2010, 01,01));
        
        System.out.println(myEmployee);
        
        myEmployee.setEmployeeName("Jane");
        myEmployee.setEmployeeNumber("101-A");
        myEmployee.setHireDate(LocalDate.of(2011, 02,02));
        
        System.out.println(myEmployee);
      
        /* *********************ProductionWorker Instances(Objects)**************************** */
        
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
        
        /* *********************ShifSupervisor Instances(Objects)**************************** */
        
        myShiftSupervisor.setEmployeeName("Tim");
        myShiftSupervisor.setEmployeeNumber("104-B");
        myShiftSupervisor.setHireDate(LocalDate.of(2014, 07,02));
        myShiftSupervisor.setAnnualSalary(40000);
        myShiftSupervisor.setAnnualProductionBonus(5000);
        
        System.out.println(myShiftSupervisor);
        
        myShiftSupervisor.setEmployeeName("Tracey");
        myShiftSupervisor.setEmployeeNumber("105-C");
        myShiftSupervisor.setHireDate(LocalDate.of(2014, 02,21));
        myShiftSupervisor.setAnnualSalary(50000);
        myShiftSupervisor.setAnnualProductionBonus(6000);
        
        System.out.println(myShiftSupervisor);
        
    }
}