/*
Write a program that takes as input a sequence of transactions of
the form buy x share(s) at ¨ $y each¨or ¨sell x share(s) at $y each,¨assuming that the transactions occur on
consecutive days and the values x and y are integers. Given this input sequence, the output should be
the total capital gain (or loss) for the entire sequence, using the FIFO protocol to identify shares.

*/
import java.util.Scanner;
public class shareCalculation{
Scanner scan = new Scanner(System.in);
QueueImp<Double> queue = new QueueImp<>();
double bought;
double sold;
int week = 0;

public void calculation(int numbOfDAys){
  int weekCounter = 1;
    for(int i = 1; i <= numbOfDAys; i++){ // this calculation will be done with n days // O(n)
      System.out.println("-------Day " + i + " -----------------------------------"); //O(n)

      System.out.println("Please select from the following: "); //O(n) 
      System.out.println("1. Buy "); //O(n)
      System.out.println("2. sell "); //O(n)
      
      int choice = scan.nextInt(); //O(n)

      if(choice == 1){ //O(n)
        System.out.println("Please enter the price share"); //O(n)
        int pricePerShare = scan.nextInt(); //O(n)
        System.out.println("Please input how many share you would like to purchase"); //O(n)
        int numberOfPurchases = scan.nextInt(); //O(n)
        bought = numberOfPurchases*pricePerShare; //O(n)
        queue.enqueue(bought); //O(n)
        /*-------------------------------------------*/
        week++; //O(n)
        if(week % 7 == 0){ //O(n)
          System.out.println("------ Week" + weekCounter + "complete " + "--------------------"); //O(n)
          System.out.println("-------------------------------------------"); //O(n)
          weekCounter++; //O(n)
        }
        System.out.println(" | Day " + i + " Number of purchases: " + numberOfPurchases + " price: " + pricePerShare + " |"); //O(n)
      }else if(choice == 2){
        System.out.println("Please enter the price share"); //O(n)
        int pricePerShare = scan.nextInt(); //O(n)
        System.out.println("Please input how many share you would like to sell"); //O(n)
        int numberOfSales = scan.nextInt(); //O(n)
        sold = numberOfSales*pricePerShare; //O(n)
        queue.dequeue();//O(n)
        /*-------------------------------------------*/
        week++; //O(n)
        if(week % 7 == 0){ //O(n)
          System.out.println("----- Week " + weekCounter + " complete " + "-------------------"); //O(n)
          System.out.println("-------------------------------------------"); //O(n)
          weekCounter++; //O(n)
        }
        System.out.println(" | Day " + i + " Number of sales: " + numberOfSales + " price: " + pricePerShare + " |"); //O(n)
      }else{
        return; //O(1)
      }
    }
    double total = bought - sold; //O(1)
    if(total < 0){ //O(1)
      System.out.println("You have lost: " + total); //O(1)
      System.out.println("Stocks remaining after all transactions(by price)"); //O(1)
      if(queue.isEmpty()){ //O(1)
        System.out.println("There are no more shares!"); //O(1)
      }
      queue.print(); //O(1)
    }else if(total > 0){ //O(1)
      System.out.println("You have profited: " + total); //O(1)
      System.out.println("Stocks remaining after all transactions(by price)"); //O(1)
      if(queue.isEmpty()){ //O(1)
        System.out.println("There are no more shares!"); //O(1)
      }
      queue.print(); //O(1)
    }else{
      System.out.println("You broke even"); //O(1)
      System.out.println("Stocks remaining after all transactions(by price)"); //O(1)
      if(queue.isEmpty()){ //O(1)
        System.out.println("There are no more shares!"); //O(1)
      }
      queue.print(); //O(1)
      
    }
  }
  /*
     * O(30n + 19)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
     * upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
     * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
     * and Big O then we can say that the average or Big theta is the base runtime:
     * O(n).
   */
  
}
