package bg.tu_varna.sit;

public class Division implements Operation{
    @Override
    public double calculate(double left, double right) {
        if(right == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return left/right;
    }
}
