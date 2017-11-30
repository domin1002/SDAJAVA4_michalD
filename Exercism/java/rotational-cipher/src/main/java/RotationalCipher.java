import java.util.Collections;
import java.util.stream.Collectors;

class RotationalCipher {

    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        return data.chars().mapToObj(ch -> {
            if (Character.isLowerCase(ch))
                return (ch + shiftKey > 'z') ? (char) (ch - 26 + shiftKey) : (char) (ch + shiftKey);
            else if (Character.isUpperCase(ch))
                return (ch + shiftKey > 'Z') ? (char) (ch - 26 + shiftKey) : (char) (ch + shiftKey);
            else return (char)ch;
        }).map(ch->ch.toString()).collect(Collectors.joining());
    }

}
