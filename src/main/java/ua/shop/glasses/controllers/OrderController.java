package ua.shop.glasses.controllers;

import org.springframework.web.bind.annotation.*;
import ua.shop.glasses.models.Order;
import ua.shop.glasses.services.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    //########################## ORDER CRUD ################################

    @GetMapping()
    public List<Order> getOrders(){
        //Get All Orders
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id){
        //Get order by id
        return orderService.getOrder(id);
    }

    @PostMapping("/addOrder")
    public String addOrder(@RequestBody Order order){

        orderService.addOrder(order);
        return "redirect:/";
    }

    @PutMapping("/updateOrder")
    public String updateOrder(@RequestBody Order order){

        orderService.updateOrder(order);
        return "redirect:/";
    }

    @DeleteMapping("/deleteOrder")
    public String deleteOrder(@RequestParam("id") Long id){

        orderService.deleteOrder(id);
        return "redirect:/";
    }
}
