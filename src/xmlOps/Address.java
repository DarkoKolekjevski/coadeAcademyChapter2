package xmlOps;

public class Address {
	
	//Address(street,number,city)
	
	private String street;
	private String city;
	private Integer number;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Address(String street, String city, Integer number) {
		super();
		this.street = street;
		this.city = city;
		this.number = number;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", number=" + number + "]";
	}
	

}
