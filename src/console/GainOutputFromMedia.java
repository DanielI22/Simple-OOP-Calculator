package console;

import bg.tu_varna.sit.GainOutput;

public class GainOutputFromMedia implements GainOutput {

    @Override
    public void gainOutput(double result) {
        System.out.println("Your result is: " + result);
    }
}
