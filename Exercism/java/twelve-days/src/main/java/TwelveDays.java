import java.util.HashMap;
import java.util.Map;


class TwelveDays {
    String verse(int verseNumber) {
        StringBuilder str = new StringBuilder("On the first day of Christmas my true love gave to me,");
        StringBuilder str2 = new StringBuilder("a Partridge in a Pear Tree.\n");

        if (verseNumber == 1)
            return str.append(" " + str2).toString();
        else {
            Map<Integer, String> map = new HashMap<>();
            map.put(2, "second");
            map.put(3, "third");
            map.put(4, "fourth");
            map.put(5, "fifth");
            map.put(6, "sixth");
            map.put(7, "seventh");
            map.put(8, "eighth");
            map.put(9, "ninth");
            map.put(10, "tenth");
            map.put(11, "eleventh");
            map.put(12, "twelfth");

            String s = " twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves";
            String[] tab = s.split(",");

            for (int i = tab.length - verseNumber + 1; i < tab.length; i++) {
                str.append(tab[i] + ",");
            }
            return str.append(" and " + str2).toString().replace("first", map.get(verseNumber));
        }
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder str = new StringBuilder();

        for (int i = startVerse; i <= endVerse; i++) {
            if (i == endVerse) {
                str.append(verse(i));
            } else
                str.append(verse(i) + "\n");
        }
        return str.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}
