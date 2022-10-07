package classDemo;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Laptop");
		product1.setDescription("Asus");
		product1.setPrice(4599.99);
		
		Product product2 = new Product();
		product2.setName("Laptop");
		product2.setDescription("Huawei");
		product2.setPrice(5699.99);
		
		Product[] products = new Product[] {product1,product2};
		
		for (Product p1 : products) {
			System.out.println(p1.getName());
			System.out.println(p1.getDescription());
			System.out.println(p1.getPrice());
		}
		
	}

}
