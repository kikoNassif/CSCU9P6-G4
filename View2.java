package mvcexample;

// This is the red view
// It displays the B component of the model (data base)

import java.util.*;  // For Observer
import java.awt.*;
import javax.swing.*;

public class View2 extends JPanel 
                   implements Observer {
  
    private Model model;
    private Controller1 contr;   // Parent Frame
    
    private JTextField display;
    
    // Constructor
    public View2(Controller1 contr, Model model) {
          
        // Record references to the parent controller and the model
        this.contr = contr;
        this.model = model;
        
        // Set up view GUI
        setBackground(Color.red);
        add(new JLabel("View2"));
        display = new JTextField("No data", 15);
        add(display);
        
        // Subscribe to the model
        model.addObserver(this);
      
    } // constructor
    
    // Notified by the model when it is altered:
    public void update(Observable o, Object arg) {
  
        // Fetch (potentially) updated information and display it
        int b = model.getDataB();
        display.setText("Model data B: " + b);
      
    } // update
    
    // Called by the controller to clear the view:
    public void clear() {
        
        display.setText("");
      
    } // clear
    
} // class View2



