package generyki.bigger_fruit_box_4;

public class BiggerFruitBox <T, B>{
    private T fruit1;
    private B fruit2;

    public BiggerFruitBox(T fruit1, B fruit2) {
        this.fruit1 = fruit1;
        this.fruit2 = fruit2;
    }

    public T getFruit1() {
        return fruit1;
    }

    public B getFruit2() {
        return fruit2;
    }
}
