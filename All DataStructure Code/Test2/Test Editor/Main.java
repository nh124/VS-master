/*----------Question 5------------------------*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    /*--Testing-----------------------
    System.out.println("Hello world!");
    textEditing te = new textEditing();
    te.wordTra("Hello");
    te.moveCourserLeft(4); 
    te.moveCourserRight(1);
    te.insertChar('x');
    te.deleteChar();
    ----------------------------------*/
    int choice;    
    textEditing te = new textEditing();
    Scanner scan = new Scanner(System.in);
    System.out.println("---------------------------------------------------------");
    System.out.println("'|' is the cursor");
    System.out.println("Please input simething here:");
    String input = scan.nextLine();
    te.wordTra(input);

    do{
      System.out.println("1. Move left");
      System.out.println("2. Move right");
      System.out.println("3. Insert");
      System.out.println("4. Delete");
      System.out.println("5. Exit");
      choice = scan.nextInt();

      if(choice == 1){
        System.out.println("1. Please enter how many times you would like to move left");
        int leftWard = scan.nextInt();
        te.moveCourserLeft(leftWard);
      }else if(choice == 2){
        System.out.println("2. Please enter how many times you would like to move right");
        int rightWard = scan.nextInt();
        te.moveCourserRight(rightWard);
      }else if(choice == 3){
        System.out.println("3. Plase enter a character you like to insert after the cursor");
        char inputChar = scan.next().charAt(0);
        te.insertChar(inputChar);
      }else if(choice == 4){
        te.deleteChar();
      }else{
        System.out.println("Goodbye!");
      }
    }while(choice != 5);


  }
}