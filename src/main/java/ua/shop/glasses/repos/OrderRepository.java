package ua.shop.glasses.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.shop.glasses.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    public Order findOrderById(Long Id);
}
