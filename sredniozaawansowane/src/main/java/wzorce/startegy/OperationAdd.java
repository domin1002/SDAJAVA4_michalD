package wzorce.startegy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperations(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
