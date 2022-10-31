package week9;
/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/

import java.util.HashMap;
import java.util.Map;

public class Programme9 {
    public static void main(String[] args) {
        Programme9 obj = new Programme9();
        obj.mapHashMap();
    }

    public void mapHashMap() {
        //
        HashMap<Integer, String> people = new HashMap<>();
        people.put(1, "Piccadilly");
        people.put(2, "HammerSmith & City");
        people.put(3, "District");
        people.put(4, "Circle");
        people.put(5, "Jubily");

        for (Map.Entry<Integer, String> undergroundLine : people.entrySet()) {
            System.out.println(undergroundLine);
        }

    }

}
