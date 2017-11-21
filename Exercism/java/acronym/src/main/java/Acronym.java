class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] str = phrase.split("[\\W+]");
        StringBuilder acronym = new StringBuilder();
        for (String s : str) {
            if (!s.isEmpty()) {
                acronym.append(s.substring(0, 1));
            }
        }
        return acronym.toString().toUpperCase();
    }

}
