import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class WordCount {

    public Map<String, Integer> phrase(String phrase) {
        String text = phrase.replaceAll("[^A-Za-z0-9\\s]", "");
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] tab = text.split("\\s+");

        for (String s : tab) {
            if (wordCountMap.containsKey(s.toLowerCase())) {
                wordCountMap.computeIfPresent(s.toLowerCase(), (k, v) -> v + 1);
            } else {
                wordCountMap.put(s.toLowerCase(), 1);
            }
        }
        return wordCountMap;
    }
}
