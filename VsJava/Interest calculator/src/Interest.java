import java.util.Scanner;

public class Interest {
    static int initialAmount;
    static double interestRateInput;
    static int n;
    static int years;
    public static void main(String[] args){
        numb();
        calculations();
    }
    public static void numb()
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input the initial amount: ");
        initialAmount = console.nextInt();
        System.out.println("Please input the interest rate: ");
        interestRateInput = console.nextInt();
        System.out.println("How many times will it be compounded? ");
        n = console.nextInt();
        System.out.println("Please input the number of years: ");
        years = console.nextInt();

    }
    public static void calculations(){


        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Interest table");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Initial Amount\t" + "Interest Rate\t" + "compounds\t" + "years\t " + "Final Amount\t");
        for(int i = 1; i <= years; i++){
            double interestRate = interestRateInput/100;
            //double firstPart =
            //int power = n*i;
            double a = initialAmount * Math.pow((1 + (interestRate/n)), (n*i));
            System.out.println(initialAmount + "\t" + "\t" + "\t" + "\t" + interestRate + "\t" + "\t" + "\t"  + "\t" + n  + "\t" + "\t" + "\t" + i + "\t "  + (String.format("%.2f", a)));
        }

    }
}
