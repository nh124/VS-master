import java.util.*;
public class Recursion {
    public static void main(String[] args) {
       System.out.println(factorial(6));
       System.out.print(Fibonaccis(7));
        ArrayList<Integer> numbs = new ArrayList<Integer>();
        numbs.add(1);
        numbs.add(3);
        numbs.add(5);
        numbs.add(7);
        numbs.add(9);
        for(int num: numbs){
            System.out.println("------------");
            System.out.println(factorial(num));
            System.out.println(Fibonaccis(num));
            System.out.println("------------");

        }
    }
    public static int factorial(int x){
        if(x > 0){
            int result = x*factorial(x-1);
            return result;
        }else{
            return 1;
        }

    }
    public static String Fibonaccis(int x){
        String all = "";
        int fib1 = 0;
        int fib2 = 1;
        if(x == 1){
           return 0 + " ";
        }else if(x == 2){
            return 0 + " " + 1;
        }else {
            all += fib1 + " " + fib2 + " ";
            for(int i = 3; i <= x; i++ ) {
                int sum = fib1 + fib2;
                all += sum + " ";
                fib1 = fib2; // switch the numbs and sum for the next element
                fib2 = sum;
            }
            return all + "\n";
        }
    }
}
