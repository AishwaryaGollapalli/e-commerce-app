package app;

import java.util.Scanner;

import shoppingCart.cartProductDetails;




public class Product {

	public static void product() {
		
		System.out.println("Please select an option from 1 to 4");
		System.out.println("1. Search for Products"+"\n2. Add Items to Shopping Cart"+"\n3. View Shopping Cart"+"\n4. Checkout Shopping Cart");
		
		
		Scanner sc = new Scanner(System.in);
		try {
			int input_num = sc.nextInt();
			while(!(input_num>0 && input_num<5)) {
				System.out.println("Please Enter A Valid Option");
				input_num = sc.nextInt();
			}
				switch(input_num) {
				case 1: {
					Search_product.search_for_product( sc);
					break;
				}case 2:{
					cartProductDetails.addItemsToCart();
					break;
				}case 3:{
					cartProductDetails.showCartItems();
					break;
				}case 4:{
					if(cartProductDetails.shoppingCartItems.size() <1 ) {
						System.out.println("Your Cart is empty. Please add a product to checkout.");

					}else {
					System.out.println("Your order is successfully placed. Thank you!");
					cartProductDetails.SetCartEmpty();
				
					}
					break;
				}default :{
					System.out.println("");	
					

				}
				}
							
				
			
	}
		finally {
		}
	}

}
