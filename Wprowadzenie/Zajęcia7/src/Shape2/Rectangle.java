package Shape2;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){}



    public Rectangle(double w, double l){
        this.width = w;
        this.length = l;
    }

    public Rectangle(double w, double l, String c, boolean f){
        super(c, f);
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w){
        this.width = w;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double l){
        this.length = l;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (2*length)+(2*width);
    }

    @Override
    public String toString() {
        return "Pole prostokąta to: "+getArea()+", obwód prostokąta to:"+getPerimeter();
    }
}
