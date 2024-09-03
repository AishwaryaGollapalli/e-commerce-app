package app;

import java.util.ArrayList;

public class ProductsList {
	public static ArrayList<ProductDetails> products_list() {
		ArrayList <ProductDetails> prds = new ArrayList<ProductDetails>();		
				
				prds.add(new ProductDetails(1,"OnePlus 6T",4.5,"Smartphone",32970));
				prds.add(new ProductDetails(2,"Redmi K20",3.0,"Smartphone",12500));
				prds.add(new ProductDetails(3,"Denim Blue Shirt",3.8,"Clothing",750));
				prds.add(new ProductDetails(4,"Puma Blue Jeans",3.6,"Clothing",800));
				prds.add(new ProductDetails(5,"Denim Black Jeans",4.5,"Clothing",900));
				prds.add(new ProductDetails(6,"Cadbury Chocolate Cake",3.7,"Food",25));
				prds.add(new ProductDetails(7,"Cadbury Strawberry cake",4.1,"Food",60));
				prds.add(new ProductDetails(8,"Britannia Chocolate Cake",2.5,"Food",10));
				prds.add(new ProductDetails(9,"Apple Smart Watch",4.5,"Gadgets",17000));
				prds.add(new ProductDetails(10,"Realme Smart Cam",4.7,"Gadgets",2600));
				prds.add(new ProductDetails(11,"Sony Smart TV",4.9,"Gadgets",40000));
				prds.add(new ProductDetails(12,"Samsung Smart TV",4.5,"Gadgets",37000));
				prds.add(new ProductDetails(13,"Mi Smart TV",4.0,"Gadgets",25000));
				prds.add(new ProductDetails(14,"Samsung Galaxy A20",4.2,"Smartphone",22750));
				prds.add(new ProductDetails(15,"Oppo F30",3.9,"Smartphone",17990));
				prds.add(new ProductDetails(16,"Vivo T3",4.0,"Smartphone",14690));
				prds.add(new ProductDetails(17,"Vivo F13",4.8,"Smartphone",22350));
				prds.add(new ProductDetails(18,"Apple iPhone 15",4.3,"Smartphone",44990));
				prds.add(new ProductDetails(19,"Redmi Note 13",3.5,"Smartphone",11500));
				prds.add(new ProductDetails(20,"Bourbon Small",3.5,"Food",10));
				prds.add(new ProductDetails(21,"Bourbon Special",4.6,"Food",15));
				prds.add(new ProductDetails(22,"Bourbon With Extra Cookies",4.4,"Food",30));
				prds.add(new ProductDetails(23,"Raw Cashew",3.9,"Food",370));
				prds.add(new ProductDetails(24,"Cashew Nuts",4.2,"Food",550));
				prds.add(new ProductDetails(25,"Chocolate Cashew",3.5,"Food",670));
				prds.add(new ProductDetails(26,"Lay's Potato Chips India's Magic Masala",4.6,"Food",42));
				prds.add(new ProductDetails(27,"Lay's Potato Chips Cream & onion",4.2,"Food",63));
				prds.add(new ProductDetails(28,"Banana Chips",4.3,"Food",550));
				prds.add(new ProductDetails(29,"Harry Potter and the Philosopher's Stone",4.7,"Novel",222));
				prds.add(new ProductDetails(30,"Harry Potter and the Chamber of Secrets",4,"Novel",343));
				prds.add(new ProductDetails(31,"Harry Potter and the Prisoner of Azkaban",4.6,"Novel",284));
				prds.add(new ProductDetails(32,"Harry Potter and the Goblet of Fire",4.2,"Novel",431));
				
				return prds;
				
			}


}
