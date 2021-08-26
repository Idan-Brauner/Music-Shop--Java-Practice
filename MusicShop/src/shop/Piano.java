package shop;

public class Piano extends Instrument {
			
			private int octaves;


		public Piano(String company, int price, int octaves) 	
		{
			super(company,price,t_serial++);
			this.octaves = octaves;
		}

		
		public int getOctaves() 
		{
			return octaves;
		}
		
		public String toString() 
		{
			return "Piano"+"("+octaves+" octaves"+") "+super.getCompany()+"("+serial+"),"+" price = "+super.getPrice();
		}
	}


