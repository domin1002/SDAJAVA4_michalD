import java.util.regex.Pattern;

public class Transpose {
    public String transpose(String input) {
        StringBuilder transposeString = new StringBuilder();
        if (!Pattern.compile("\n").matcher(input).find()) {
            for (int i = 0; i < input.length(); i++) {
                if (i == input.length() - 1) transposeString.append(input.charAt(i));
                else transposeString.append(input.charAt(i) + "\n");
            }
        } else {
            String[] tab = input.split("\n");
            int index = tab[0].length();

            for (int i = 0; i < index; i++) {
                for (int j = 0; j < tab.length; j++) {
                    transposeString.append(tab[j].charAt(i));
                }
                if (i == index - 1) return transposeString.toString();
                transposeString.append("\n");
            }
        }

        return transposeString.toString();
    }
}
