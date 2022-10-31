package week9;

import java.util.HashSet;

/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)*/
public class Programme8 {
    public static void main(String[] args) {

        Programme8 obj = new Programme8();
        obj.hashSetStoreIntegerOrNot();

    }

    public void hashSetStoreIntegerOrNot() {
        HashSet<Integer> number = new HashSet<>();//HasSet declaration of type integer
        number.add(4);// store numbers into oblect number
        number.add(7);
        number.add(8);
        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " number is in the set");
            } else {
                System.out.println(i + " number is not in the set");
            }
        }

    }

}
