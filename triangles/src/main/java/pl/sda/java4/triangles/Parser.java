package pl.sda.java4.triangles;

public class Parser {

    public int[] parseTriple(String s) {

        if (s == null) throw new IllegalArgumentException("Dont give me null");


        String[] strArray = s.trim().split("\\s+");

        if (strArray.length != 3)
            throw new IllegalArgumentException("Must have 3 numbers");

        int[] wyniki = new int[strArray.length];

        try {
            for (int i = 0; i < strArray.length; i++) {
                wyniki[i] = Integer.parseInt(strArray[i]);
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }

        return wyniki;
    }
}
