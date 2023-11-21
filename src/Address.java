
public class Address implements Cloneable{
	
	private int pinCode;
	private String city;
	
	public Address() {
	}
	
	public Address(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", city=" + city + "]";
	}
	
	//DEEP CLONING
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
