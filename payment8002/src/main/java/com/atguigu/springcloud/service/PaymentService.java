package com.atguigu.springcloud.service;

import com.xsh.commons.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @auther zzyy
 * @create 2020-02-20 11:11
 */
@Service
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);

}
