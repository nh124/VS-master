import java.util.Random;
import java.util.Scanner;

public class email {
    static String firstName;
    static String lastName;
    static String department;
    static String company;
    private static String password;

    public email(String firstName, String lastName, String department, String company)
    {
     email.firstName = firstName;
     email.lastName = lastName;
     email.department = department;
     email.company = company;

    }
    public static void emailApp()
    {
        Scanner info = new Scanner(System.in);
        System.out.println("please input you first and last name with the company and department you wok for. If a certain criteria does not apply to you please leave it empty");
        firstName = info.nextLine();
        lastName = info.nextLine();
        department = info.nextLine();
        company = info.nextLine();

        System.out.println("Your email for you position is " + firstName + "." + lastName + "@" + department + "." + company + ".com");
    }
    private static void pass()
    {
        Scanner pass = new Scanner(System.in);
        System.out.println("Input a password length to be randomly generated");
        int passLength = pass.nextInt();
        String letters = "ABCDEFGHIKJKLMNOPQRSTUVWXYZ";

        Random rand = new Random();
        char[] word = new char[passLength];
        password = "";

        for(int i = 0; i < passLength; i++){
            word[i] = letters.charAt(rand.nextInt(letters.length()));
        }
        for(int i = 0; i < word.length; i++ ){
            password += word[i];
        }
        System.out.println("This is your random password\t" + password);

        Scanner passChange = new Scanner(System.in);
        System.out.println("Would you like to change you password?");
        String confirm = passChange.nextLine();
        if(confirm == "yes")
        {
            getNewPassWord();
        }
    }
    private static void getNewPassWord()
    {
        System.out.println("Please input you new password: ");
        Scanner change = new Scanner(System.in);
        String newPass = change.nextLine();
        password = newPass;
        System.out.println("Your new password is: " + password);
    }
    public String toString()
    {
        emailApp();
        pass();
        getNewPassWord();
        return lastName + "," + firstName + "\n" + "Your email for you position is " + firstName + "." + lastName + "@" + department + "." + company + ".com";
    }
}
