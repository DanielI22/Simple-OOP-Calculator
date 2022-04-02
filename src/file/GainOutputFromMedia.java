package file;

import bg.tu_varna.sit.GainOutput;

import java.io.FileWriter;
import java.io.IOException;

public class GainOutputFromMedia implements GainOutput {
    String outputFile = "output.txt";

    @Override
    public void gainOutput(double result) {
        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            String resultToString = Double.toString(result);
            fileWriter.write("Your result is: " + resultToString);
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
