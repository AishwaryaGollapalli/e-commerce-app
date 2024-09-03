package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Search_product {
	public static void search_for_product( Scanner sc) {
		ArrayList<ProductDetails> prds = ProductsList.products_list();
		 System.out.println("Please Select The Required Option : ");

		 System.out.println("1.To view all the items."+"\n2.To Search For The Required Products.");
		 try {
			 int selected_option = sc.nextInt();
			 while (!(selected_option==1 || selected_option==2)) {
				 System.out.println("Pease enter a valid option.");
				 selected_option = sc.nextInt();
			 }
			 
			 switch(selected_option) {
			 case 1:{
				 for (int i=0;i<prds.size();i++) {
						ProductDetails p = prds.get(i);
						System.out.println(p.toString());
				 }
				break; 
			 }
			 case 2:{
				 System.out.println("Please Enter The Required Product Name : ");

				 String entered_product = sc.next();
				 
					int result = 0;

					for (int i=0;i<prds.size();i++) {
						ProductDetails p = prds.get(i);
						String p_name = p.getProduct_name();
						String p_category = p.getProduct_category();
						if (p_name.toLowerCase().contains(entered_product.toLowerCase()) || p_category.toLowerCase().contains(entered_product.toLowerCase())) {
							
							System.out.println(p.toString());
							result++;
						}
					
					}
					if (result <1 ) {
						System.out.println("Sorry, "+entered_product+" is currently unavailable!");
					}				
			 }
			 }
			
			 
		 }catch(Exception e) {
			 System.out.println(e.getLocalizedMessage());
		 }
		 
		 finally {
			 Product.product();
		 }
		 	
				 }

}


