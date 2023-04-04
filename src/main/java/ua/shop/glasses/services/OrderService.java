package ua.shop.glasses.services;

import org.springframework.stereotype.Service;
import ua.shop.glasses.models.Order;
import ua.shop.glasses.repos.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    //Provides main operations with DataBase, table 'order', using JPA.
    //CRUD methods

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addOrder(Order order){
        // Adding new order
        orderRepository.save(order);
        return order;
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrder(Long id){
        return orderRepository.findOrderById(id);
    }

    public Order updateOrder(Order orderForUpdate){
        //Updating old order
        return orderRepository.save(orderForUpdate);
    }

    public Order updateOrder(Long old_id,
                             String fullName,
                             String mobilePhone,
                             String city,
                             String mail,
                             String mailAddress,
                             String email,
                             List<Integer> products,
                             int price){
        //Updating old order

        Order order = orderRepository.findOrderById(old_id);
        order.setCity(city);
        order.setEmail(email);
        order.setMail(mail);
        order.setFullName(fullName);
        order.setMailAddress(mailAddress);
        order.setMobilePhone(mobilePhone);
        order.setPrice(price);
        order.setProducts(products);
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id){
        //Delete order from DB
        orderRepository.deleteById(id);
    }
}
