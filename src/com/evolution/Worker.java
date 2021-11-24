package com.evolution;

import java.util.List;
import java.util.Objects;

import com.evolution.types.WorkerCategory;

public class Worker extends Person{
	private long idWorker;
	private double price;
	private Enum<WorkerCategory> category;
	
	public Worker(long id, String dni, String name, List<String> surnames, String email, String telephone,
			long idWorker,double price, Enum<WorkerCategory> category) {
		super(id,dni,name,surnames,email,telephone);
		this.idWorker = idWorker;
		this.price = price;
		this.category = category;
	}
	
	public Worker(long id, String dni, String name, List<String> surnames, String email, String telephone) {
		super(id,dni,name,surnames,email,telephone);
	}
	
	public Worker() {
	}
	
	public long getIdWorker() {
		return idWorker;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idWorker);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return idWorker == other.idWorker;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Enum<WorkerCategory> getCategory() {
		return category;
	}

	public void setCategory(Enum<WorkerCategory> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Worker [idWorker=" + idWorker + ", price=" + price + ", category=" + category + "]";
	}
	
	public double calculateWeekly(){
		return (this.getPrice()*8)*5;
	}
}
