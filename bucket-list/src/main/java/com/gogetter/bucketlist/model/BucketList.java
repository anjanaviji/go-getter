package com.gogetter.bucketlist.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BucketList {

	@Id
	private int id;
	@ManyToOne(cascade = CascadeType.REMOVE)
	private Destination destination;
	
	private boolean accomplished = false;
	@OneToOne(cascade = CascadeType.REMOVE)
	private User user;
	
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Destination destination) {
		this.destination = destination;
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
	 * @return the accomplished
	 */
	public boolean isAccomplished() {
		return accomplished;
	}

	/**
	 * @param accomplished the accomplished to set
	 */
	public void setAccomplished(boolean accomplished) {
		this.accomplished = accomplished;
	}

}
