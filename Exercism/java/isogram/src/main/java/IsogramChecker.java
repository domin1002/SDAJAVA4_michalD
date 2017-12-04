class IsogramChecker {

    boolean isIsogram(String phrase) {
        String str = phrase.replaceAll("[\\s\\-]", "").toLowerCase().trim();
        char temp;

        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (temp == str.charAt(j)) return false;
            }
        }
        return true;
    }

}
