package bil387project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_gen_seq")
    @SequenceGenerator(name = "order_id_gen_seq", sequenceName = "order_id_gen_seq", allocationSize = 1)
    @Column(name = "order_id")
    private int orderID;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "product_names")
    private String productNames;

    @Column(name= "total_price")
    private int price;

    @Column(name = "order_date")
    private LocalDateTime orderDate;
}
