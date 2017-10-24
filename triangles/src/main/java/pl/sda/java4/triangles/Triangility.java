package pl.sda.java4.triangles;

public class Triangility {

    public static boolean isTriangle(int x, int y, int z) {
        return(x + y) > z && (x + z) > y && (z + y) > x;
    }
}
