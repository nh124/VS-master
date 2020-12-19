import java.util.Arrays;
import java.util.Scanner;

public class digit {
    static int [] value;
    static int num;
    static int power;
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Inout the number that is being powered: ");
        num = c.nextInt();
        System.out.println("input the power value: ");
        power = c.nextInt();
        System.out.println(powerSum(num,power));
    }
    public static int powerSum(int num, int power)
    {
        value = new int[5];
        double x = Math.pow(num, power);
        //return (int)x;

        for(int i = 0; i < value.length; i++)
        {
            double r = x % 10; // 8
            x = x / 10;
            value[i] = (int)r;
        }
        //return value;
        int digit = 0;
        for(int i = 0; i < value.length; i++)
        {
            System.out.print(digit + " + ");
            digit += value[i];

        }
        System.out.println();
        return digit;
    }


}

