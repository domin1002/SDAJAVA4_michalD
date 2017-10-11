package Shape;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){}

    public Circle(double r){
        this.radius = r;
    }

    public Circle(double r, String s){
        this.radius = r;
        this.color = s;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String s){
        this.color = s;
    }

    public double getArea(){
        return 3.14*(getRadius()*getRadius());
    }

    public String toString(){
        return "Circle [radius="+getRadius()+", color="+getColor();
    }
}
