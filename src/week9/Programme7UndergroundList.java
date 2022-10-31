package week9;
/*Write a Java program to test an array list is empty or not. Define array list with
underground tube names*/
import java.util.ArrayList;

public class Programme7UndergroundList {
    public static void main(String[] args){
Programme7UndergroundList obj=new Programme7UndergroundList();
obj.underGroundList();
    }
    public void underGroundList(){
        //string type Arraylist declaration
        ArrayList<String> underGroundList=new ArrayList<>();
        underGroundList.add("Bakerloo ");
        underGroundList.add("Piccadilly ");
        underGroundList.add("Northen");
        underGroundList.add("Metropollitan");
        underGroundList.add("Jubily");
        for(String list:underGroundList){
            System.out.println(list);
        }
            System.out.println("is underground list empty? "+underGroundList.isEmpty());

    }


}
