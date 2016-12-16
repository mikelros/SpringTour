/**
 * 
 */
package org.sistema.su4.su4act3;

import java.util.Vector;

/**
 * Represents a race which contains mountains and the outcome
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public class Race {
	private int id;
	private String name;
	private String origin;
	private String destiny;
	private float distance;
	private Vector<Mountain> mountains;
	private Vector<Cyclist> outcome;
	
	/**
	 * default constructor
	 */
	public Race () {
		mountains = new Vector<Mountain>();
		outcome = new Vector<Cyclist>();
	}

	
	/**
	 * @param id
	 * @param name
	 * @param origin
	 * @param destiny
	 * @param distance
	 * @param mountains
	 * @param outcome
	 */
	public Race(int id, String name, String origin, String destiny,
			float distance, Vector<Mountain> mountains, Vector<Cyclist> outcome) {
		this.id = id;
		this.name = name;
		this.origin = origin;
		this.destiny = destiny;
		this.distance = distance;
		this.mountains = mountains;
		this.outcome = outcome;
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
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destiny
	 */
	public String getDestiny() {
		return destiny;
	}

	/**
	 * @param destiny the destiny to set
	 */
	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

	/**
	 * @return the distance
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(float distance) {
		this.distance = distance;
	}

	/**
	 * @return the mountains
	 */
	public Vector<Mountain> getMountains() {
		return mountains;
	}

	/**
	 * @param mountains the mountains to set
	 */
	public void setMountains(Vector<Mountain> mountains) {
		this.mountains = mountains;
	}

	/**
	 * @return the outcome
	 */
	public Vector<Cyclist> getOutcome() {
		return outcome;
	}

	/**
	 * @param outcome the outcome to set
	 */
	public void setOutcome(Vector<Cyclist> outcome) {
		this.outcome = outcome;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nRace [id=" + id + ", name=" + name + ", origin=" + origin
				+ ", destiny=" + destiny + ", distance=" + distance
				+ ", mountains=" + mountains + ", outcome=" + outcome + "]";
	}
	
	
}
