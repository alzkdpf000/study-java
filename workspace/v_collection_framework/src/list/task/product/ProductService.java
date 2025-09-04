package list.task.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import list.task.DBConnecter;

public class ProductService {
	public void insert(Product product) {
		DBConnecter.products.add(new Product(product));
	}

//	이 방식은 하나만 수정할 때 좋을 것 같음? 아닌가 모르겠다 
	public void update(Product product) {
		for (Product p : DBConnecter.products) {
			if (p.getId() == product.getId()) {
				p.setProductPrice(product.getProductPrice());
//				p = new Product(product);
			}
		}
	}

//  수정
//  public void update(Product product) {
////     아래와 같이 indexOf를 사용하면 DB에 있는 주소와 전달받은 객체의 주소가 다르기 때문에 못찾는다.
////     그런데 eqauls와 hashCode를 재정의했기 때문에 id가 같으면, 같은 객체로 인식한다.
////     따라서 indexOf를 사용해도 된다.
//     DBConnecter.products.set(DBConnecter.products.indexOf(product), product);
//  }
	public void delete(Product product) {
		DBConnecter.products.remove(product);
	}

//	public Optional<Product> findById(Long id){
//		Product product = null;
//		for(Product p :DBConnecter.products) {
//			if(p.getId() == id) {
//				product = p;
//			}
//		}
//		return Optional.ofNullable(product);
//	}

	public Product findById(Long id) {
		Product product = null;
		for (Product p : DBConnecter.products) {
			if (p.getId() == id) {
//				product = p;
				product = new Product(p);

			}
		}
		return product;
	}

	public Product findById_Teacher(long id) {
		Product foundProduct = null;
		for (Product product : DBConnecter.products) {
			if (product.getId() == id) {
				foundProduct = product;
			}
		}
		return foundProduct;
	}

	public List<Product> findAll() {
		List<Product> posts = new ArrayList<Product>();
		for (Product p : DBConnecter.products) {
			posts.add(new Product(p));
		}
		return posts;
	}
}
