package list.task.product;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		
		Product product1 = new Product(1L,"asd1",35000,20);
		Product product2 = new Product(2L,"asd2",40000,10);
		Product updateProduct3 = new Product(2L,"asd23",44000,15);
		
		ProductService productService = new ProductService();
		
		productService.insert(product1);
		productService.insert(product2);

		System.out.println(DBConnecter.products);
		productService.update(updateProduct3);
		System.out.println(DBConnecter.products);
		Product temp = productService.findById(1L);
		temp.setProductName("test입니다");
		System.out.println(DBConnecter.products);
	}
	
}
