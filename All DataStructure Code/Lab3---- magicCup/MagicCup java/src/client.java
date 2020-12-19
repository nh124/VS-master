import java.util.Scanner;

public class client {
    static int choice;
    public static void main(String[] args) {
        boolean error;
        do {
            error = true;
            try {
                MagicCup1<?> mc1 = new MagicCup1<>();
                MagicCup2<?> mc2 = new MagicCup2<>();
                MagicCup3<?> mc3 = new MagicCup3<>();
                Scanner console = new Scanner(System.in);
                do {
                    System.out.println("Choose a magic cup by enter 1,2,3: ");
                    System.out.println("1. Magic Cup 1");
                    System.out.println("2. Magic Cup 2");
                    System.out.println("3. Magic Cup 3");
                    System.out.println("4. Compare Magic cups");
                    System.out.println("----------------------------------------------------------------------------------");
                    int input = console.nextInt();

                    if (input == 1) {
                        System.out.println("Magic cup 1" + "\n1. Display what is under the cup: " + "\n2. Add to the cup: " + "\n3. Remove from the cup: " + "\n4. Search the cup: " + "\n5. Cup Empty? ." + "\n6. Exit." + "\nPlease select 1 option from above by entering the number");
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        choice = console.nextInt();
                        String search = console.nextLine();
                        Object n = choice == 2 ? mc1.addToCup() : choice == 3 ? mc1.removeFromCup() : choice == 4 ? mc1.searchCup(): null;
                        if(choice == 1){
                            System.out.println(mc1.cupDisplay());
                        }else if(choice == 5){
                            System.out.println(mc1.empty());
                        }
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    } else if (input == 2) {
                        System.out.println("Magic cup 2" + "\n1. Display what is under the cup: " + "\n2. Add to the cup: " + "\n3. Remove from the cup: " + "\n4. Search the cup: " + "\n5. Cup Empty? ." + "\n6. Exit." + "\nPlease select 1 option from above by entering the number");
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        choice = console.nextInt();
                        String search = console.nextLine();
                        Object n = choice == 2 ? mc1.addToCup() : choice == 3 ? mc1.removeFromCup() : choice == 4 ? mc1.searchCup(): null;
                        if(choice == 1){
                            System.out.println(mc1.cupDisplay());
                        }else if(choice == 5){
                            System.out.println(mc1.empty());
                        }
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    } else if (input == 3) {
                        System.out.println("Magic cup 1" + "\n1. Display what is under the cup: " + "\n2. Add to the cup: " + "\n3. Remove from the cup: " + "\n4. Search the cup: " + "\n5. Cup Empty? ." + "\n6. Exit." + "\nPlease select 1 option from above by entering the number");
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        choice = console.nextInt();
                        String search = console.nextLine();
                        Object n = choice == 2 ? mc1.addToCup() : choice == 3 ? mc1.removeFromCup() : choice == 4 ? mc1.searchCup(): null;
                        if(choice == 1){
                            System.out.println(mc1.cupDisplay());
                        }else if(choice == 5){
                            System.out.println(mc1.empty());
                        }
                     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    } else {
                        System.out.println("Please input which comparison you would like to see -> Comparison 1 compares cup 1 to cup 2, Comparison 2 compares cup 1 to cup 3, and Comparison 3 compares cup 2 to cup 3  ");
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        int userCompare = console.nextInt();
                        ////////////////////////////////////////////////////////////////////////////////////
                        int comparison1 = mc1.compareTo(mc2);
                        int comparison2 = mc1.compareTo(mc3);
                        int comparison3 = mc2.compareTo(mc3);
                        //////////////////////////////////////////////////////////////////////////////
                        if (userCompare == 1) {
                            System.out.println(comparison1);
                            System.out.println("----------------------------------------------------------------------------------------------------");
                        } else if (userCompare == 2) {
                            System.out.println(comparison2);
                            System.out.println("----------------------------------------------------------------------------------------------------");
                        } else {
                            System.out.println(comparison3);
                            System.out.println("----------------------------------------------------------------------------------------------------");
                        }
                    }

                } while (choice != 6);
            } catch (Exception e) {
                System.out.println("Wrong input! ");
                System.out.println();
                error = false;
            }
        }while(!error);
    }
}
