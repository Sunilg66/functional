package com.sunil.function.dto;

import java.io.Serializable;
import java.util.Date;

import com.sunil.function.constants.GroceryType;

public class GroceryDTO implements Serializable {

	private String name;
	private double price;
	private GroceryType type;
	private float quantity;
	private boolean quality;
	private String brand;
	private Date expiryDate;
	private Date manufacturedDate;
	private boolean organic;
	private long barCodeNo;

	public GroceryDTO() {
		System.out.println("created default constructor");
	}

	public GroceryDTO(String name, double price, GroceryType type, float quantity, boolean quality, String brand,
			Date expiryDate, Date manufacturedDate, boolean organic, long barCodeNo) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.quality = quality;
		this.brand = brand;
		this.expiryDate = expiryDate;
		this.manufacturedDate = manufacturedDate;
		this.organic = organic;
		this.barCodeNo = barCodeNo;
	}

	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", price=" + price + ", type=" + type + ", quantity=" + quantity
				+ ", quality=" + quality + ", brand=" + brand + ", expiryDate=" + expiryDate + ", manufacturedDate="
				+ manufacturedDate + ", organic=" + organic + ", barCodeNo=" + barCodeNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (organic ? 1231 : 1237);
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
		GroceryDTO other = (GroceryDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (organic != other.organic)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GroceryType getType() {
		return type;
	}

	public void setType(GroceryType type) {
		this.type = type;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public boolean isOrganic() {
		return organic;
	}

	public void setOrganic(boolean organic) {
		this.organic = organic;
	}

	public long getBarCodeNo() {
		return barCodeNo;
	}

	public void setBarCodeNo(long barCodeNo) {
		this.barCodeNo = barCodeNo;
	}

}
