package xmlOps;

public class Professor {
	
	private String name;
	private String surname;
	private String email;
	public String getName() {
		return name;

}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Professor(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	public Professor() {
		super();
	}
	@Override
	public String toString() {
		return "Professor [name=" + name + ", surname=" + surname + ", email=" + email + "]";
	}
}
