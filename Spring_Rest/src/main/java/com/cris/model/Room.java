package com.cris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int id_room;
	
	@Column
	private String name;
	
	@Column
	private int capacity;
	
	public Room(){}
	
	public int getId_room() {
		return id_room;
	}

	public void setId_room(int id_room) {
		this.id_room = id_room;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room(int id_room, String name, int capacity) {
		super();
		this.id_room = id_room;
		this.name = name;
		this.capacity=capacity;
	}
}
