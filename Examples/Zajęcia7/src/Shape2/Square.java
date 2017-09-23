package Shape2;

public class Square extends Rectangle {
    public Square(){}

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean f){
        super(side, side, color, f);
    }

    private double getSide(){
        return getWidth();
    }

    public void setSide(double a){
        setWidth(a);
        setLength(a);
    }

    public void setWidth(double a){
        super.setWidth(a);
    }

    public void setLength(double a){
        super.setLength(a);
    }

    public String toString(){
        return "Pole kwadratu to: "+super.getArea()+", jego obwód to: "+super.getPerimeter();
    }
}
