package strategy;


public abstract class Operation implements Strategy {

    {
        String type = this.getType();
        StrategyContent.add(type, this);
    }


    protected abstract String getType();

    public static int executeStrategy(String type, int num1, int num2) {
        Strategy strategy = StrategyContent.getStrategy(type);
        return strategy.doOperation(num1, num2);
    }
}
