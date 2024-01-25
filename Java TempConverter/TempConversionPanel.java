/* Donnie Garrison
 * CIT 272 Object Oriented Programming
 * Program: TempConversionPanel
 * This program creates a JPanel for the main to use
 * 02/19/2023
 */

/// This step imports the 'Dimension' class that allows us to use the 'Dimension' object to set the size of the object
import java.awt.Dimension;

/// This step imports all the 'javax.swing' classes
import javax.swing.*;

/// This step imports a class that is used for ActionListeners
import java.awt.event.*;

/// This step creates a class known as 'TempConversionPanel' that extends 'JPanel'
public class TempConversionPanel extends JPanel {
    
    /// This step creates all the properties of the 'TempConversionPanel' class
    private JLabel inputLabel;
    private JTextField tempInput;
    private JRadioButton fahrenheitButton; 
    private JRadioButton celsiusButton;
    private JButton convertButton;
    private JLabel fahrenheitLabel;
    private JLabel fdisplayLabel;
    private JLabel celsiusLabel;
    private JLabel cdisplayLabel;
    private JLabel kelvinLabel;
    private JLabel kdisplayLabel;
    
    /// This step creates a constructor for the class, 'TempConversionPanel'
    public TempConversionPanel(){
        
        /// This step creates a JLabel with the name 'inputLabel' that prompts the user to input a numerical degree
        /// The JLabel has the text of 'Please enter the temperature you would like to convert: '
        /// The JLabel is then added to the JFrame 'add()' function
        inputLabel = new JLabel("Please enter the temparature you would like to convert: ");
        this.add(inputLabel);

        /// This step creates a JTextField that is used to intake the users input of temperature
        /// It is then added to the JFrame with the 'add()' function
        tempInput = new JTextField(5);
        this.add(tempInput);

        /// This step creates a JRadioButton with the text 'Fahrenheit'
        /// It is then added to the JFrame with the 'add()' function
        fahrenheitButton = new JRadioButton("Fahrenheit");
        this.add(fahrenheitButton);

        /// This step creates a JRadioButton with the text 'Celsius'
        /// It is then added to the JFrame with the 'add()' function
        celsiusButton = new JRadioButton("Celsius");
        this.add(celsiusButton);
        
        /// This step creates a JButton with the text 'Convert'
        /// It is then added to the JFrame with the 'add()' function
        convertButton = new JButton("Convert");
        this.add(convertButton);

        /// This step creates a JLabel with the text 'Fahrenheit'
        /// It is then added to the JFrame with the 'add()' function
        fahrenheitLabel = new JLabel("Fahrenheit:");
        this.add(fahrenheitLabel);

        /// This step creates a JLabel with the text '0'
        /// It is then added to the JFrame with the 'add()' function
        fdisplayLabel = new JLabel("0");
        this.add(fdisplayLabel);

        /// This step creates a JLabel with the text 'Celsius'
        /// It is then added to the JFrame with the 'add()' function
        celsiusLabel = new JLabel("Celsius:");
        this.add(celsiusLabel);

        /// This step creates a JLabel with the text '0'
        /// It is then added to the JFrame with the 'add()' function
        cdisplayLabel = new JLabel("0");
        this.add(cdisplayLabel);

        /// This step creates a JLabel with the text 'Kelvin'
        /// It is then added to the JFrame with the 'add()' function
        kelvinLabel = new JLabel("Kelvin:");
        this.add(kelvinLabel);

        /// This step creates a JLabel with the text '0'
        /// It is then added to the JFrame with the 'add()' function
        kdisplayLabel = new JLabel("0");
        this.add(kdisplayLabel);

        /// This step creates a ButtonGroup object with the name 'group'
        /// The 'fahrenheitButton' and 'celsiusButton' are then added to the 'group' object
        /// This makes it so the user can only select one radio button at a time
        ButtonGroup group = new ButtonGroup();
        group.add(fahrenheitButton);
        group.add(celsiusButton);

        /// This step creates an 'RButtonListener' with the name 'listener'
        /// This step adds an ActionListener to the convertButton
        /// This makes sure that the convertButton performs it's proper functions when clicked
        /// It tells the button what to do
        RButtonListener listener = new RButtonListener();
        convertButton.addActionListener(listener);
        
        /// This step sets the size of the JFrame using the 'Dimension' class
        setPreferredSize(new Dimension(600,600));
    }

    /// This step creates the class, 'RButtonListener' that implements the 'ActionListener'
    private class RButtonListener implements ActionListener {

        /// This is where the code that reacts to the action of the user is created
        @Override
        public void actionPerformed(ActionEvent e) {
            
            /// This creates a function that where if the 'fahrenheitButton' is selected
            /// it will take the users input of temp and convert the temp from fahrenheit
            /// to celsius, and fahrenheit to kelvin. It will display the 3 temperatures to 
            /// their corresponding labels, 'celsius', 'fahrenheit', and 'kelvin'
            /// in this case fahrenheit will simply display the temp that was input by the user
            if (fahrenheitButton.isSelected()){

                double FtoC = (Double.parseDouble(tempInput.getText()));
                double C = (FtoC - 32) * (5.0 / 9.0);
                cdisplayLabel.setText("" + C);

                double FtoK = (Double.parseDouble(tempInput.getText()));
                double K = (FtoK - 32) * (5.0 / 9.0) + (273.15);
                kdisplayLabel.setText("" + K);

                double F = (Double.parseDouble(tempInput.getText()));
                fdisplayLabel.setText("" + F);

            /// This step is what takes place if the 'celsiusButton' is selected
            /// it will take the users input of temp and convert the temp from celsius
            /// to fahrenheit, and celsius to kelvin. It will display the 3 temperatures to 
            /// their corresponding labels, 'celsius', 'fahrenheit', and 'kelvin'
            /// in this case celsius will simply display the temp that was input by the user
            } else if (celsiusButton.isSelected()){

                double CtoF = (Double.parseDouble(tempInput.getText()));
                double F = (CtoF * 9/5) + (32);
                fdisplayLabel.setText("" + F);

                double CtoK = (Double.parseDouble(tempInput.getText()));
                double K = (CtoK + 273);
                kdisplayLabel.setText("" + K);

                double C = (Double.parseDouble(tempInput.getText()));
                cdisplayLabel.setText("" + C);
            }
            
        }
    } 
}

  