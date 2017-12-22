import java.util.regex.Pattern;

public class RunLengthEncoding {
    public String encode(String s) {
        if (s.length() < 1) return s;
        StringBuilder sb = new StringBuilder();
        char znak = s.charAt(0);
        int ilosc = 0;

        //AABBBCCCC
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == znak) ilosc++;
            else {
                if (ilosc > 1) sb.append(ilosc);
                sb.append(znak);
                znak = s.charAt(i);
                ilosc = 1;
            }
        }
        if (ilosc > 1) sb.append(ilosc);
        sb.append(znak);

        return sb.toString();
    }

    public String decode(String s) {
        if (!Pattern.compile("[0-9]").matcher(s).find()) return s;
        StringBuilder sb = new StringBuilder();
        StringBuilder ilosc = new StringBuilder("0");
        char znak;

        for (int i = 0; i < s.length(); i++) {
            if (Pattern.compile("[0-9]").matcher(String.valueOf(s.charAt(i))).find()) {
                ilosc.append(s.charAt(i));
            } else if (Pattern.compile("[A-Za-z\\s]").matcher(String.valueOf(s.charAt(i))).find()) {
                znak = s.charAt(i);
                int r = Integer.parseInt(ilosc.toString());
                if (r == 0) r++;

                for (int j = 0; j < r; j++) {
                    sb.append(znak);
                }
                ilosc = new StringBuilder("0");
            }
        }
        return sb.toString();
    }
}
