import models.PlayerOneImpl;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\t| enter name ");

        String name=myScanner.nextLine();
        System.out.println("\t| enter nvicQuote ");
        String quote=myScanner.nextLine();

        PlayerOneImpl player1 = new PlayerOneImpl(name,quote);



//        List<GameRules> myProf = player1.getPlayer1playerProfile();
        String profName = player1.getPlayerName();
        System.out.println(profName);
    }
}
