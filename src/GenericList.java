import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public void remove(T element) {
        list.remove(element);
    }

    public T find(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return null;
    }

    public int size() {
        return list.size();
    }

    public List<T> getAll() {
        return list;
    }
}

