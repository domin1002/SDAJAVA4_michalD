package pl.sda.java4.triangles;

public class Triangility {

    public static boolean isTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && (long) a + b > c && (long) a + c > b && (long) b + c > a;
    }
}
