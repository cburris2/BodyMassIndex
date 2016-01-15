/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindex;

/**
 *
 * @author Charlie Burris
 */
import javax.swing.JOptionPane;

public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculate Body Mass Index based on user input
        
        // Create a GUI input window 
        String weightInput = JOptionPane.showInputDialog(null, 
                "Enter a weight in lbs. ");
        
        // Covert lbs to kg
        double weightOutput = Double.parseDouble(weightInput)* 0.45359237;
        
        //show results in a GUI window for testing conversion
        /*JOptionPane.showMessageDialog(null, "You entered" +weightInput+
                " in lbs is " + "\f in kg it is"+weightOutput); */
        
        // gui input for height in inches 
        String heightInput = JOptionPane.showInputDialog(null, 
                "Enter a height in inches. Note:1foot = 12inches ");
        
        // convert height from inches to meters
        double heightOutput = Double.parseDouble(heightInput)*0.0254;
        
        //show results in a GUI window
        /*JOptionPane.showMessageDialog(null, "You entered" +heightInput+
                " in inches is " + "\f in meters it is"+heightOutput); */
        
        // Calculate Body Mass Index
        double bmi = weightOutput /(heightOutput * heightOutput);
        
         JOptionPane.showMessageDialog(null, "Your Body Mass Index is" +
                 Math.round(bmi*10000.00)/10000.00);
        
        //results confirmed by tests and comparing to cdc website calculator.
    }
    
}
