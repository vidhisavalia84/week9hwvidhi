package week9;

//Write a Java program to reverse an array of integer values.
public class Programme3ReverseArray {
    public static void main(String[] args) {
        Programme3ReverseArray obj=new Programme3ReverseArray();
        obj.reverseArray();
    }

    public void reverseArray() {

        int array1[] = {10, 20, 30, 40, 50, 60};//Array declaration with value
        System.out.println("Before reverse an integer value of Array");
        for (int i = 0; i < array1.length; i++) {

            System.out.println(array1[i]);
        }
        System.out.println("After reverse an intger values of Array");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.println(array1[i]);
        }

    }

}