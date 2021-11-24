package com.evolution;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Vehicle{
	private long idVehicle;
	private String enrollment;
	private String model;
	private LocalDate enrollmentYear;
	private Client owner;
	
	public Vehicle(long idVehicle, String enrollment, String model, LocalDate enrollmentYear, Client owner) {
		this.idVehicle = idVehicle;
		this.enrollment = enrollment;
		this.model = model;
		this.enrollmentYear = enrollmentYear;
		this.owner = owner;
	}
	
	public Vehicle() {
	}

	public Client getOwner() {
		return owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
	}

	public long getIdVehicle() {
		return idVehicle;
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getEnrollmentYear() {
		return enrollmentYear;
	}

	public void setEnrollmentYear(LocalDate enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idVehicle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return idVehicle == other.idVehicle;
	}

	@Override
	public String toString() {
		return "Vehicle [idVehicle=" + idVehicle + ", enrollment=" + enrollment + ", model=" + model
				+ ", enrollmentYear=" + enrollmentYear + ", owner=" + owner + "]";
	}
	
}
