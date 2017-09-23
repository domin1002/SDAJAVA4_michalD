package Shape2;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(){}

    public Shape(String c, boolean f){
        this.color = c;
        this.filled = f;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean f){
        this.filled = f;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}
