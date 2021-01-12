package com.revature.project2.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alias")
public class Alias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alias_id")
	private int aliasID;
	
	@Column(name = "user_id")
	private int userID;
	
	@Column(name = "alias_name")
	private String name;
	
	@Column(name = "current_level")
	private int aliasLevel;
	
	@Column(name = "movement_cooldown")
	private Timestamp moveCoolDown;
	
	@Column(name = "state_id")
	private int stateID;
	
	@Column(name = "is_active")
	private boolean isActive;

	public Alias() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alias(int aliasID, int userID, String name, int aliasLevel, Timestamp moveCoolDown, int stateID,
			boolean isActive) {
		super();
		this.aliasID = aliasID;
		this.userID = userID;
		this.name = name;
		this.aliasLevel = aliasLevel;
		this.moveCoolDown = moveCoolDown;
		this.stateID = stateID;
		this.isActive = isActive;
	}

	public int getAliasID() {
		return aliasID;
	}

	public void setAliasID(int aliasID) {
		this.aliasID = aliasID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAliasLevel() {
		return aliasLevel;
	}

	public void setAliasLevel(int aliasLevel) {
		this.aliasLevel = aliasLevel;
	}

	public Timestamp getMoveCoolDown() {
		return moveCoolDown;
	}

	public void setMoveCoolDown(Timestamp moveCoolDown) {
		this.moveCoolDown = moveCoolDown;
	}

	public int getStateID() {
		return stateID;
	}

	public void setStateID(int stateID) {
		this.stateID = stateID;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Alias [aliasID=" + aliasID + ", userID=" + userID + ", name=" + name + ", aliasLevel=" + aliasLevel
				+ ", moveCoolDown=" + moveCoolDown + ", stateID=" + stateID + ", isActive=" + isActive + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aliasID;
		result = prime * result + aliasLevel;
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + ((moveCoolDown == null) ? 0 : moveCoolDown.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + stateID;
		result = prime * result + userID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alias other = (Alias) obj;
		if (aliasID != other.aliasID)
			return false;
		if (aliasLevel != other.aliasLevel)
			return false;
		if (isActive != other.isActive)
			return false;
		if (moveCoolDown == null) {
			if (other.moveCoolDown != null)
				return false;
		} else if (!moveCoolDown.equals(other.moveCoolDown))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stateID != other.stateID)
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}
	
}
