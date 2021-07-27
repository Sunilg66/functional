package com.sunil.function.dto;

import java.io.Serializable;

import com.sunil.function.constants.Religion;

public class HabbaDTO implements Serializable{
	
	private String name;
	private Integer noOfDays;
	private Religion religion;
	private String specialFood;
	private boolean shouldBath;
	private boolean wakeUpEarly;
	private String region;
	
	public HabbaDTO() {
		System.out.println("created habbaDTO default constructor ");
	}

	public HabbaDTO(String name, Integer noOfDays, Religion religion, String specialFood, boolean shouldBath,
			boolean wakeUpEarly,String region) {
		super();
		this.name = name;
		this.noOfDays = noOfDays;
		this.religion = religion;
		this.specialFood = specialFood;
		this.shouldBath = shouldBath;
		this.wakeUpEarly = wakeUpEarly;
		this.region = region;
	}

	@Override
	public String toString() {
		return "HabbaDTO [name=" + name + ", noOfDays=" + noOfDays + ",region=" + region + ", religion=" + religion + ", specialFood="
				+ specialFood + ", shouldBath=" + shouldBath + ", wakeUpEarly=" + wakeUpEarly + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + ((specialFood == null) ? 0 : specialFood.hashCode());
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
		HabbaDTO other = (HabbaDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (religion != other.religion)
			return false;
		if (specialFood == null) {
			if (other.specialFood != null)
				return false;
		} else if (!specialFood.equals(other.specialFood))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public String getSpecialFood() {
		return specialFood;
	}

	public void setSpecialFood(String specialFood) {
		this.specialFood = specialFood;
	}

	public boolean isShouldBath() {
		return shouldBath;
	}

	public void setShouldBath(boolean shouldBath) {
		this.shouldBath = shouldBath;
	}

	public boolean isWakeUpEarly() {
		return wakeUpEarly;
	}

	public void setWakeUpEarly(boolean wakeUpEarly) {
		this.wakeUpEarly = wakeUpEarly;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String Region) {
		this.region = region;
	}
	
}
