/**
 * 
 */
package org.sistema.su4.su4act3;

/**
 * Represents a mountain which could be part of the race
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public class Mountain {
	private int id;
	private String name;
	private int level;
	private float height;
	private boolean isPrize;
	
	/**
	 * default constructor
	 */
	public Mountain () {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param level
	 * @param height
	 * @param isPrize
	 */
	public Mountain(int id, String name, int level, float height,
			boolean isPrize) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.height = height;
		this.isPrize = isPrize;
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
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @return the isPrize
	 */
	public boolean getisPrize() {
		return isPrize;
	}

	/**
	 * @param isPrize the isPrize to set
	 */
	public void setisPrize(boolean isPrize) {
		this.isPrize = isPrize;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n\tMountain [id=" + id + ", name=" + name + ", level=" + level
				+ ", height=" + height + ", isPrize=" + isPrize + "]";
	}
	
	
}
