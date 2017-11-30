package generyki.generic_extends_5;

public interface Shape {
    String getName();

    default void hello() {
        System.out.println("Hello, I'm shape!");
    }
}
