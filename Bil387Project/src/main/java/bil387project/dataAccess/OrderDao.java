package bil387project.dataAccess;

import bil387project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {
    List<Order> getOrdersByUserId(Integer id);
}
