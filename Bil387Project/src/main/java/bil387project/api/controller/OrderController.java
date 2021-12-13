package bil387project.api.controller;

import bil387project.business.abstracts.OrderService;
import bil387project.entities.Order;
import bil387project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/addNew")
    public Order addNewOrder(@Valid @RequestBody Order order) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String tempDate = formatter.format(date);
        order.setOrderDate(LocalDateTime.parse(tempDate, formatter2));
        return this.orderService.addNew(order);
    }

    @GetMapping("/getUserOrders")
    public List<Order> getUserOrders(@Valid @RequestParam int userID){
        return this.orderService.getOrdersByUserId(userID);
    }

    @DeleteMapping("/deleteOrder")
    public void deleteOrder(@Valid @RequestParam int orderID) {
        this.orderService.deleteOrderById(orderID);
    }

}
