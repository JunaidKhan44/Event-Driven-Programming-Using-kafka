package com.jk.basedomain.dto;

/**
 * @author Junaid.Khan
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private String orderId;
    private String name;
    private int qty;
    private double price;

   /* public OrderDto() {

    }

    public OrderDto(String orderId, String name, int qty, double price) {
        this.orderId = orderId;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }



    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDto orderDto = (OrderDto) o;
        return qty == orderDto.qty && Double.compare(price, orderDto.price) == 0 && Objects.equals(orderId, orderDto.orderId) && Objects.equals(name, orderDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, name, qty, price);
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderId='" + orderId + '\'' +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }
*/
}
