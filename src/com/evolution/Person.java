package com.evolution;

import java.util.List;
import java.util.Objects;

public class Person {
	private long id;
	private String dni;
	private String name;
	private List<String> surnames;
	private String email;
	private String telephone;
	
	public Person(long id, String dni, String name, List<String> surnames, String email, String telephone) {
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.surnames = surnames;
		this.email = email;
		this.telephone = telephone;
	}
	
	public Person() {
	}
	
	public long getId() {
		return id;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSurnames() {
		return surnames;
	}

	public void setSurnames(List<String> surnames) {
		this.surnames = surnames;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", dni=" + dni + ", name=" + name + ", surnames=" + surnames + ", email=" + email
				+ ", telephone=" + telephone + "]";
	}
	
}
