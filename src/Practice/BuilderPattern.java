package Practice;

public class BuilderPattern {
	
	//required fields
	private String name;
	private double price;
	
	//optional fields
	private String description;
	private String category;
	private double discount;
	private boolean freeShipping;
	private int stock;
	
	
	private BuilderPattern(ProductBuilder builder) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
		this.discount = discount;
		this.freeShipping = freeShipping;
		this.stock = stock;
	}

	// getters and setters
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public boolean isFreeShipping() {
		return freeShipping;
	}


	public void setFreeShipping(boolean freeShipping) {
		this.freeShipping = freeShipping;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "BuilderPattern [name=" + name + ", price=" + price + ", description=" + description + ", category="
				+ category + ", discount=" + discount + ", freeShipping=" + freeShipping + ", stock=" + stock + "]";
	}
	
	public static class ProductBuilder {
		
		//required fields
		private String name;
		private double price;
		
		//optional fields
		private String description;
		private String category;
		private double discount;
		private boolean freeShipping;
		private int stock;
		
		//public const... of the builder
		public ProductBuilder(String name, double price) {
			this.name = name;
			this.price = price;
		}

		//setter for optional fields
		public ProductBuilder setDescription(String description) {
			this.description = description;
			return this;
		}

		
		public ProductBuilder setCategory(String category) {
			this.category = category;
			return this;
		}


		public ProductBuilder setDiscount(double discount) {
			this.discount = discount;
			return this;
		}

		public ProductBuilder isFreeShipping(boolean freeShipping) {
			this.freeShipping = freeShipping;
			return this;
		}

		public ProductBuilder setFreeShipping(boolean freeShipping) {
			this.freeShipping = freeShipping;
			return this;
		}

		
		public ProductBuilder setStock(int stock) {
			this.stock = stock;
			return this;
		}
		
		
		
		
		
		
	}
	
	
	

	
	
}
