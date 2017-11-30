package generyki;

import generyki.bigger_fruit_box_4.BiggerFruitBox;
import generyki.generic_3.FruitBox;
import generyki.generic_extends_5.*;
import generyki.generic_methods_6.VoidMethods;
import generyki.simple_2.SimpleFruitBox;
import generyki.without_1.Apple;
import generyki.without_1.AppleBox;
import generyki.without_1.Orange;
import generyki.without_1.OrangeBox;

public class Main {
    public static void main(String[] args) {
//        without_1();
//        simple_2();
//        generic_3();
//        bigger_fruit_box();
//        generic_extends_5();
        generic_methods_6();

    }

    private static void generic_methods_6() {
//        ShapeBox<Rectangle> box1 = new ShapeBox<>(new Rectangle()); BLAD
//        ShapeBox<Square> box2 = new ShapeBox<>(new Square());  BLAD
        ShapeBox<Circle> box3 = new ShapeBox<>(new Circle());
        VoidMethods.method1(box3);

        /*********************************************************/
        ShapeBox<Rectangle> box1 = new ShapeBox<>(new Rectangle());
        ShapeBox<Square> box2 = new ShapeBox<>(new Square());
        VoidMethods.method2(box1);

    }

    private static void generic_extends_5() {
        ShapeBox<Circle> shapeBox = new ShapeBox<>(new Circle());
        ShapeBox<Rectangle> shapeBox2 = new ShapeBox<>(new Rectangle());

        //po dodaniu do typu generycznego w shapebox extends Shape możemy używać tylko obiektów które implementują shape
        // w związku z czym poniższy kod nie będzie działał
        // ShapeBox<String> shapeBox3 = new ShapeBox<>("AAAAAA");
        //System.out.println(shapeBox.getNameOfShape());
        //shapeBox.getShape().hello();

        ShapeBox<Square> shapeBox3 = new ShapeBox<>(new Square());
        shapeBox3.getShape().hello();
    }

    private static void bigger_fruit_box() {
        BiggerFruitBox<Apple, Orange> biggerFruitBox = new BiggerFruitBox<>(new Apple(), new Orange());
        System.out.printf("Pierwszy: %s, drugi: %s\n", biggerFruitBox.getFruit1().getClass().getSimpleName(),
                biggerFruitBox.getFruit2().getClass().getSimpleName());

        BiggerFruitBox<String, Float> biggerFruitBox2 = new BiggerFruitBox<>("ABCDEF", 2.0f);
        System.out.printf("Pierwszy: %s, drugi: %s\n", biggerFruitBox2.getFruit1().getClass().getSimpleName(),
                biggerFruitBox2.getFruit2().getClass().getSimpleName());

    }

    private static void generic_3() {
        FruitBox<Apple> appleFruitBox = new FruitBox<>(new Apple());
        System.out.println(appleFruitBox.getFruit().getClass().getSimpleName());

        Apple newApple = new Apple();
        appleFruitBox.setFruit(newApple);
        System.out.println(appleFruitBox.getFruit().getClass().getSimpleName());

        //appleFruitBox.setFruit(new Orange())/  NIEZGODNE TYPY

        FruitBox<Orange> orangeFruitBox = new FruitBox<>(new Orange());
        System.out.println(orangeFruitBox.getFruit().getClass().getSimpleName());

        FruitBox<String> stringFruitBox = new FruitBox<>("aaa");
        System.out.println(stringFruitBox.getFruit().getClass().getSimpleName());

    }

    private static void simple_2() {
        SimpleFruitBox simpleFruitBox = new SimpleFruitBox(new Orange());

        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());
        simpleFruitBox.setFruit(new Apple());
        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());
        simpleFruitBox.setFruit(new String());
        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());

        simpleFruitBox.setFruit("ADFV");
        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());

    }

    private static void without_1() {

        //DUPLIKACJA
        //KAZDY TYP MA SWOJ KOSZYK BOX
        AppleBox apple = new AppleBox(new Apple());
        OrangeBox orange = new OrangeBox(new Orange());
    }
}
