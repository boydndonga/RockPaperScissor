package models;


public class Winner {

    private String winner;
    private String winnerRoll;

    public void getWin(String roll, String roll2){
        if((roll.equals("rock")) && (roll2.equals("paper"))) {
            setWinner("player2");
            setWinnerRoll(roll2);
        }
        else if ((roll.equals("rock")) && (roll2.equals("scissor"))){
            setWinner("player1");
            setWinnerRoll(roll);
        }
        else if((roll.equals("paper")) && (roll2.equals("scissor"))){
            setWinner("player2");
            setWinnerRoll(roll2);
        }
        else{
            setWinner("draw");
            setWinnerRoll(roll);
        }
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinnerRoll() {
        return winnerRoll;
    }

    public void setWinnerRoll(String winnerRoll) {
        this.winnerRoll = winnerRoll;
    }
}


