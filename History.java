import java.util.ArrayList;

public class History
{
    private ArrayList<String> entries;

    public History() {
        entries = new ArrayList<String>();
    }

    public void add(String entry) {
        entries.add(entry);
    }

    public void show() {
        if (entries.isEmpty()) {
            System.out.println("No calculations yet.");
            return;
        }
        System.out.println("--- History ---");
        for (String e : entries) {
            System.out.println(e);
        }
    }

    public void clear() {
        entries.clear();
        System.out.println("History cleared.");
    }
}