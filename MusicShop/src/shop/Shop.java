package shop;

import java.util.*;


public class Shop {
	
	private int guitarcount=0;  //to count guitars
	private List<Instrument> returnlist = new ArrayList<>(); //create list of instrument

		public void add(Instrument i)
		{
			returnlist.add(i);
			if(i instanceof Guitar)
				guitarcount++;
		}
		

		public Instrument get(int serial)
		{
			
			for(int n=0;n<returnlist.size();n++)
			{
				if(returnlist.get(n).getSerial() == serial)  //check if instrument holder this serial is exist
					return returnlist.get(n);
			}
			return null;
		}

		

		public List<Integer> allSerials() //return list of instrument
		{
			List<Integer> t_list = new ArrayList<>();  //initializing list for all serials of instruments
			for(int n=0;n<returnlist.size();n++)
	            t_list.add(returnlist.get(n).getSerial());
			return t_list;
		}
		
		

		public List<Integer> guitarsOfType(Type t)
		{
			List<Integer> t_list = new ArrayList<>(); //initializing list for types of guitars
			for(int n=0;n<returnlist.size();n++)
			{ 
	            if(returnlist.get(n) instanceof Guitar)  //check if this instrument belongs to Guitar 
	            	if(((Guitar)returnlist.get(n)).getType() == t)  //checks if this type of guitar is the same type of t
	            		t_list.add(returnlist.get(n).getSerial());  //add serial of this type to guitarTypeList list
			}
			return t_list;
		}
		
		
		
		public void sell(int serial) throws MusicShopException
		{
			if(get(serial) != null)
			{
				if(get(serial) instanceof Guitar)  //check if this serial belongs to Guitar 
				{
					if(guitarcount>1)
					{
						returnlist.remove(get(serial));  //remove this serial from the list
						guitarcount--;
					}
					else
						throw new MusicShopException("This is the last Guitar in the shop");
				}
				else
					returnlist.remove(get(serial));	
			}
			else
				throw new MusicShopException("There isn't any instrument with this serial number");
		}
		
		

			public int sellAll(int[] serials) 
			{
				int i,z=0;
				for(i=0;i<serials.length;i++) {
					try {
						sell(serials[i]);
					}
					catch (MusicShopException e){
						z++;
					}
				}
				return z;
			}



			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		
}
