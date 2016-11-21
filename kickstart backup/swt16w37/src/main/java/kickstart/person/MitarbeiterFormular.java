package kickstart.person;

import org.hibernate.validator.constraints.NotEmpty;

public class MitarbeiterFormular {

	@NotEmpty(message = "MitarbeiterRegFormular.name.NotEmpty")// funktioniert irgendwie nicht
	private String name;
	
	@NotEmpty(message = "MitarbeiterRegFormular.username.NotEmpty")
	private String username;
	
	@NotEmpty(message = "MitarbeiterRegFormular.password.NotEmpty")
	private String password;

	private String role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
