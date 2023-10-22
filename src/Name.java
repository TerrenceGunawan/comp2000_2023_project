import java.util.ArrayList;

public class Name implements Searching {
    @Override
    public ArrayList<ItemInterface> find(ArrayList<ItemInterface> items, String searchTerm) {
        String term = searchTerm.toLowerCase();
        ArrayList<ItemInterface> result = new ArrayList<>();

        for (ItemInterface item : items) {
            if (item.getName().contains(term)) {
                result.add(item);
            }
        }

        return result;
    }
}
