package com.evolution;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Invoice {
	private long idInvoice;
	private List<Fault> faultsList;
	private boolean paid;
	private LocalDate date;
	private final double IVA = 0.21;
	
	public Invoice(long idInvoice,List<Fault> faultsList, boolean paid, LocalDate date) {
		this.idInvoice = idInvoice;
		this.faultsList = faultsList;
		this.paid = paid;
		this.date = date;
	}
	public Invoice() {
	}

	public List<Fault> getFaultsList() {
		return faultsList;
	}

	public void setFaultsList(List<Fault> faultsList) {
		this.faultsList = faultsList;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public long getIdInvoice() {
		return this.idInvoice;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idInvoice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		return idInvoice == other.idInvoice;
	}
	@Override
	public String toString() {
		return "Invoice [idInvoice=" + idInvoice + ", faultsList=" + faultsList + ", paid=" + paid + ", date=" + date
				+ "]";
	}
	
	public double totalPrice() {
		double total=0;
		for(Fault fault: this.faultsList) {
			Boolean premium = fault.getVehicle().getOwner().getPremium();
			double price = fault.getPrice();
			double priceIVA = Invoice.getIVA(price);
			total+=(premium)?priceIVA-(0.05*priceIVA):priceIVA;
		}
		return total;
	}
	
	public static double getIVA(double price) {
		return price+(price * 0.21);
	}
}
