package console;

import java.util.Locale;
import java.util.Scanner;

public class GainInputFromMedia implements bg.tu_varna.sit.GainInput {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    @Override
    public double gainLeftInput() {
        System.out.println("Enter left operand:");
        return scanner.nextDouble();
    }

    @Override
    public double gainRightInput() {
        System.out.println("Enter right operand:");
        return scanner.nextDouble();
    }

    @Override
    public char gainOperationInput() {
        System.out.println("Enter operation(+-*/):");
        return scanner.next().charAt(0);
    }
}
