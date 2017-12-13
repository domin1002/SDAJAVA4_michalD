package wzorce.startegy;

public class OperationSubtract implements Strategy {
    @Override
    public int doOperations(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
}
