package generyki.generic_extends_5;

public class SquareBox<T extends Rectangle> {
    private T element;

    public SquareBox(T element) {

        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void getElementName() {
        element.hello();
    }
}
