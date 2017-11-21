package pl.sda.wzorce;

import pl.sda.wzorce.startegy.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperations(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
}