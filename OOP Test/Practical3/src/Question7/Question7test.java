package Question7;

public class Question7test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice info = new Invoice("7404","Logic",100,0.25); //information of good
		System.out.println("Part Number : "+info.get_part_number());
		System.out.println("Part Decription : "+info.get_part_decription());
		System.out.println("Quantity of items : "+info.get_quantity()); //Before changing information
		System.out.println("Price per item : "+info.get_item());
		System.out.println("GetInvoiceAmount : "+info.getInvoiceAmount());
		System.out.println(); //Jump one line
		info.set_part_number("24"); // number of items
		info.set_part_decription("Design"); //item's name
		info.set_quantity(15); //Amount of items
		info.set_item(0.50); // item's price
		System.out.println("Part Number : "+info.get_part_number());           
		System.out.println("Part Decription : "+info.get_part_decription());
		System.out.println("Quantity of items : "+info.get_quantity());         //After changing information  
		System.out.println("Price per item : "+info.get_item());
		System.out.println("GetInvoiceAmount : "+info.getInvoiceAmount());
		
	}

}
