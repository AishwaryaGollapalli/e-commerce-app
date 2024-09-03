package shoppingCart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import app.Product;
import app.ProductDetails;
import app.ProductsList;

class CartItemsDetails {
	private int product_id ;
	private int product_price ;
	private int quantity  ;
	public CartItemsDetails(int product_id, int product_price, int quantity) {
		super();
		this.product_id = product_id;
		this.product_price = product_price;
		this.quantity = quantity;
	}
	public void displayItems() {
		System.out.println("Product ID: "+product_id+" Product Price : "+product_price+" Quantity : "+quantity );
	}
	
	public int showPrice() {
		return product_price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	
}


public class cartProductDetails {
	public static ArrayList<CartItemsDetails> shoppingCartItems = new ArrayList<CartItemsDetails>();

	public static void addItemsToCart(){
		
		System.out.println("Please Enter Product ID: ");
		Scanner sc = new Scanner(System.in);
		
		int prdtId = sc.nextInt();
		
		while (!(prdtId>0 && prdtId<=32)) {
			System.out.println("Please Enter a Valid Product ID : ");
			 prdtId = sc.nextInt();

		}
		
		
			System.out.println("Please Enter product Quantity : ");
			int prdtQty = sc.nextInt();
			
			ArrayList<ProductDetails> prds = ProductsList.products_list();
			ProductDetails selected_product =	prds.get(prdtId - 1);
			
			CartItemsDetails newProduct = new CartItemsDetails(prdtId,selected_product.getPrice(),prdtQty);
			shoppingCartItems.add(newProduct);
		
		System.out.println("Item Successfully Added To Cart");
			
		Product.product();
		
	}
	
public static void showCartItems(){
	int total = 0;
	
	if (shoppingCartItems.size()>0) {
		for (CartItemsDetails cd:shoppingCartItems) {
		cd.displayItems();
		int item_cost = cd.getQuantity() * cd.showPrice();
		total += item_cost;
		}
		
	}else {
		System.out.println("Your Cart Is Empty.");	
	}
	
	System.out.println("Total Price : "+total);
	Product.product();
}

public static void  SetCartEmpty(){
 shoppingCartItems.clear();
 
 
}
}
