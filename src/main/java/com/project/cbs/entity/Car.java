package com.project.cbs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CarID; 
	private String Model_Name;
	private int Price_Per_Km;
	private int CategoryId;
	public int getCarID() {
		return CarID;
	}
	public void setCarID(int carID) {
		CarID = carID;
	}
	public String getModel_Name() {
		return Model_Name;
	}
	public void setModel_Name(String model_Name) {
		Model_Name = model_Name;
	}
	public int getPrice_Per_Km() {
		return Price_Per_Km;
	}
	public void setPrice_Per_Km(int price_Per_Km) {
		Price_Per_Km = price_Per_Km;
	}
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	@Override
	public String toString() {
		return "Car [CarID=" + CarID + ", Model_Name=" + Model_Name + ", Price_Per_Km=" + Price_Per_Km + ", CategoryId="
				+ CategoryId + "]";
	}

}
