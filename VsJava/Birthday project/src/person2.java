import java.util.Scanner;

public class person2 extends Birthday {
    public static int firstSetOfInfo;
    public static int SecondSetOfInfo;
    public static int ThirdSetOfInfo;
    public static int TotalNumberOfDays;
    public static int age;
    public static int person2Compare;


    public static void person2(){

        age =   CurrentYear2 - Year2;
        int daysBorn = age*365;
        Scanner m = new Scanner(System.in);
        if(Month2 == 1){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m1 = 30;
            m1 = SecondSetOfInfo;
            int days = m1- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m1 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;
        }else if(Month2 == 2){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m2 = 30 + 29;
            m2 = SecondSetOfInfo;
            int days = m2- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m2 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 3){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m3 = 60 + 29;
            m3 = SecondSetOfInfo;
            int days = m3- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m3 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 4){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m4 = 90 + 29;
            m4 = SecondSetOfInfo;
            int days = m4- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m4 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 5){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m5 = 120 + 29;
            m5 = SecondSetOfInfo;
            int days = m5- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m5 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 6){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m6 = 150 + 29;
            m6 = SecondSetOfInfo;
            int days = m6- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m6 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 7){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m7 = 180 + 29;
            m7 = SecondSetOfInfo;
            int days = m7- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m7 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 8){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m8 = 210 + 29;
            m8 = SecondSetOfInfo;
            int days = m8- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m8 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 9){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m9 = 240 + 29;
            m9 = SecondSetOfInfo;
            int days = m9- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m9 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 10){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m10 = 270 + 29;
            m10 = SecondSetOfInfo;
            int days = m10- dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m10 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 11){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m11 = 300 + 29;
            m11 = SecondSetOfInfo;
            int days = m11 - dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m11 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }else if(Month2 == 12){
            System.out.println("What date were you born in(Person2)?");
            int dateBorn = m.nextInt();
            int m12 = 330 + 29;
            m12 = SecondSetOfInfo;
            int days = m12 - dateBorn;
            firstSetOfInfo = days;
            int PresentNumberOfDays = m12 - CurrentDate2;
            PresentNumberOfDays = ThirdSetOfInfo;

        }
        int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
        TotalNumberOfDays = TDS;


    }
    public String toString(){
        return "Your birthday is on: " + Month2 + "/" + Date2 + "/" + Year2 +
                "\nYou are now" +" "+ age +" "+ "old" +
                "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";
    }
    public static void CompareAeg(){
        int x =  TotalNumberOfDays;
        person2Compare = x;
    }
}
