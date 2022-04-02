package bg.tu_varna.sit;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<Character, Operation> operationMap = new HashMap<>();

    public Calculator() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double calculation(double left, char operation, double right) throws InvalidOperation {
        Operation calcOperation;
        if(operationMap.containsKey(operation)){
            calcOperation = operationMap.get(operation);
        }
        else {
            throw new InvalidOperation();
        }
        return calcOperation.calculate(left,right);
    }
}
