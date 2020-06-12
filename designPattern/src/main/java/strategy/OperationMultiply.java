package strategy;

public class OperationMultiply extends Operation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public String getType() {
        return "MULTIPLY";
    }
}
