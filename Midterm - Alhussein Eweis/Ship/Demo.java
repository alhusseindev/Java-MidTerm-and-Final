import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Demo{  
    public static void main(String [] args){
    
        
        //An ArrayList of type ship, to store our ship objects
        ArrayList <Ship> myShips = new ArrayList <Ship>();

        
        try{
               
               // lets create a Scanner object to read that file
               File myFile = new File("shipinfo.txt");
               Scanner myReader = new Scanner(myFile);
               
               
               // iterate through the text
               while(myReader.hasNextLine()){            //checking if what the scanner is reading has lines of text or no
                    String Data = myReader.nextLine();
                    if(Data.startsWith("Name")){continue;}
                    
                    //String Splitter (splitting what is comming from the scanner
                    String[] mySplitter = Data.split(": ");
                                
                    
                    //lets do the extraction after we did the splitting
                    String name = mySplitter[0];
                    String yearBuilt = mySplitter[1];
                    String shipType = mySplitter[2];
                    //String capacity = mySplitter[3];
                    
                    //if the type of ship is CruiseShip
                    if(shipType.equalsIgnoreCase("CruiseShip")){
                        int maxPassengers= Integer.parseInt(mySplitter[3]);
                        CruiseShip myCruise = new CruiseShip(name,yearBuilt,maxPassengers);
                        myShips.add(myCruise);
                    }
                           
                    //if the type of ship is CargoShip
                    else if (shipType.equalsIgnoreCase("CargoShip")){
                        int capacity = Integer.parseInt(mySplitter[3]);
                        CargoShip myCargo = new CargoShip(name, yearBuilt, capacity);
                        //will need to delete year from here
                        myShips.add(myCargo);
                    }
                    
                    //Else, if the type of the ship is not CruiseShip or CargoShip, then create a new object of type ship
                    else{
                        Ship myShip = new Ship(name,yearBuilt);
                        myShips.add(myShip);
                    }
                                  
            }
            Collections.sort(myShips);
            myReader.close();
            //Collections.sort(myShips, Collections.reverseOrder());
            
            // iteration
            for(Ship x: myShips){ 
                System.out.println(x);}
            
         } catch (FileNotFoundException e){
            System.out.println("Error: File not found, please make sure the file is in the same directory as the project");
            e.printStackTrace();
        }
    }
}