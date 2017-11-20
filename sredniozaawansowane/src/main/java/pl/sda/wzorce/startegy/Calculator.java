package pl.sda.wzorce.startegy;

public class Calculator {

    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int numberOne, int numberTwo) {
        return strategy.doOperations(numberOne, numberTwo);
    }

}
