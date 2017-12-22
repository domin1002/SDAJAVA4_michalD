import java.util.regex.Pattern;

public class Atbash {
    public String encode(String plaintext) {
        StringBuilder cipher = new StringBuilder();
        int space = 1;
        int spaceDistance = 5;
        plaintext = plaintext.replaceAll("[^\\w]+", "");

        for (int i = 0; i < plaintext.length(); i++) {
            char sign = Character.toLowerCase(Character.valueOf(plaintext.charAt(i)));
            if (sign < 'a' || sign > 'z') {
                cipher.append(sign);
            } else {
                sign = (char) ('z' - sign + 'a');
                cipher.append(sign);
            }
            if (space == spaceDistance) {
                cipher.append(" ");
                spaceDistance += 5;
            }
            space++;
        }
        return cipher.toString().trim();
    }

    public String decode(String ciphertext) {
        StringBuilder cipher = new StringBuilder();
        ciphertext = ciphertext.replaceAll("[^\\w]+", "");
        for (int i = 0; i < ciphertext.length(); i++) {
            char sign = Character.toLowerCase(Character.valueOf(ciphertext.charAt(i)));
            if (sign < 'a' || sign > 'z') {
                cipher.append(sign);
            } else {
                sign = (char) ('z' - sign + 'a');
                cipher.append(sign);
            }
        }
        return cipher.toString().trim();
    }
}
