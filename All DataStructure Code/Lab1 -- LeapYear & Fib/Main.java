//java
//Client class----------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
            leapYear ly = new leapYear();
            fib f = new fib();
            System.out.println("------------------------------------------");
            System.out.println("Leap Year");
            boolean check1 = true;
        do{
            System.out.println("Please enter what year it is(i.g: 2019): ");
            Scanner scan = new Scanner(System.in);
            check1 = true;
            try {
                int numb = scan.nextInt();
                System.out.println(ly.year(numb));
                System.out.println("-------------------------------------------");
            }catch(Exception e)
            {
                check1 = false;
                System.out.println("Wrong input! try again");
                System.out.println();
                System.out.println("------------------------------------------");
            }
        }while(check1 == false);
        //////////////////////////////////////////////////////////////////

        System.out.println("Fibonacci using Recursion");
        boolean check2 = true;
        do{
            Scanner scanning = new Scanner(System.in);
            System.out.println("Please input the size of the Fibonacci(i.g 10): ");
            check2 = true;
            try {
                int size1 = scanning.nextInt();
                int number = 0;
                while (number < size1) {
                System.out.print(f.fibRecursion(number) + " ");
                number++;
                }
                System.out.println();
                System.out.println("------------------------------------------");
            }catch (Exception e)
            {
                check2 = false;
                System.out.println("Wrong input!");
                System.out.println();
                System.out.println("------------------------------------------");
            }
        }while(check2 == false);

        //////////////////////////////////////////////////////////////////
        System.out.println("Fibonacci using loop");
        boolean check3 = true;
        do{
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Please input the size of the Fibonacci(i.g 10): ");
        check3 = true;

        try {
            int size2 = scan3.nextInt();
            System.out.print(f.fibLoop(size2));
            System.out.println();
            System.out.println("------------------------------------------");
        }catch(Exception e)
        {
            check3 = false;
            System.out.println("Wrong input!");
            System.out.println();
            System.out.println("------------------------------------------");
        }
        }while(check3 == false);
        ////////////////////////////////////////////////////////////////////
    }
}
