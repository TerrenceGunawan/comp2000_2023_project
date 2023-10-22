import java.util.ArrayList;

public class Description implements Searching{
    @Override
    public ArrayList<ItemInterface> find(ArrayList<ItemInterface> items, String searchTerm) {
        String term = searchTerm.toLowerCase();
        ArrayList<ItemInterface> result = new ArrayList<>();

        for (ItemInterface item : items) {
            if (item.getDescription().contains(term)) {
                result.add(item);
            }
        }

        return result;
    } 
}
