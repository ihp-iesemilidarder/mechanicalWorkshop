package com.evolution;

import java.util.List;
import java.util.Objects;

public class Client extends Person{
	private long idClient;
	private Boolean premium;
	
	public Client(long id, String dni, String name, List<String> surnames, String email, String telephone,
			long idClient, Boolean premium) {
		super(id,dni,name,surnames,email,telephone);
		this.idClient= idClient;
		this.premium = premium;
	}
	
	public Client(long id,String dni, String name, List<String> surnames, String email, String telephone) {
		super(id,dni,name,surnames,email,telephone);
	}
	
	public Client() {
	}

	public long getIdClient() {
		return idClient;
	}

	public Boolean getPremium() {
		return premium;
	}

	public void setPremium(Boolean premium) {
		this.premium = premium;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idClient);
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
		Client other = (Client) obj;
		return idClient == other.idClient;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", premium=" + premium + "]";
	}
	
}
