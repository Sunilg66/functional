package com.sunil.function.dto;

import java.io.Serializable;

import com.sunil.function.constants.MarketType;

public class MarketDTO implements Serializable{
	
	private String name;
	private String location;
	private int noOfShops;
	private MarketType type;
    
	public MarketDTO() {
		System.out.println("created default constructor");
	}

	public MarketDTO(String name, String location, int noOfShops, MarketType type) {
		super();
		this.name = name;
		this.location = location;
		this.noOfShops = noOfShops;
		this.type = type;
	}

	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", location=" + location + ", noOfShops=" + noOfShops + ", type=" + type
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		MarketDTO other = (MarketDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfShops() {
		return noOfShops;
	}

	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}

	public MarketType getType() {
		return type;
	}

	public void setType(MarketType type) {
		this.type = type;
	}

	
	
}
