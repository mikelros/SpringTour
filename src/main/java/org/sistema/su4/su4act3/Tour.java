/**
 * 
 */
package org.sistema.su4.su4act3;

import java.util.Vector;

/**
 * Le grand Tour
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public class Tour {
	private int year;
	private String name;
	private Vector<Team> teams;
	private Vector<Race> races;
	private Manager manager;
	
	/**
	 * default constructor
	 */
	public Tour () {
		teams = new Vector<Team>();
		races = new Vector<Race>();
	}

	/**
	 * @param year
	 * @param name
	 * @param teams
	 * @param races
	 * @param manager
	 */
	public Tour(int year, String name, Vector<Team> teams, Vector<Race> races,
			Manager manager) {
		this.year = year;
		this.name = name;
		this.teams = teams;
		this.races = races;
		this.manager = manager;
	}
	
	/**
	 * adds new race to the Tour
	 * @param race
	 */
	public void addRace (Race race) {
		races.add(race);
	}
	
	/**
	 * adds a new team to the Tour
	 * @param team
	 */
	public void addTeam (Team team) {
		teams.add(team);
	}

	/**
	 * returns all info from races
	 * @return
	 */
	public String showRaces() {
		String racesInfo = "";
		
		for (Race race: races) {
			racesInfo = racesInfo + race.toString() + "\n";
		}
		
		return racesInfo;
	}

	/**
	 * returns all info from teams
	 * @return
	 */
	public String showTeams() {
		String teamsInfo = "";
		
		for (Team team: teams) {
			teamsInfo = teamsInfo + team.toString() + "\n";
		}
		
		return teamsInfo;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the teams
	 */
	public Vector<Team> getTeams() {
		return teams;
	}

	/**
	 * @param teams the teams to set
	 */
	public void setTeams(Vector<Team> teams) {
		this.teams = teams;
	}

	/**
	 * @return the races
	 */
	public Vector<Race> getRaces() {
		return races;
	}

	/**
	 * @param races the races to set
	 */
	public void setRaces(Vector<Race> races) {
		this.races = races;
	}

	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tour [year=" + year + ", name=" + name + ", teams=" + teams
				+ ", races=" + races + ", manager=" + manager + "]";
	}
	
	
}
