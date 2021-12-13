package bil387project.business.concretes;

import bil387project.business.abstracts.ProductService;
import bil387project.dataAccess.ProductDao;
import bil387project.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAllProducts() {
        return this.productDao.findAll();
    }

    @Override
    public Product addNewProduct(Product product) {
        return this.productDao.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        this.productDao.deleteById(product.getProductID());
    }

    @Override
    public Product getProductById(Integer id) {
        return this.productDao.findProductByProductID(id);
    }
}
