package file;

import bg.tu_varna.sit.GainInput;
import javafx.scene.chart.ScatterChart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class GainInputFromMedia implements GainInput {


    File inputFile = new File("input.txt");
    Scanner scanner = new Scanner(inputFile).useLocale(Locale.US);

    public GainInputFromMedia() throws FileNotFoundException {
    }

    @Override
    public double gainLeftInput() {
        return scanner.nextDouble();
    }

    @Override
    public double gainRightInput() {
        return scanner.nextDouble();
    }

    @Override
    public char gainOperationInput() {
        return scanner.next().charAt(0);
    }
}
