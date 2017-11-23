import java.util.Objects;

class LuhnValidator {

    boolean isValid(String candidate) {
        StringBuilder strb = new StringBuilder(candidate.replaceAll(" ", "").trim());
        if (strb.length() <= 1) return false;
        int[] tab = new int[strb.length()];
        int sum = 0;
        int index = 0;

        for (int i = 0; i <= candidate.length(); i++) {
            if (strb.substring(index, index + 1).matches("[^0-9]")) return false;
            tab[i] = Integer.parseInt(strb.substring(index, index + 1));
            if (index == strb.length() - 1) break;
            index++;
        }

        for (int i = tab.length - 2; i >= 0; i -= 2) {
            tab[i] = tab[i] * 2;
            if (tab[i] > 9) tab[i] -= 9;
        }

        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }

        if (sum % 10 == 0) return true;
        else return false;
    }

}
