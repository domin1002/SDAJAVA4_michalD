import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ParallelLetterFrequency {
    private Lock lock1 = new ReentrantLock();
    private String input;

    public ParallelLetterFrequency(String input) {
        this.input = input;
    }

    public Map<Integer, Integer> letterCounts() {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {

            char ch = Character.toLowerCase(input.charAt(i));
            if (Character.isLetter(ch)) {
                if (map.containsKey((int) ch)) {
                    lock1.lock();
                    map.put((int) ch, map.get((int) ch) + 1);
                    lock1.unlock();
                } else {
                    lock1.lock();
                    map.put((int) ch, 1);
                    lock1.unlock();
                }
            } else
                continue;
        }
        return map;
    }
}
