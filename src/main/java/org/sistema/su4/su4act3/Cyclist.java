/**
 * 
 */
package org.sistema.su4.su4act3;

/**
 * Represents a cyclist of the race
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public class Cyclist {
	private int id;
	private String name;
	private String country;
	
	/**
	 * default constructor
	 */
	public Cyclist () {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param country
	 */
	public Cyclist(int id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n\tCyclist [id=" + id + ", name=" + name + ", country=" + country
				+ "]";
	}
	
	
}
