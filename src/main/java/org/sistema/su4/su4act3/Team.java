/**
 * 
 */
package org.sistema.su4.su4act3;

import java.util.Vector;

/**
 * Represents a team
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public class Team {
	private int id;
	private String name;
	private String description;
	private String country;
	private Vector<Cyclist> cyclists;
	private Manager manager;
	
	/**
	 * default constructor
	 */
	public Team () {
		cyclists = new Vector<Cyclist>();
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param country
	 * @param cyclists
	 * @param manager
	 */
	public Team(int id, String name, String description, String country,
			Vector<Cyclist> cyclists, Manager manager) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.country = country;
		this.cyclists = cyclists;
		this.manager = manager;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the cyclists
	 */
	public Vector<Cyclist> getCyclists() {
		return cyclists;
	}

	/**
	 * @param cyclists the cyclists to set
	 */
	public void setCyclists(Vector<Cyclist> cyclists) {
		this.cyclists = cyclists;
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
		return "\nTeam [id=" + id + ", name=" + name + ", description="
				+ description + ", country=" + country + ", cyclists="
				+ cyclists + ", manager=" + manager + "]";
	}
	
	
}
