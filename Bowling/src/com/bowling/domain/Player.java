package com.bowling.domain;

public class Player {
	public Player(String playerName, String previousInput, int previousScore, int totalScoreTillNow) {
		super();
		this.playerName = playerName;
		this.previousInput = previousInput;
		this.previousScore = previousScore;
		this.totalScoreTillNow = totalScoreTillNow;
	}

	
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	String playerName;
	String previousInput;
	int previousScore;
	int totalScoreTillNow;
	
	public String getPreviousInput() {
		return previousInput;
	}
	public void setPreviousInput(String previousInput) {
		this.previousInput = previousInput;
	}
	public int getPreviousScore() {
		return previousScore;
	}
	public void setPreviousScore(int previousScore) {
		this.previousScore = previousScore;
	}
	public int getTotalScoreTillNow() {
		return totalScoreTillNow;
	}
	public void setTotalScoreTillNow(int totalScoreTillNow) {
		this.totalScoreTillNow = totalScoreTillNow;
	}

	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {

		this.playerName = playerName;
	}



	@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}
	
	

}
