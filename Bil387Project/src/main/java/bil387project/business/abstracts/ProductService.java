package bil387project.business.abstracts;

import bil387project.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product addNewProduct(Product product);
    void deleteProduct(Product product);
    Product getProductById(Integer id);
}
