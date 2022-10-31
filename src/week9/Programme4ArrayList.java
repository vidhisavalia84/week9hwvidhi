package week9;

import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/
public class Programme4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList();
        colour.add("Red");
        colour.add("Blue");
        colour.add("Yellow");
        colour.add("Pink");
        colour.add("Black");
        colour.add("Whote");

        for (String name : colour) {
            System.out.println(name);
        }


    }
}
