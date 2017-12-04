package pl.sda.testowanie;

public enum Plant {
    VIOLETS,
    RADISHES,
    CLOVER,
    GRASS;

    public static Plant getPlant(char plantCode) {
        switch (plantCode) {
            case 'G':
                return GRASS;
            case 'C':
                return CLOVER;
            case 'R':
                return RADISHES;
            case 'V':
                return VIOLETS;
        }

        return null;
    }
}