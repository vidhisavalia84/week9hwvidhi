package week9;
/*Write a Java program to iterate through all elements in an array list using
        Iterator.*/

import java.util.ArrayList;

public class Programme5 {
    public static void main(String[] args) {
//object creation
        Programme5 obj = new Programme5();
        obj.Array1();

    }

    public void Array1() {
        ArrayList<Integer> number = new ArrayList();
        number.add(101);
        number.add(102);
        number.add(103);
        number.add(104);
        number.add(105);
        number.add(106);
        int i = 0;
        do {
            System.out.println(number.get(i));
            i++;
        } while (i < number.size());

    }
}
