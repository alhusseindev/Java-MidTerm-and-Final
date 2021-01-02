import java.lang.String;

public class Ship implements Comparable <Ship>{
    private String name;
    private String year;
    
    public Ship(String name, String year){
        this.name = name;
        this.year = year;
    
    }

    //Getters
    public String getName(){
        return this.name;
    }
    
    public String getYear(){
        return this.year;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setYear(String year){
        this.year = year;
    }
    
    //compareTo Interface method
    
    public int compareTo(Ship x){
        
        //Sorting in Decending order
        return Integer.parseInt(x.year) - Integer.parseInt(this.year);
       
    }
    
    //Str method
    public String toString(){
        return "Ship Name: " + getName() + " - Year: " + getYear();
    }

}