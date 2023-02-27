package mvcexample;

// This is the cyan view
// It displays the A component of the model (data base)

import java.util.*;  // For Observer
import java.awt.*;
import javax.swing.*;

public class View1 extends JPanel 
                   implements Observer {
  
    private Model model;
    private Controller1 contr;   // Parent Frame
    
    private JTextField display;
    
    // Constructor
    public View1(Controller1 contr, Model model) {
        
        // Record references to the parent controller and the model
        this.contr = contr;
        this.model = model;
        
        // Set up view GUI
        setBackground(Color.cyan);
        add(new JLabel("View1"));
        display = new JTextField("No data", 15);
        add(display);
        
        // Subscribe to the model
        model.addObserver(this);
      
    } // constructor
    
    // Notified by the model when it is altered:
    public void update(Observable o, Object arg) {
        
        // Fetch (potentially) updated information and display it
        int a = model.getDataA();
        display.setText("Model data A: " + a);
        
    } // update
    
    // Called by the controller to clear the view:
    public void clear() {
        
        display.setText("");
      
  } // clear
  
} // class View1


