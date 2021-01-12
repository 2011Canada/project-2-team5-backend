package com.revature.project2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alias {
	
	@Id
	private int aliasID;
	
	private int userID;
	
	private String name;
	
	private String aliasLevel;
	
	private int moveCooldown;

	public Alias() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alias(int aliasID, int userID, String aliasName, String aliasLevel, int moveCooldown) {
		super();
		this.aliasID = aliasID;
		this.userID = userID;
		this.name = aliasName;
		this.aliasLevel = aliasLevel;
		this.moveCooldown = moveCooldown;
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

	public String getAliasName() {
		return name;
	}

	public void setAliasName(String aliasName) {
		this.name = aliasName;
	}

	public String getAliasLevel() {
		return aliasLevel;
	}

	public void setAliasLevel(String aliasLevel) {
		this.aliasLevel = aliasLevel;
	}

	public int getMoveCooldown() {
		return moveCooldown;
	}

	public void setMoveCooldown(int moveCooldown) {
		this.moveCooldown = moveCooldown;
	}

	@Override
	public String toString() {
		return "Alias [aliasID=" + aliasID + ", userID=" + userID + ", aliasName=" + name + ", aliasLevel="
				+ aliasLevel + ", moveCooldown=" + moveCooldown + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aliasID;
		result = prime * result + ((aliasLevel == null) ? 0 : aliasLevel.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + moveCooldown;
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
		if (aliasLevel == null) {
			if (other.aliasLevel != null)
				return false;
		} else if (!aliasLevel.equals(other.aliasLevel))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (moveCooldown != other.moveCooldown)
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}
	
}
