package generyki.generic_extends_5;

public class ShapeBox<TYPE extends Shape> {
    private TYPE shape;

    public ShapeBox(TYPE shape) {
        this.shape = shape;
    }

    public TYPE getShape() {
        return shape;
    }

    public String getName() {
        shape.hello();
        return shape.getName();
    }
}
