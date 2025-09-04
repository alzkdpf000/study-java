package list.task.product;

import java.util.Objects;

public class Product {
	private Long id; // NULL검사를 할 수 있는 상황이 나온다. 기본 자료형은 0이라고 담겨서 wrapper 클래스로 설정 
	private String productName;
	private int productPrice;
	private int productStock;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Product(Product product) {
		this(product.id, product.productName, product.productPrice, product.productStock); // 이렇게 해도 상관없다.
	}
	
	public Product(Long id, String productName, int productPrice, int productStock) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productStock=" + productStock + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

}
