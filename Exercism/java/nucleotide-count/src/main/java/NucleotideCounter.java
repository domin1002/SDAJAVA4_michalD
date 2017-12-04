import java.util.HashMap;
import java.util.Map;

public class NucleotideCounter {
    private String nucleotideString;

    public NucleotideCounter(String str) {
        this.nucleotideString = str;
    }

    public int count(char nucleotide) {
        if (nucleotide != 'A' && nucleotide != 'C' && nucleotide != 'G' && nucleotide != 'T')
            throw new IllegalArgumentException();

        int number = 0;
        for (int i = 0; i < nucleotideString.length(); i++) {
            if (nucleotideString.charAt(i) == nucleotide) number++;
        }
        return number;
    }

    public Map<Character, Integer> nucleotideCounts() {
        Map<Character, Integer> nucleotidesMap = new HashMap<>();
        nucleotidesMap.put('A', 0);
        nucleotidesMap.put('C', 0);
        nucleotidesMap.put('G', 0);
        nucleotidesMap.put('T', 0);

        for (int i = 0; i < nucleotideString.length(); i++) {
            nucleotidesMap.computeIfPresent(nucleotideString.charAt(i), (k, v) -> v + 1);
        }
        return nucleotidesMap;
    }
}
