import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Orange");
        arrayList.add("Red");
        arrayList.add("Black");
        arrayList.add("Blue");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
