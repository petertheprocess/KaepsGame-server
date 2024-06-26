package ch.uzh.ifi.hase.soprafs24.entity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

import ch.uzh.ifi.hase.soprafs24.constant.GameStatus;
import ch.uzh.ifi.hase.soprafs24.constant.RoundStatus;

@Document(collection = "game") 
public class Game extends Room{
    
    public Game() {
        super();
    }
//    private List<Player> playerList = new ArrayList<>();
    private Player currentSpeaker;
    private String currentAnswer;
    private GameStatus gameStatus;
    private RoundStatus roundStatus;
    private int currentRoundNum = 0;
    private List<String> answeredPlayerList = new ArrayList<>();
    private String roundDue;


    public String getRoundDue() {
        return roundDue;
    }

    public void setRoundDue(String roundDue) {
        this.roundDue = roundDue;
    }

    public Game(Room room) {
        this.setRoomId(room.getRoomId());
        this.setTheme(room.getTheme());
        this.setRoomPlayersList(room.getRoomPlayersList());
    }

    public Player getCurrentSpeaker() {
        return currentSpeaker;
    }

    public void setCurrentSpeaker(Player currentSpeaker) {
        this.currentSpeaker = currentSpeaker;
        currentSpeaker.setIfGuessed(false);
    }

    public List<String> getAnsweredPlayerList() {
        return answeredPlayerList;
    }

    public void setAnsweredPlayerList(List<String> answeredPlayerList) {
        this.answeredPlayerList = answeredPlayerList;
    }

    public String getCurrentAnswer() {
        return currentAnswer;
    }

    public void setCurrentAnswer(String currentAnswer) {
        this.currentAnswer = currentAnswer;
    }

    public RoundStatus getRoundStatus() {
        return roundStatus;
    }

    public void setRoundStatus(RoundStatus roundStatus) {
        this.roundStatus = roundStatus;
    }

    public int getCurrentRoundNum() {
        return currentRoundNum;
    }

    public void setCurrentRoundNum(int currentRoundNum) {
        this.currentRoundNum = currentRoundNum;
    }

//    public List<Player> getPlayerList() {
//        return playerList;
//    }
//
//    public void setPlayerList(List<Player> playerList) {
//        this.playerList = playerList;
//    }
//    public void addPlayerList(Player player) {
//        this.playerList.add(player);
//    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

}
