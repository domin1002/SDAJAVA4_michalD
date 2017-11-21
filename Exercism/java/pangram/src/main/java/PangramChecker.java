import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        if(input == null) return false;
        input = input.toLowerCase().replaceAll("[^a-z]", "");

        Set<Character> characters = new HashSet<>();

        for (int i=0; i<input.length(); i++) {
            characters.add(input.toLowerCase().charAt(i));
        }

        if(characters.size() == 26) return true;
        else return false;
    }

}
