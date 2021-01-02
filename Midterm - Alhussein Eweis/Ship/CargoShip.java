public class CargoShip extends Ship{
    
    private int cargoCapacity;
    
    // a constructor to match the signature of the parent class, by inheriting the super class methods, cargoCapacity is newly added to the constructor
    public CargoShip(String name, String year, int cargoCapacity){
        super(name, year);
        
        this.cargoCapacity = cargoCapacity;
        
    }
   
    //Getter
    public int getCargoCapacity(){
        return this.cargoCapacity;
    }
    
    //Setter
    public void setCargoCapacity(int cargoCapacity){
        this.cargoCapacity=cargoCapacity;
    }
    
    //Str method
    public String toString(){
        return "Ship Name: " + getName() + " - Cargo Capacity (Tons): " + this.cargoCapacity;
    }
}