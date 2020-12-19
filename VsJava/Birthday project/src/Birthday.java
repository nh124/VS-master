import java.util.*;
public class Birthday {
    public static int CurrentYear;
    public static int Year;
    public static int Month;
    public static int CurrentMonth;
    public static int Date;
    public static int CurrentDate;
    public static int CurrentYear2;
    public static int Year2;
    public static int Month2;
    public static int CurrentMonth2;
    public static int Date2;
    public static int CurrentDate2;


    public static String UserInput1() {
        Scanner n = new Scanner(System.in);
        System.out.println("Welcome to the birthday analyser!!!");
        System.out.println("-----------------------------------");
        // person 1
        System.out.println("What is the current year?");
        CurrentYear = n.nextInt();
        System.out.println("What is the current month?(Enter the month number)");
        CurrentMonth = n.nextInt();
        System.out.println("What is the current date?)");
        CurrentDate = n.nextInt();
        System.out.println("What year were you born?(Person1)");
        Year = n.nextInt();
        System.out.println("What month were you born?(Enter the month number)(Person1)");
        Month = n.nextInt();
        return "";
    }

        public static String userInput2() {
        Scanner n = new Scanner(System.in);
        System.out.println("What year were you born?(Person2)");
        Year2 =n.nextInt();
        System.out.println("What month were you born?(Enter the month number)(Person2)");
        Month2 =n.nextInt();

        return "";
    }



    public String toString(){
        return UserInput1() + "\n" + userInput2();
    }


}
