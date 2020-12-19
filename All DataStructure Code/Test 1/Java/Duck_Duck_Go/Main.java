import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        duck_duck_go ddg = new duck_duck_go();
        System.out.println("Number of player: ");
        Scanner console = new Scanner(System.in);
        
        int numberOfPlayer = console.nextInt();
        
        System.out.println(ddg.players(numberOfPlayer));
        System.out.println(ddg.playerIt);
        ddg.gameTime(numberOfPlayer);
    }
}
