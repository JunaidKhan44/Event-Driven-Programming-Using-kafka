package com.jk.basedomain.dto;

/**
 * @author Junaid.Khan
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {

    private String message;
    private String status;
    private  OrderDto order;

}
