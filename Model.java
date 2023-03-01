package mvcexample;

// A database with two counter components

import java.util.*;  // For Observable

public class Model extends Observable {

    private int dataBaseA = 0;     // A two component database
    private int dataBaseB = 0;
  
    public Model() { }             // Constructor doesn't do anything
  
    public void modifyA() {        // Mutator method for A component
        
        dataBaseA++;
        setChanged();
        notifyObservers();         // Note: notifies ALL Observing views
        
    } // modifyA
    
    public void modifyB() {        // Mutator method for B component
        
        dataBaseB++;
        setChanged();
        notifyObservers();         // Note: notifies ALL Observing views
        
    } // modifyB
  
    public int getDataA() {
        
        return dataBaseA;
        
    } // getDataA
 
    public int getDataB() {
        
        return dataBaseB;
        
    } // getDataB
  
} // class Model
