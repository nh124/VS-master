import java.util.Scanner;
public class person1 extends Birthday{
    public static int firstSetOfInfo;
    public static int SecondSetOfInfo;
    public static int ThirdSetOfInfo;
    public static int TotalNumberOfDays;
    public static int age;
    public static int person1Compare;

    public String toString(){
        Scanner m = new Scanner(System.in);
        age =   CurrentYear - Year;
        int daysBorn = age*365;

            if(Month == 1){
                System.out.println("What date were you born in (Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 30; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of when they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date(Wrong)
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date/*date born*/ + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";
            }else if(Month == 2){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 30 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 3){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 60 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 4){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 90 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 5){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 120 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 6){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 150 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 7){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 180 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 8){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 210 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 9){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 240 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 10){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 270 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 11){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 300 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else if(Month == 12){
                System.out.println("What date were you born in(Person1)?");
                int dateBorn = m.nextInt(); // date
                SecondSetOfInfo = 330 + 29; // number of day in the month
                int days = SecondSetOfInfo- dateBorn; // month and date of where they were born
                firstSetOfInfo = days;
                int PresentNumberOfDays = CurrentMonth - CurrentDate; // current month - current date
                PresentNumberOfDays = ThirdSetOfInfo;
                int TDS = firstSetOfInfo + SecondSetOfInfo + ThirdSetOfInfo;
                TotalNumberOfDays = TDS;
                return "Your birthday is on: " + Month + "/" + Date + "/" + Year +
                        "\nYou are now" +" "+ age +" "+ "old" +
                        "\nYou have been alive for: " + TotalNumberOfDays +  " Days!";


            }else{
                return "";
            }

        }
        public static void CompareAeg(){
            int x =  TotalNumberOfDays;
            person1Compare = x;
        }

}
