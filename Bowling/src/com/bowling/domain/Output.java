package com.bowling.domain;

public class Output {
	public Output(Player player, String currentInput, int totalScore) {
		super();
		this.player = player;
		this.currentInput = currentInput;
		this.totalScore = totalScore;
	}
	
	public Output() {
		// TODO Auto-generated constructor stub
	}
	Player player;
	String currentInput;
	int totalScore;
	
	public String getCurrentInput() {
		return currentInput;
	}
	public void setCurrentInput(String currentInput) {
		this.currentInput = currentInput;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	@Override
	public String toString() {
		return "Output [player=" + player + ", currentInput=" + currentInput + ", totalScore=" + totalScore + "]";
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}

}
