package generyki.generic_3;

/**
 * T-type
 * k-klucz
 * V-wartość
 * E-element (np.kolekcji)
 * n-liczba
 * @param <T>
 */

public class FruitBox<T> {

    private T fruit;

    public FruitBox(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }
}
