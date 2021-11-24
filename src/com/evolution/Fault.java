package com.evolution;

import java.util.List;
import java.util.Objects;

import com.evolution.types.FaultType;

public class Fault{
	private long idFault;
	private String title;
	private String description;
	private double price;
	private Enum<FaultType> level;
	private Worker worker;
	private Vehicle vehicle;
	
	public Fault(long idFault, String title, String description, double price, Enum<FaultType> level, Worker worker, Vehicle vehicle) {
		this.idFault = idFault;
		this.title = title;
		this.description = description;
		this.price = price;
		this.level = level;
		this.vehicle = vehicle;
		this.worker = worker;
	}
	
	public Fault(){
	}
	
	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public long getIdFault() {
		return idFault;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Enum<FaultType> getLevel() {
		return level;
	}

	public void setLevel(Enum<FaultType> level) {
		this.level = level;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFault);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fault other = (Fault) obj;
		return idFault == other.idFault;
	}

	@Override
	public String toString() {
		return "Fault [idFault=" + idFault + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", level=" + level + ", worker=" + worker + ", vehicle=" + vehicle + "]";
	}
	
}
