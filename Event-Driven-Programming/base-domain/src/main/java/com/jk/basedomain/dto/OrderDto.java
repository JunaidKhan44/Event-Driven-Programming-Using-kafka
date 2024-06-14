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
}
