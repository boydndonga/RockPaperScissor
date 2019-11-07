package models;



public class GameRules {


    private String roll;
    private String playerName;
    private String victoryQuote;
//    private List<String> playStore= new ArrayList<>();
//    private List<GameRules> playerProfile = new ArrayList<>();

    public GameRules(String playerName, String victoryQuote){

        this.playerName=playerName;
        this.victoryQuote=victoryQuote;
        //        playerProfile.add(this);
    }
    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

//    just became irrelevant
//
//    public void List<GameRules>setPlayerProfile(){
//        this.playerProfile.add(this);
//    }


//    public void setPlayerProfile(List<GameRules> playerProfile) {
//        this.playerProfile = playerProfile;
//    }

    public String getPlayerName() {
       return playerName;
    }

    public String getVictoryQuote() {
        return victoryQuote;
    }

//    public List<GameRules> getPlayerProfile() {
//        return playerProfile;
//    }




//    public List<String> getPlayStore() {
//        return playStore;
//    }

//    public void setPlayStore() {
//        this.playStore.add(getRoll());
//    }
}
