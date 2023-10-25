package com.jk.orderservice.controller;


/**
 * @author Junaid.Khan
 */


import com.jk.basedomain.dto.OrderDto;
import com.jk.basedomain.dto.OrderEvent;
import com.jk.orderservice.kafka.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class OrderController{

    private OrderProducer orderProducer;
    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

//    @RequestBody  convert json object into java project
    @PostMapping("/orders")
    public String placeOrder(@RequestBody OrderDto order){

        order.setOrderId(UUID.randomUUID().toString());
        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setStatus("PENDING");
        orderEvent.setMessage("order status is in pending state");
        orderEvent.setOrder(order);

        orderProducer.sendMessage(orderEvent);

        return "Order placed successfully...!";

    }
}