package app;


public class ProductDetails{
	private int product_id;
	private String product_name ;
	private String product_category ;
	private double rating ;	
	private int price ;
	
	public ProductDetails(int product_id, String product_name,double rating, String product_category, int price) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_category = product_category;
		this.price = price;
		this.rating = rating;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "productDetails [product_id=" + product_id + ", product_name=" + product_name + ", product_category="
				+ product_category + ", rating=" +rating+", price=" + price + "]";
	}
	
}

