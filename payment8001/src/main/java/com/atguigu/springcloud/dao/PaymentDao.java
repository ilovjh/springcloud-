package com.atguigu.springcloud.dao;

import com.xsh.commons.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhangzhihua
 * @date 2020/12/16 11:04
 */
@Mapper
public interface PaymentDao{
    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);
}
