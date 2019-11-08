import models.GameRules;
import models.PlayerOneImpl;
import models.PlayerTwoImpl;
import models.Winner;

import java.util.*;

public class App {


    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        Map<PlayerOneImpl, PlayerTwoImpl> players = new HashMap<PlayerOneImpl, PlayerTwoImpl>();

        System.out.println("\t| player One please enter name ");
        String p1name = myScanner.nextLine();
        System.out.println("\t| player one please enter your victoryQuote ");
        String p1quote = myScanner.nextLine();

        PlayerOneImpl player1 = new PlayerOneImpl(p1name, p1quote);
        String profName = player1.getPlayerName();
        System.out.println("you are locked and ready " + profName);


        System.out.println("\t| player Two please enter name ");
        String p2name = myScanner.nextLine();
        System.out.println("\t| player two please enter your victoryQuote ");
        String p2quote = myScanner.nextLine();

        PlayerTwoImpl player2 = new PlayerTwoImpl(p2name, p2quote);
        String prof2Name = player2.getPlayerName();
        System.out.println("you are locked and ready " + prof2Name);

        players.put(player1,player2);

        for (PlayerOneImpl p1 : players.keySet())
        {
            // search  for value
            PlayerTwoImpl p2 = players.get(p1);

//            player1 roll
            System.out.println("\t| player One what is your play?? rock,paper or scissor ");
            String roll = myScanner.nextLine();
            p1.setRoll(roll);
            System.out.println(p1.getRoll());

//            player2 roll
            System.out.println("Key = " + p1 + ", Value = " + p2);
            System.out.println("\t| player Two what is your play?? rock,paper or scissor ");
            String roll2 = myScanner.nextLine();
            p2.setRoll(roll2);
            System.out.println(p2.getRoll());

            Winner findWin = new Winner();

            findWin.getWin(p1.getRoll().toLowerCase(),p2.getRoll().toLowerCase());

            if(findWin.getWinner().equals("player1")){
                System.out.println("\t===========================");
                System.out.println("\t\t Bingo "+ p1.getPlayerName());
                System.out.println("\t\t you won with: "+ findWin.getWinnerRoll());
                System.out.println("\t\t Victory says: "+ p1.getVictoryQuote());
                System.out.println("\t===========================");
            }
            else if(findWin.getWinner().equals("player2")){
                System.out.println("\t===========================");
                System.out.println("\t\t Bingo "+ p2.getPlayerName());
                System.out.println("\t\t you won with: "+ findWin.getWinnerRoll());
                System.out.println("\t\t Victory says: "+ p2.getVictoryQuote());
                System.out.println("\t===========================");
            }
            else{
                System.out.println("\t===========================");
                System.out.println("\t\t This was a Draw!!!!");
                System.out.println("\t\t you both played: "+ findWin.getWinnerRoll());
                System.out.println("\t===========================");
            }
        }
    }
}
