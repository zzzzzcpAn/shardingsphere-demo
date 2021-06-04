package com.zzzzzp.learn.shardingjdbc.dao;

import java.io.Serializable;
import lombok.Data;

/**
 * t_user_order_1
 * @author 
 */
@Data
public class TUserOrder1 implements Serializable {
    private Long id;

    private Long userId;

    private Long orderId;

    private static final long serialVersionUID = 1L;
}