package bil387project.business.abstracts;

import bil387project.entities.Order;

import java.util.List;

public interface OrderService {
    Order addNew(Order order);
    void deleteOrderById(Integer orderID);
    List<Order> getOrdersByUserId(Integer id);
}
