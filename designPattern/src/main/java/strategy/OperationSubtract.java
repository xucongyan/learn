package strategy;

public class OperationSubtract extends Operation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public String getType() {
        return "SUBTRACT";
    }
}
