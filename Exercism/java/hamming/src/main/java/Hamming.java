public class Hamming {
    private String leftString;
    private String rightString;

    Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        this.leftString = leftStrand;
        this.rightString = rightStrand;
    }

    int getHammingDistance() {
        int distance = 0;
        for (int i=0; i<leftString.length(); i++){
            if(leftString.charAt(i) != rightString.charAt(i)){
                distance++;
            }
        }
        return distance;
    }

}
