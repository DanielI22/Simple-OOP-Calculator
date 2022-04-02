package bg.tu_varna.sit;

import file.GainInputFromMedia;
import file.GainOutputFromMedia;

public class Main {

    public static void main(String[] args) {
        try {
            Calculator myCalculator = new Calculator();
            double left, right;
            char operation;
            double result;

            GainInput myInput = new GainInputFromMedia();
            left = myInput.gainLeftInput();
            operation = myInput.gainOperationInput();
            right = myInput.gainRightInput();

            result = myCalculator.calculation(left,operation,right);

            GainOutput myOutput = new GainOutputFromMedia();
            myOutput.gainOutput(result);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
