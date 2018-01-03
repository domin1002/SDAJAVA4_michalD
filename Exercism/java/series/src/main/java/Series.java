import java.util.ArrayList;
import java.util.List;

public class Series {
    private List<Integer> list = new ArrayList<>();

    public Series(String series) {
        series.chars().mapToObj(i -> Character.getNumericValue(i)).forEach(i -> list.add(i));
    }

    public List<Integer> getDigits() {
        return list;
    }

    public List<List<Integer>> slices(int value) {
        if (value > list.size())
            throw new IllegalArgumentException();

        List<List<Integer>> secList = new ArrayList<>();

        for (int i = 0; i <= list.size() - value; i++) {
            secList.add(list.subList(i, i + value));
        }
        return secList;
    }
}
