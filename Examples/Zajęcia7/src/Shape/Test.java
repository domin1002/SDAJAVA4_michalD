package Shape;

public class Test {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(2);
        cylinder.setHeight(2);
        cylinder.setColor("Purple");

        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
