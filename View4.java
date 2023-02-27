package mvcexample;

// This is the pink view.
// It displays the B component of the model (data base).
// As supplied, this view does not subscribe to the model as an Observer,
// and relies on its controller to call update to cause the view to be refreshed.

import java.util.*;  // For Observer
import java.awt.*;
import javax.swing.*;

public class View4 extends JPanel {
  
    private Model model;
    private Controller2 contr;   // Parent Frame
    
    private JTextField display;
    
    // Constructor
    public View4(Controller2 contr, Model model) {
        
        // Record references to the parent controller and the model
        this.contr = contr;
        this.model = model;
        
        // Set up view GUI
        setBackground(Color.pink);
        add(new JLabel("View4"));
        display = new JTextField("No data", 15);
        add(display);
      
    } // constructor
    
    // Called by controller to refresh the view:
    public void update() {
        
        // Fetch (potentially) updated information and display it
        int b = model.getDataB();
        display.setText("Model data B: " + b);
      
    } // update
    
    // Called by the controller to clear the view:
    public void clear() {
        
        display.setText("");
      
    } // clear
    
} // class View4
