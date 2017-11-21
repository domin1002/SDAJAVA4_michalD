import java.util.HashMap;
import java.util.Map;

class Scrabble {
    private String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int score = 0;
        Map<String, Integer> wartosci = new HashMap<>();
        wartosci.put("A", 1);
        wartosci.put("E", 1);
        wartosci.put("I", 1);
        wartosci.put("O", 1);
        wartosci.put("U", 1);
        wartosci.put("L", 1);
        wartosci.put("N", 1);
        wartosci.put("R", 1);
        wartosci.put("S", 1);
        wartosci.put("T", 1);
        wartosci.put("D", 2);
        wartosci.put("G", 2);
        wartosci.put("B", 3);
        wartosci.put("C", 3);
        wartosci.put("M", 3);
        wartosci.put("P", 3);
        wartosci.put("F", 4);
        wartosci.put("H", 4);
        wartosci.put("V", 4);
        wartosci.put("W", 4);
        wartosci.put("Y", 4);
        wartosci.put("K", 5);
        wartosci.put("J", 8);
        wartosci.put("X", 8);
        wartosci.put("Q", 10);
        wartosci.put("Z", 10);


        String[] strArr = word.split("");
        for(String s : strArr) {
            s = s.toUpperCase();
            if(wartosci.containsKey(s)) {
                score += wartosci.get(s);
            }
        }
        return score;
    }

}
