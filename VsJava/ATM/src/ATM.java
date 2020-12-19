// import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {

    static double balance;
    static double newBalance;
    public static void main(String[] args)
    {
        accountType();;
    }

    public static void accountType()
    {
        Scanner type = new Scanner(System.in);
        System.out.println("1. Checking account");
        System.out.println("2. Saving account");
        int input = type.nextInt();
        if(input == 1)
        {
            System.out.println("checking account!");
            menu();
        }else if(input == 2)
        {
            System.out.println("Saving account");
            menu();
        }
    }
    public static void menu()
    {
        System.out.println("1. View Balance");
        System.out.println("2. deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        Scanner menu = new Scanner(System.in);

        int menuInput = menu.nextInt();
        if(menuInput == 1)
        {
            System.out.println("You current balance is:\t" + "$" + balance);
            menu();
        }else if(menuInput == 2)
        {
            Scanner deposit = new Scanner(System.in);
            System.out.println("Please input how much you would like to deposit");
            double depositAmount = deposit.nextInt();
            balance = depositAmount;
            System.out.println("you new balance is\t" + "$" + balance);
            menu();
        }else if(menuInput == 3)
        {
            withdraw();
            menu();
        }
        else if(menuInput == 4)
        {
            System.out.println("Goodbye!!");
        }else{
            System.out.println("Wrong input!");
            menu();
        }
    }
    public static void withdraw()
    {
        Scanner withdraw = new Scanner(System.in);
        System.out.println("Please input how much you would like to withdraw");
        double withdrawAmount = withdraw.nextInt();
        if(balance == 0 && withdrawAmount > balance && newBalance > 0)
        {
            System.out.println("The amount that you entered is insufficient"); // add a another scanner method so that they can go back to the previous menu
            withdraw();
//            System.out.println("Or type back to return to the previous menu or type cancel to return the current menu");
//            Scanner back = new Scanner(System.in);
//            String goBack = back.nextLine();
//            if(goBack == "back")
//            {
//                menu();
//            }else if(goBack == "cancel")
//            {
//                withdraw();
//            }else{
//                System.out.println("wrong input!");
//                menu();
//            }
        }else{
            newBalance = balance - withdrawAmount;
            balance = newBalance;
        }
        System.out.println("You new balance is\t" + "$" + balance);
    }
}
