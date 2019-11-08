package models;

import interfaces.PlayerInterface;

import java.util.ArrayList;
import java.util.List;

public class PlayerTwoImpl extends GameRules implements PlayerInterface {

    private List<String> playStore= new ArrayList<>();
    private String playerName;
    private String victoryQuote;
    private String roll;


    public PlayerTwoImpl(String playerName, String victoryQuote) {
        super(playerName, victoryQuote);
        setPlayerName(playerName);
        setVictoryQuote(victoryQuote);
    }


    @Override
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String getVictoryQuote() {
        return victoryQuote;
    }

    public void setVictoryQuote(String victoryQuote) {
        this.victoryQuote = victoryQuote;
    }

    @Override
    public void setRoll(String roll) {
        this.roll=roll;
        this.playStore.add(roll);
    }

    @Override
    public String getRoll() {
        return roll;
    }

    public List<String> getPlayStore() {
        return playStore;
    }

}
