import java.util.ArrayList;
import java.util.List;

interface BakedGoods {	
		public int getPrice();
		public String getDescription();
		public String getSellByDate();
}

class Brownie implements BakedGoods 
{
	int price;
	String description;
	String sellByDate;
	
	public Brownie(int price, String Description, String sellByDate)
	{
		this.price = price;
		this.description = Description;
		this.sellByDate = sellByDate;	
		
	}

	public int getPrice() 
	{
		return price;
	}
	public String getDescription() 
	{
		return description;
	}
	public String getSellByDate() 
	{
		return sellByDate;
	}
}

class CinnamonRoll implements BakedGoods {
	
	
	int price;
	String description;
	String sellByDate;
	
	
	public CinnamonRoll(int price, String Description, String sellByDate)
	{
		this.price = price;
		this.description = Description;
		this.sellByDate = sellByDate;	
		
	}

	

	public int getPrice() {return price;}
	public String getDescription() {return description;}
	public String getSellByDate() {return sellByDate;}

}

class Cookie implements BakedGoods {

	int price;
	String description;
	String sellByDate;
	
	
	public Cookie(int price, String Description, String sellByDate)
	{
		this.price = price;
		this.description = Description;
		this.sellByDate = sellByDate;	
		
	}

	public int getPrice() {return price;}
	public String getDescription() {return description;}
	public String getSellByDate() {return sellByDate;}
}


public class ExamQ3Interface {

	public static void main(String[] args) 
	{	
		ArrayList<BakedGoods> bakedgood= new ArrayList<BakedGoods>();
		Cookie cookie = new Cookie(1,  "cookie1" , "04/12/2020");
		bakedgood.add(cookie);
		CinnamonRoll cinnamonroll = new CinnamonRoll(2, "cinnamonroll1", "04/12/2020");
		bakedgood.add(cinnamonroll);
		Brownie brownie = new Brownie(3, "brownie1 ", "04/12/2020");
		bakedgood.add(brownie);
		Cookie cookie1 = new Cookie(1,  "cookie2" , "04/12/2020");
		bakedgood.add(cookie1);
		CinnamonRoll cinnamonroll1 = new CinnamonRoll(2, "cinnamonroll2", "04/12/2020");
		bakedgood.add(cinnamonroll1);
		Brownie brownie1 = new Brownie(3, "brownie2 ", "04/12/2020");
		bakedgood.add(brownie1);
		Cookie cookie2 = new Cookie(1,  "cookie3" , "04/12/2020");
		bakedgood.add(cookie2);
		CinnamonRoll cinnamonroll2 = new CinnamonRoll(2, "cinnamonroll3", "04/12/2020");
		bakedgood.add(cinnamonroll2);
		Brownie brownie2 = new Brownie(3, "brownie3 ", "04/12/2020");
		bakedgood.add(brownie2);
		for(BakedGoods goods :bakedgood)
		{
			System.out.println("Price: " + goods.getPrice());
			System.out.println("Description:  " + goods.getDescription());
			System.out.println("SellByDate:  " + goods.getSellByDate());			
		}
	}
}