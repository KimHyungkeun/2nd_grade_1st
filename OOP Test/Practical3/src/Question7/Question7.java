package Question7;
class Invoice //class Invoice
{
	String part_number;
	String part_decription;
	private int quantity_of_the_item;
	private double price_per_item;
	
	public Invoice(String number,String decription,int quantity,double item) //constructor
	{
		this.part_number = number;
		this.part_decription = decription;
		this.quantity_of_the_item = quantity;
		this.price_per_item = item;
	}
	public void set_part_number(String number) //set part number
	{
		this.part_number = number;
	}
	
	public void set_part_decription(String decription) //set part decription
	{
		this.part_decription = decription;
	}
	
	public void set_quantity(int quantity) //set quantity
	{
		if(quantity > 0) 
		this.quantity_of_the_item = quantity;
		
		else //if quantitiy is not positive, set 0
		this.quantity_of_the_item = 0;
		
		
	}
	
	public void set_item(double item) 
	{
		
		if(item > 0)
		this.price_per_item = item;
		
		else //if price is not positive, set 0
		this.price_per_item = 0.0;
	}
	
	public String get_part_number() //return part number
	{
		return this.part_number;
	}
	
	public String get_part_decription() //return part decription
	{
		return this.part_decription;
	}
	
	public int get_quantity() //return quantity
	{
		return this.quantity_of_the_item;
	}
	
	public double get_item() //return price per item
	{
		return this.price_per_item;
	}
	
	public double getInvoiceAmount() //return the amount as a double value
	{
		return this.quantity_of_the_item*this.price_per_item;
	}
	
}
