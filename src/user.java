public class user{
	public String pin;
	public String phone;
	public String name;
	public String SSN;
	public String address;
	
	public user(String pin, String phone, String name, String SSN, String address){
		pin = this.pin;
		name = this.name;
		phone = this.phone;
		SSN = this.SSN;
		address = this.address;
	}
	public String getPin() {
		return pin;
	}
	public String getPhone() {
		return phone;
	}
	public String getName() {
		return name;
	}
	public String getSSN() {
		return SSN;
	}
	public String getAddress() {
		return address;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}