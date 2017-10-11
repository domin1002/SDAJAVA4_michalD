package Shape;

public class Cylinder extends Circle{
    double height = 1.0;

    public Cylinder(){
        super();
    }

    public Cylinder(double r){
        super(r);
    }

    public Cylinder(double r, double h){
        super(r);
        this.height = h;
    }

    public Cylinder(double r, double h, String s){
        super(r, s);
        this.height = h;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        this.height = h;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
