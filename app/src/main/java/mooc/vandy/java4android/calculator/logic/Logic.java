package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;


    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }


    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        int valueToBePrinter = 0;
        switch (operation) {
            case 1: {
                Add add = new Add();
                valueToBePrinter = add.addition(argumentOne, argumentTwo);
            }
            case 2: {
                Subtract subtract = new Subtract();
                valueToBePrinter = subtract.subtraction(argumentOne, argumentTwo);
            }
            case 3: {
                Multiply multiply = new Multiply();
                valueToBePrinter = multiply.multiplication(argumentOne, argumentTwo);
            }
            case 4: {
                Divide divide = new Divide();
                valueToBePrinter = divide.division(argumentOne, argumentTwo);
            }

        }


        mOut.print(String.valueOf(valueToBePrinter));
    }
}

