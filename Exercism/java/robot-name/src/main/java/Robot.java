import java.util.Random;

public class Robot {
    private StringBuilder name = new StringBuilder();
    private Random rnd = new Random();

    public String getName() {
        char randChar;
        for (int i = 0; i < 2; i++) {
            randChar = (char) (rnd.nextInt(26) + 'A');
            name.append(randChar);
        }
        for (int i = 0; i < 3; i++) {
            name.append(rnd.nextInt(10));
        }
        return name.toString();
    }

    public void reset() {
        name = new StringBuilder();
    }
}
