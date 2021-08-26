package shop;

public abstract class Instrument {  //abstract class that create an instrument
	private String company;
	private int price;
	protected int serial;
	static int t_serial=0;


	public Instrument(String company, int price,int serial) {
		this.company = company;
		this.price = price;
		this.serial = serial;
	}

	public int getPrice() {
		return price;
	}

	public String getCompany() {
		return company;
	}
	
	public int getSerial() {
		return serial;
	}
	
}
