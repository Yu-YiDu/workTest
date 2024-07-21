package com.myProject.service;

import com.myProject.entities.Order;
import org.springframework.stereotype.Service;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}


