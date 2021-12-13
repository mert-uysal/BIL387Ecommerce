package bil387project.api.controller;

import bil387project.business.abstracts.ProductService;
import bil387project.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        return this.productService.getAllProducts();
    }

    @PostMapping("/addNew")
    public Product addNewProduct(@Valid Product product){
        return this.productService.addNewProduct(product);
    }

    @GetMapping("/getById")
    public Product getProductById(@Valid @RequestParam int productID) {
        return this.productService.getProductById(productID);
    }
}
