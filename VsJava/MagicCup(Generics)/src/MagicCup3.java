import java.util.ArrayList;
import java.util.Scanner;

class MagicCup3<T> implements magic<T>, Comparable<T>{
    ArrayList<T> list = new ArrayList<>();

    @Override
    public boolean empty() {
        if(list.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public ArrayList<T> addToCup(){
        Scanner add = new Scanner(System.in);

        System.out.println("Please enter anything that you like to add to magic cup 3. Specify the number of elements followed by the list itself ");
        System.out.print("Number of elements in the cup: ");
        int numbOfAdditions = add.nextInt();
        System.out.print("Elements: ");
        for(int i = 0; i < numbOfAdditions; i++) {
            Object inputs = add.next();
            list.add((T)inputs);
        }
        System.out.println("------------------------------------------------------------------");
        return list;

    }

    @Override
    public ArrayList<T> removeFromCup() {
        Scanner remove = new Scanner(System.in);

        System.out.println(list);
        System.out.println("Please enter what you be removing. Specify the number of elements you would like to remove followed by the elements itself: ");
        System.out.print("Number of elements in the cup: ");
        int numberOfRemoval = remove.nextInt();
        System.out.print("Elements: ");
        for(int i = 0; i < numberOfRemoval; i++){
            Object input = remove.next();
            list.remove((T)input);
        }
        return list;
    }

    @Override
    public ArrayList<T> cupDisplay() {
        System.out.println("The Cup contains the following: ");
        //System.out.println(list);
        return list;
    }


    @Override
    public boolean searchCup() {
        System.out.println("Cup Search: ");
        Scanner searching = new Scanner(System.in);
        Object search = searching.next();
        if(list.contains(search)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int compareTo(Object one) {
        return 0;
    }
}
