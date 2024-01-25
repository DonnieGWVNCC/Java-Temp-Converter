/* Donnie Garrison
 * CIT 272 Object Oriented Programming
 * Program: TempConversionGUI
 * This program runs a Temp Conversion GUI Program
 * 02/19/2023
 */

 /// This step imports 'JFrame'
//import java.awt.Dimension;

import javax.swing.JFrame;

/// This step creates a public class 'TempConversionGUI'
public class TempConversionGUI {
    public static void main(String[] args) {
        
        /// This step creates a JFrame object with the name 'window'
        /// It has the title "Temperature Conversion"
        JFrame window = new JFrame("Temperature Conversion");

        /// This step has the application close completely on exit
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /// This step creates a 'TempConversionPanel' object named 'body'
        TempConversionPanel body = new TempConversionPanel();

        /// This step adds the 'body' object to the JFrame contents pane
        /// This is a getter method that returns the object 'ContentPane'
        window.getContentPane().add(body);

        /// This step centers the JFrame once it is running
        window.setLocationRelativeTo(body);

        /// This step sets the JFrame to be visible
        window.setVisible(true);    

        
    }
}