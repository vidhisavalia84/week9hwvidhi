package week9;

import java.util.ArrayList;

/*Write a Java program to retrieve an element (at a specified index) from a given
        array list*/
public class Programme6 {
    public static void main(String [] args){

        ArrayList<String> animal=new ArrayList<>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Cow");
        animal.add("Sheep");
        animal.add("Horse");

        for(int i=0;i<animal.size();i++){
            System.out.println(animal.get(i));
        }
        System.out.print("Element stored at 4th index is: ");
        System.out.println(animal.get(4));



    }
}
