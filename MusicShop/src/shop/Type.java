package shop;

public enum Type {   //create an enum type for guitar
	
	
		ACOUSTIC
		{
		public String toString() 
			{
				return "Acoustic";
			}
		},
		ELECTRIC
		{
		public String toString() 
			{
				return "Electric";
			}
		},
		CLASSICAL
		{
		public String toString() 
			{
				return "Classical";
			}
		};

}