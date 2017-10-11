package Shape2;

public class Circle extends Shape{
    private double radius;

    public Circle(){}

    public Circle(double r){
        this.radius = r;
    }
    public Circle(double r, String c, boolean f){
        super(c, f);
        this.radius = r;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI*(getRadius()*getRadius());
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Pole koła to: "+getArea()+", obwód wynosi: "+getPerimeter();
    }

}
