package com.game.tournament.model;

/**
 * @author duy bun
 *
 */
public class Users {
	
	private int id;
	
	private String teamName;
	
	private int id_match;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getId_match() {
		return id_match;
	}
	public void setId_match(int id_match) {
		this.id_match = id_match;
	}
	public Users(int id,  String teamName, int id_match) {
		this.id = id;
		this.teamName = teamName;
		this.id_match = id_match;
	}
	
	
}
