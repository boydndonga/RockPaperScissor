package models;

import java.util.ArrayList;
import java.util.List;

public class PlayerOneImpl extends GameRules {

    private List<String> playStore= new ArrayList<>();
    private String playerName;
    private String victoryQuote;


    public PlayerOneImpl(String playerName, String victoryQuote) {
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
        super.setRoll(roll);
        this.playStore.add(super.getRoll());
    }

    public List<String> getPlayStore() {
        return playStore;
    }
}
