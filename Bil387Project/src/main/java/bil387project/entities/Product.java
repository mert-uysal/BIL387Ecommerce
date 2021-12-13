package bil387project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_gen_seq")
    @SequenceGenerator(name = "product_id_gen_seq", sequenceName = "product_id_gen_seq", allocationSize = 1)
    @Column(name = "product_id")
    private int productID;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private int productPrice;

    @Column(name = "product_instock")
    private int productInStock;

    @Column(name = "product_image")
    private String productImage;
}
