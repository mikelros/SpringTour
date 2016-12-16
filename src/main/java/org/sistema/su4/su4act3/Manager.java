/**
 * 
 */
package org.sistema.su4.su4act3;

/**
 * Represents a team manager
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public class Manager {
	private int id;
	private String name;
	
	/**
	 * default constructor
	 */
	public Manager () {
		
	}

	/**
	 * @param id
	 * @param name
	 */
	public Manager(int id, String name) {
		this.id = id;
		this.name = name;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + "]";
	}
	
	
}
