import java.util.ArrayList;

public class All implements Searching{
    @Override
    public ArrayList<ItemInterface> find(ArrayList<ItemInterface> items, String searchTerm) {
        String term = searchTerm.toLowerCase();
        ArrayList<ItemInterface> result = new ArrayList<>();

        for (ItemInterface item : items) {
            if (item.getName().contains(term)|| item.getDescription().contains(term)) {
                result.add(item);
            }
        }

        return result;
    } 
}
