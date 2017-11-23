class Triangle {
    private double a;
    private double b;
    private double c;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            this.a = side1;
            this.b = side2;
            this.c = side3;
        } else {
            throw new TriangleException();
        }
    }

    boolean isEquilateral() {
        if (a == b && b == c) return true;
        else return false;
    }

    boolean isIsosceles() {
        if (a == b || a == c || b == c) return true;
        else return false;
    }

    boolean isScalene() {
        if (a != b && b != c && a != c) return true;
        else return false;
    }

}
