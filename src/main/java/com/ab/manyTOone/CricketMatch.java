package com.ab.manyTOone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name="Cricket_Match")
public class CricketMatch {

	@Id
	private int matchId;
	private String teamOne;
	private String teamTwo;
	private String matchType;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Stadium stadium;
	public CricketMatch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CricketMatch(int matchId, String teamOne, String teamTwo, String matchType, Stadium stadium) {
		super();
		this.matchId = matchId;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.matchType = matchType;
		this.stadium = stadium;
	}

	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	
	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public Stadium getStadium() {
		return stadium;
	}
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	@Override
	public String toString() {
		return "CricketMatch [matchId=" + matchId + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", matchType="
				+ matchType + ", stadium=" + stadium + "]";
	}
	
}//CricketMactch
