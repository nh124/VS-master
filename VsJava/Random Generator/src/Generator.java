import java.util.*;

public class Generator {
    static int n;
    static Generator gen = new Generator();
    static List<String> list;

    public static void main(String[] args) {
        System.out.println("Hello this is a random Word generator!!");
        System.out.println("----------------------------------------");

        System.out.println("Please enter if you would like to vote or randomly generate.(Enter 1 vote. Enter 2 to generate)");
        Scanner choose = new Scanner(System.in);
        int choice = choose.nextInt();
        if (choice == 1) {
            numberPickPrint();
            vote();
        } else if (choice == 2) {
            numberPick();
            namePick();
        } else {
            System.out.println("Wrong input!!");
        }
    }


    // if they select generate
    public static void numberPick() {
        System.out.println("Please input the number of words you would like put in this generator ");
        Scanner console = new Scanner(System.in);
        n = console.nextInt();
        if (n == 0) {
            System.out.println("Goodbye!!");
        } else {
            namePick();
        }
    }

    // if they select vote
    public static void numberPickPrint() {
        System.out.println("Please input the number of words you would like put in this generator ");
        Scanner console = new Scanner(System.in);
        n = console.nextInt();
        if (n == 0) {
            System.out.println("Goodbye!!");
        } else {
            list();
        }
    }

    // randomly generates
    public static void namePick() {
        list = new ArrayList<>();
        String nameGen;
        if (n != 0) {
            System.out.println("Hello");
            for (int i = 1; i <= n; i++) {
                System.out.println("Please enter number " + i + "  word");
                Scanner selection = new Scanner(System.in);
                nameGen = selection.nextLine();
                list.add(nameGen);

            }
        }
        System.out.println("\nThe word that was selected randomly was\t" + gen.Random(list));
    }

    //printing the list
    public static void list() {
        list = new ArrayList<>();
        String nameList;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                System.out.println("Please enter number " + i + "  word");
                Scanner selection = new Scanner(System.in);
                nameList = selection.nextLine();
                list.add(nameList);

            }
        }
        System.out.println(list);
    }

    public String Random(List<String> list) {
        Random r = new Random();
        return list.get(r.nextInt(list.size()));

    }

    public static void vote() {
        HashMap<String, Integer> info = new HashMap<>();
        String vote = "";
        System.out.println("Please input the number of people voting: ");
        Scanner people = new Scanner(System.in);
        int numbOfPeople = people.nextInt();


        for (int i = 0; i < list.size(); i++) {
            info.put(list.get(i), 0);
        }
        for (int i = 1; i <= numbOfPeople; i++) {
            System.out.println(list);
            System.out.println("Person " + i + " please vote for the list above.");
            Scanner input = new Scanner(System.in);
            vote = input.nextLine();
            if (list.contains(vote)) {
                info.put(vote, info.get(vote) + 1);
            }
        }
        System.out.println(info);
    }
}
