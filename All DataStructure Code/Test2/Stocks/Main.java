/*----------Question 4------------------------*/
import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    shareCalculation sc = new shareCalculation();
    System.out.println("How many days of transaction do you have: ");
    int days = scan.nextInt();
    sc.calculation(days);
  }
}