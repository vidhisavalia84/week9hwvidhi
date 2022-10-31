package week9;
//Re write the student mark sheet programme using if else and while loop.
import java.util.Scanner;

public class Programme2MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter student name :\t\t");
        String name = scanner.nextLine();
        System.out.println("\n Enter student rollNo :\t\t");
        int rollNo = scanner.nextInt();
        System.out.println("Enter the marks of subject Maths\t:\t ");
        int mathMarks = scanner.nextInt();
        while (mathMarks < 0 || mathMarks > 100)
        {
            System.out.println("\n Invalid input, marks should be between 0 to 100 ");
            System.out.println("Please enter correct marks:");
            mathMarks = scanner.nextInt();
        }
        System.out.println("Enter the marks of subject Science\t:\t ");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100)
        {
            System.out.println("\n Invalid input, marks should be between 0 to 100 ");
            System.out.println("Please enter correct marks:");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter the marks of subject english\t:\t ");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100)
        {
            System.out.println("\n Invalid input, marks should be between 0 to 100 ");
            System.out.println("Please enter correct marks:");
            englishMarks = scanner.nextInt();
        }
        int total=sum(mathMarks,scienceMarks,englishMarks);
        int percentage=(total*100)/300;
        String result=calculateResult(mathMarks,scienceMarks,englishMarks);
        String grade=calculateGrade(percentage,result);
        printTheMarkSheet(name,rollNo,mathMarks,scienceMarks,englishMarks,total,percentage,result,grade);
        scanner.close();//closing scanner


    }
    public static int sum(int a, int b,int c)
    {
        return a+b+c;
    }
    //calculating result pass/fail
    public static String calculateResult(int mathmarks,int sciencemarks,int englishmarks)
    {
        while (mathmarks<35||sciencemarks<35||englishmarks<35){
            return "Fail";
        }
        return "Pass";
    }

    public static String calculateGrade(int percentage,String result){
        String grade=null;
        //calculating percentage
        if(result.equalsIgnoreCase("Pass")){
            if(percentage>80){
                grade="+A";

            } else if (percentage>=60) {
                grade="A";
            } else if (percentage>=50) {
                grade="B";
            } else if (percentage>=35) {
                grade="C";
            }else {
                grade="_";
            }
        }return grade;

    }
    public static void printTheMarkSheet(String name,int rollno,int mathsMarks,int scienceMarks,int englishMarks,double totle
            ,double percentage,String result,String grade) {
        System.out.println("______________________________________");
        System.out.println("|                                    |");
        System.out.println("|      Mark Sheet                    |");
        System.out.println("|____________________________________|");
        System.out.println("|  Name:" + name + "                              |");
        System.out.println("|  Roll No" + rollno + "                         |");
        System.out.println("|____________________________________|");
        System.out.println("|  Math:" + mathsMarks + "                           |");
        System.out.println("|  Science: " + scienceMarks + "                         |");
        System.out.println("|  English: " + englishMarks + "                         |");
        System.out.println("|____________________________________|");
        System.out.println("|  Total: " + totle + "                      |");
        System.out.println("|____________________________________|");
        System.out.println("|  Percentage:" + percentage + "                   |");
        System.out.println("|  Result: " + result + "                      |");
        System.out.println("|  Grade: " + grade + "                         |");
        System.out.println("|____________________________________|");

    }












}
