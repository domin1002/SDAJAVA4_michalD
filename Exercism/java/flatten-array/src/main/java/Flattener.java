import java.util.ArrayList;
import java.util.List;

public class Flattener {
    public <T> List<T> flatten(List<T> listOfList) {
        List<T> lista = new ArrayList<>();

        for (T element : listOfList) {
            if (element == null) continue;
            if (element instanceof List) {
                lista.addAll(flatten((List<T>) element));
            } else {
                lista.add(element);
            }
        }
        return lista;
    }
}
