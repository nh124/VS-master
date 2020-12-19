import java.util.Scanner;
import java.util.Random;

public class duck_duck_go {
    String playerIt; // O(1)
    String [] playerList; // O(1)
    int round; // O(1)
/* base runtime: O(3) -> O(1)(drop constants)
    Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
        Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
        Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */
    public String [] players(int numbOfPlayers){
        playerList = new String[numbOfPlayers]; // O(1)
        Scanner player = new Scanner(System.in); // O(1)
        // System.out.print("How many player are playing: ");
        // int numbOfPlayers = player.nextInt();
        for(int i = 0; i < numbOfPlayers; i++){ 
            //  O(1)          O(n)       O(2n)
            System.out.println("Please input the name of player number " + i + ":"); // O(n)
            String name = player.nextLine(); // O(n)
            name = playerList[i]; // O(n)
        }
        return playerList; // O(1)
    } 
    /* base runtime: O(6n + 7)-> O(n)(drop constants)
    Big O: O(n) -> tight upper bound: O(7n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
    */
    
    public String PlayerIt(){
        int itRandom =  new Random().nextInt(playerList.length); // O(1)
        playerIt = playerList[itRandom]; // O(1)
        return playerIt; // O(1)
    }
   /* base runtime: O(3) -> O(1)(drop constants)
    Big O: O(n) -> tight upper bound: O(1/10n) -> loose upperbound: O(100n)
        Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower bound: O(1/2)
        Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(1).
    */

    public void gameTime(int numbOfPlayers){
        String [] momCondition = new String[1]; // O(1)
        momCondition[0] = "keep playing"; // O(1)
        momCondition[1] = "Dinner Time"; // O(1)
        String [] childrenCondition = new String[1]; // O(1)
        childrenCondition[0] = "enternained"; // O(1)
        childrenCondition[1] = "board";// O(1)

        int RandomMomCondition = new Random().nextInt(momCondition.length); // O(1)
        int RandomChildCondition = new Random().nextInt(childrenCondition.length); // O(1)

        String momConditionConfirmed = momCondition[RandomMomCondition]; // O(1)
        String childrenConditionConfirmed = childrenCondition[RandomChildCondition]; // O(1)


    do{ // O(n)
        round = 1;
        System.out.println("Round" + round); // O(1)
        System.out.println("Of the player" + playerList + "\n" + playerIt + "was randomly chosen as it." ); // O(1)
        String[] chase = new String[1]; // O(1)
        chase[0] = playerIt; // O(1)
        Random rand = new Random(); // O(1)
        int duck_duck_go = rand.nextInt(0-numbOfPlayers); // O(1)
        int itIndex = 0; // O(1)
        for(int i = 0; i < playerList.length; i++){
            //  O(1)          O(n)       O(2n)
            if(playerList[i] == playerIt) { //O(n)
                i = itIndex; //O(n)
            }
        }
        for(int i = 0; i < playerList.length-1; i++){
            //  O(1)          O(n)       O(2n)
            playerList[i] = playerList[i + itIndex]; //O(n)
        }
        for(int i = 0; i < playerList.length-1; i++){
            //  O(1)          O(n)       O(2n)
            String newPlayerIt = playerList[duck_duck_go]; //O(n)
            chase[1] = newPlayerIt;//O(n)
            int newPlayerItIndex = new Random().nextInt(chase.length);//O(n)
            chase[newPlayerItIndex] = playerIt;//O(n)
        }
        System.out.println("Mom Condition" + momConditionConfirmed); // O(1)
        System.out.println("Children condition" + childrenConditionConfirmed); // O(1)
    round++; //O(n) n-> random
    }while(momConditionConfirmed != "Dinner Time" || childrenConditionConfirmed != "board"); //O(n) n-> random
} 
/* O(13n +11) -> O(n)(drop constants)
  Big O: O(n) -> tight upper bound: O(5n) -> loose upperbound: O(100n)
      Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose lower bound: O(log(n))
      Big theta:Since this method have a Big omega and Big O then we can say that the average or Big theta is the base runtime: O(n). 
*/

}
