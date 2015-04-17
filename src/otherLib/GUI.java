package otherLib;
//Import all the classes that are needed

import java.util.ArrayList;
import java.util.List;
import java.awt.Font;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class GUI extends JFrame {

    //Declare all GUI elements
    private static JTextField tf;
    private static JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add, subtract, multiply, divide, point, equals, clear;
    //Set the font to use for the text field
    Font font = new Font("Sans", Font.PLAIN, 16);

    //Make handler class to handle all button presses
    private class Handler implements ActionListener {

        //For lastInput: null or clear is 0, integer or equals is 1, point is 2 and operator is 3

        int lastInput = 0;
        int index;
        boolean dec = false;
        String action;
        String text;
        List<Double> numList = new ArrayList<Double>();
        List<String> funcList = new ArrayList<String>();

        public void actionPerformed(ActionEvent event) {
            action = event.getActionCommand();
            switch (action) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    if (lastInput == 0) { //If last input was clear or it is a new program
                        numList.add(Double.parseDouble(action));
                    } else if (lastInput == 1) { //If last input was an integer or equals
                        index = numList.size() - 1;
                        if (tf.getText().charAt(tf.getText().length() - 1) == '0' && dec) { //If point has been pressed and the last char of the text field is 0
                            text = formatNum(numList.get(index), true);
                            if ((text.length() > 1 ? text.charAt(text.length() - 2) != 'E' : true)) { //If the current number is a number with E in it
                                numList.set(index, Double.parseDouble(text + "0" + action));
                            }
                        } else {
                            text = formatNum(numList.get(index));
                            if (text.length() > 1 ? text.charAt(text.length() - 2) != 'E' : true) { //If the current number is a number with E in it
                                numList.set(index, Double.parseDouble(formatNum(numList.get(index)) + action));
                            }
                        }
                    } else if (lastInput == 2) { //If last input was point
                        index = numList.size() - 1;
                        numList.set(index, Double.parseDouble(formatNum(numList.get(index), true) + action));
                    } else if (lastInput == 3) { //If last input was an operator
                        numList.add(Double.parseDouble(action));
                    }

                    //Set this input as lastInput and make sure the GUI is showing the right thing
                    lastInput = 1;
                    if (dec) {
                        groupEnable(true, true, false);
                    } else {
                        groupEnable("all", true);
                    }
                    if (action == "0" && dec) {
                        tf.setText(formatEquation() + "0");
                    } else {
                        tf.setText(formatEquation());
                    }
                    break;

                case ".":
                    dec = true;
                    if (lastInput == 0) {
                        numList.add(0.0);
                    }

                    //Set this input as lastInput and make sure the GUI is showing the right thing
                    lastInput = 2;
                    groupEnable(true, false, false);
                    tf.setText(formatEquation());
                    break;

                case "+":
                case "-":
                case "×":
                case "÷":
                    funcList.add(action);

                    //Set this input as lastInput and make sure the GUI is showing the right thing
                    lastInput = 3;
                    groupEnable(true, false, true);
                    tf.setText(formatEquation());
                    dec = false;
                    break;

                case "=":

                    //Set this input as lastInput, make sure the GUI is showing the right thing and reset most variables
                    groupEnable(true, false, true);
                    tf.setText(formatNum(equals()));
                    lastInput = 1;
                    numList.clear();
                    funcList.clear();
                    numList.add(Double.parseDouble(tf.getText()));
                    dec = (Double.toString(numList.get(0)) == formatNum(numList.get(0)) ? true : false); //Set dec to true if the answer has a decimal point
                    if (dec) {
                        groupEnable(true, true, false);
                    } else {
                        groupEnable("all", true);
                    }
                    break;

                case "clear":
                    //Set this input as lastInput, make sure the GUI is showing the right thing and reset most variables
                    groupEnable(true, false, true);
                    tf.setText("0");
                    lastInput = 0;
                    numList.clear();
                    funcList.clear();
                    dec = false;
            }
        }

        //Method to chop the n last characters of a string
        private String chopEnd(String text, int n) {
            return text.substring(0, text.length() - n);
        }

        //Returns double as a string without '.0' on end if input value (not type) is integer
        private String formatNum(double num) {
            text = Double.toString(num);
            if (text.charAt(text.length() - 1) == '0' && text.charAt(text.length() - 2) == '.') {
                return chopEnd(Double.toString(num), 2);
            } else {
                return Double.toString(num);
            }
        }

		//Returns double as a string without '.0' on end if input value (not type) is integer
        //Or returns '.' on end if last input was point
        private String formatNum(double num, boolean cur) {
            text = Double.toString(num);
            if (text.charAt(text.length() - 1) == '0' && text.charAt(text.length() - 2) == '.') {
                if (dec) {
                    return chopEnd(Double.toString(num), 1);
                } else {
                    return chopEnd(Double.toString(num), 2);
                }
            } else {
                return Double.toString(num);
            }
        }

        //Returns equation so far as string
        private String formatEquation() {
            String output = (numList.size() == 1 ? formatNum(numList.get(0), true) : formatNum(numList.get(0)));
            for (int i = 0; i < numList.size(); i++) {
                if (i != 0) {
                    output += " " + (numList.size() == i + 1 ? formatNum(numList.get(i), true) : formatNum(numList.get(i)));
                }
                if (i < funcList.size()) {
                    output += " " + funcList.get(i);
                }
            }
            return output;
        }

        //Returns solution to equation as double
        private double equals() {
            for (int i = 0; i < funcList.size();) {
                System.out.println(i);
                if (funcList.get(i).equals("×") || funcList.get(i).equals("÷")) { //Do all multiplications and divisions
                    if (funcList.get(i) == "×") {
                        numList.set(i, numList.get(i) * numList.get(i + 1));
                        numList.remove(i + 1);
                        funcList.remove(i);
                    } else if (funcList.get(i) == "÷") {
                        numList.set(i, numList.get(i) / numList.get(i + 1));
                        numList.remove(i + 1);
                        funcList.remove(i);
                    }
                } else {
                    i++;
                }
            }

            for (int i = 0; i < funcList.size();) { //Do all additions and subtractions
                if (funcList.get(i) == "+") {
                    numList.set(i, numList.get(i) + numList.get(i + 1));
                    numList.remove(i + 1);
                    funcList.remove(i);
                } else if (funcList.get(i) == "-") {
                    numList.set(i, numList.get(i) - numList.get(i + 1));
                    numList.remove(i + 1);
                    funcList.remove(i);
                } else {
                    i++;
                }
            }

            return numList.get(0);
        }
    }

    //Provides a quick way to set different groups with groupEnable
    private void groupEnable(boolean nums, boolean operators, boolean point) {
        groupEnable("numbers", nums);
        groupEnable("operators", operators);
        groupEnable("point", point);
    }

    //Sets a group of buttons (all, numbers, operators or point) enabled or disabled

    private void groupEnable(String group, boolean enable) {
        if (group == "all") {
            if (enable) {
                //Enable all buttons
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
                add.setEnabled(true);
                subtract.setEnabled(true);
                multiply.setEnabled(true);
                divide.setEnabled(true);
                equals.setEnabled(true);
                point.setEnabled(true);
            } else {
                //Disable all buttons (excluding clear)
                b0.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                add.setEnabled(false);
                subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equals.setEnabled(false);
                point.setEnabled(false);
            }
        } else if (group == "numbers") {
            if (enable) {
                //Enable all numbers
                b0.setEnabled(true);
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
            } else {
                //Disable all numbers;
                b0.setEnabled(false);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
        } else if (group == "operators") {
            if (enable) {
                //Enable all operators
                add.setEnabled(true);
                subtract.setEnabled(true);
                multiply.setEnabled(true);
                divide.setEnabled(true);
                equals.setEnabled(true);
            } else {
                //Disable all operators
                add.setEnabled(false);
                subtract.setEnabled(false);
                multiply.setEnabled(false);
                divide.setEnabled(false);
                equals.setEnabled(false);
            }
        } else if (group == "point") {
            if (enable) {
                //Enable point
                point.setEnabled(true);
            } else {
                //Disable point
                point.setEnabled(false);
            }
        }
    }

    //Add the GUI items to the pane
    private void addGUIItemsToPane(Container pane) {

        //Set layout to GridBagLayout
        pane.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

		//Initialise GUI elements
        //Set text field text to 0
        tf = new JTextField("0");

        //Set button text
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("×");
        divide = new JButton("÷");
        point = new JButton(".");
        equals = new JButton("=");
        clear = new JButton("clear");

        //Disabled certain buttons
        groupEnable(true, false, true);
        tf.setEditable(false);

        //Set constraints for text field
        c.weightx = 0.5;
        c.insets = new Insets(1, 1, 1, 1);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;

        //Add text field
        tf.setFont(font);
        pane.add(tf, c);

        //Add clear button
        c.weightx = 0.5;
        c.insets = new Insets(1, 1, 1, 1);
        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 0;
        pane.add(clear, c);

        //Set general button constraints
        c.weightx = 0.5;
        c.ipadx = 20;
        c.ipady = 20;
        c.insets = new Insets(1, 1, 1, 1);
        c.gridwidth = 1;

        //Add 7 button
        c.gridx = 0;
        c.gridy = 1;
        pane.add(b7, c);

        //Add 8 button
        c.gridx = 1;
        c.gridy = 1;
        pane.add(b8, c);

        //Add 9 button
        c.gridx = 2;
        c.gridy = 1;
        pane.add(b9, c);

        //Add add button
        c.gridx = 3;
        c.gridy = 1;
        pane.add(add, c);

        //Add 4 button
        c.gridx = 0;
        c.gridy = 2;
        pane.add(b4, c);

        //Add 5 button
        c.gridx = 1;
        c.gridy = 2;
        pane.add(b5, c);

        //Add 6 button
        c.gridx = 2;
        c.gridy = 2;
        pane.add(b6, c);

        //Add subtract button
        c.gridx = 3;
        c.gridy = 2;
        pane.add(subtract, c);

        //Add 1 button
        c.gridx = 0;
        c.gridy = 3;
        pane.add(b1, c);

        //Add 2 button
        c.gridx = 1;
        c.gridy = 3;
        pane.add(b2, c);

        //Add 3 button
        c.gridx = 2;
        c.gridy = 3;
        pane.add(b3, c);

        //Add multiply button
        c.gridx = 3;
        c.gridy = 3;
        pane.add(multiply, c);

        //Add point button
        c.gridx = 0;
        c.gridy = 4;
        pane.add(point, c);

        //Add 0 button
        c.gridx = 1;
        c.gridy = 4;
        pane.add(b0, c);

        //Add equals button
        c.gridx = 2;
        c.gridy = 4;
        pane.add(equals, c);

        //Add divide button
        c.gridx = 3;
        c.gridy = 4;
        pane.add(divide, c);
    }

    //Adds the Handler class as an action listener for each button
    private void setHandlers() {
        Handler handler = new Handler();
        b0.addActionListener(handler);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        add.addActionListener(handler);
        subtract.addActionListener(handler);
        multiply.addActionListener(handler);
        divide.addActionListener(handler);
        point.addActionListener(handler);
        equals.addActionListener(handler);
        clear.addActionListener(handler);
    }

    //Constructor starts as soon as a GUI object is created
    public GUI() {
        //Create a new JFrame and set title to Calculator
        JFrame frame = new JFrame("Calculator");
        //Make window close when X is pressed
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Add GUI items to pane
        addGUIItemsToPane(frame.getContentPane());
        frame.pack();
        frame.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
        //Call set Handlers to add handlers to every button
        setHandlers();

        //Set the JFrame to visible 
        frame.setVisible(true);
    }
}
