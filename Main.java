package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model); // Create first instance of first controller
        Controller1 c2 = new Controller1(model); // Create second instance of first controller
        Controller2 c3 = new Controller2(model); // Create first instance of second controller
        Controller2 c4 = new Controller2(model); // Create second instance of second controller
        
    } // main
  
} // Main
