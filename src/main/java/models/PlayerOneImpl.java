package models;

import java.util.ArrayList;
import java.util.List;

public class PlayerOneImpl extends GameRules {

    private List<String> playStore= new ArrayList<String>();
    private List<GameRules> player1playerProfile = new ArrayList<>();

    public PlayerOneImpl(String playerName, String victoryQuote) {
        super(playerName, victoryQuote);
        player1playerProfile.add(this);
    }

    public List<GameRules> getPlayer1playerProfile() {
        return player1playerProfile;
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
