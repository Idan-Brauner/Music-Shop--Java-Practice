package shop;

public class Guitar extends Instrument {
		
		private Type type;
		

	public Guitar(String company, int price, Type type) 	
	{
		super(company,price,t_serial++);
		this.type = type;
	}
	
	public Type getType() 
	{
		return type;
	}
	
	@Override
	public String toString() 
	{
		return "Guitar"+"("+type+") "+ super.getCompany()+"("+serial+"),"+" price = "+super.getPrice();
	}
}


