package com.evolution;

import java.util.List;
import java.util.Objects;
import java.util.regex.*;

public class WebUser extends Client{
	private long idWebUser;
	private String username;
	private String password;
	
	public WebUser(long id,String dni, String name, List<String> surnames, String email, String telephone,
			long idClient, Boolean premium,
			long idWebUser, String username, String password) {
		super(id,dni,name,surnames,email,telephone,idClient,premium);
		this.idWebUser = idWebUser;
		this.username = username;
		this.password = password;
	}
	
	public WebUser(long id, String dni, String name, List<String> surnames, String email, String telephone,long idClient, Boolean premium) {
		super(id,dni,name,surnames,email,telephone,idClient, premium);
	}
	
	public WebUser() {}
	
	public long getIdWebUser() {
		return idWebUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "WebUser [idWebUser=" + idWebUser + ", username=" + username + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idWebUser);
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
		WebUser other = (WebUser) obj;
		return idWebUser == other.idWebUser;
	}
	
	public static boolean checkSecurePassword(String password) {
		String passwordRegexp = "([0-9]|[a-zA-Z])";
		return Pattern.matches(password, passwordRegexp);
	}
	
}
