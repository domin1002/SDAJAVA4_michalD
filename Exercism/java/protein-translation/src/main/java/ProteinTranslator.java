import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        Set<String> set = new LinkedHashSet<>();
        int length = rnaSequence.length();
        String temp;

        for (int i = 0; i <= length - 1; i += 3) {
            temp = rnaSequence.substring(i, i + 3);

            if (temp.equals("AUG")) set.add("Methionine");
            if (temp.equals("UUU") || temp.equals("UUC")) set.add("Phenylalanine");
            if (temp.equals("UUA") || temp.equals("UUG")) set.add("Leucine");
            if (temp.equals("UCU") || temp.equals("UCC") || temp.equals("UCA") || temp.equals("UCG")) set.add("Serine");
            if (temp.equals("UAU") || temp.equals("UAC")) set.add("Tyrosine");
            if (temp.equals("UGU") || temp.equals("UGC")) set.add("Cysteine");
            if (temp.equals("UGG")) set.add("Tryptophan");
            if (temp.equals("UAA") || temp.equals("UAG") || temp.equals("UGA")) break;
        }
        
        return new LinkedList<>(set);
    }
}