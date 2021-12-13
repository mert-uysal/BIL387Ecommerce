package bil387project.business.concretes;

import bil387project.business.abstracts.OrderService;
import bil387project.dataAccess.OrderDao;
import bil387project.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderManager implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public Order addNew(Order order) {
        return this.orderDao.save(order);
    }

    @Override
    public void deleteOrderById(Integer orderID) {
        this.orderDao.deleteById(orderID);
    }

    @Override
    public List<Order> getOrdersByUserId(Integer id) {
        return this.orderDao.getOrdersByUserId(id);
    }
}
