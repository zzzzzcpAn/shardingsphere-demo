package com.zzzzzp.learn.shardingjdbc.dao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author zhouchuanpei
 * @date 2021/6/3 16:10
 * @description
 */

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TUserOrder1DaoTest {

    @Autowired
    private TUserOrder1Dao tUserOrder1Dao;

    @Test
    public void test01(){

        for (long userId = 0; userId < 10; userId++) {
            for (long orderId = 0; orderId < 10; orderId++) {
                TUserOrder1 userOrder = new TUserOrder1();
                userOrder.setUserId(userId);
                userOrder.setOrderId(orderId);
                tUserOrder1Dao.insert(userOrder);
            }

        }

//        TUserOrder1 userOrder = new TUserOrder1();
//        userOrder.setUserId(0l);
//        userOrder.setOrderId(0l);
//        tUserOrder1Dao.insert(userOrder);
    }

}
