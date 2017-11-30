package generyki.generic_methods_6;

import generyki.generic_extends_5.Circle;
import generyki.generic_extends_5.Rectangle;
import generyki.generic_extends_5.ShapeBox;

public class VoidMethods {
    public static void method1(ShapeBox<Circle> box) {
        System.out.println("Inside1: "+box.getName());
    }


    //znak zapytania mówi nam że damy obiekt z czymś w śodku ale na raziew jescze nie wiemy z czym
    public static void method2(ShapeBox<?> box) {
        System.out.println("Inside: "+box.getShape().getName());
    }

    public static void method3(ShapeBox<? extends Rectangle> box) {

    }
}
