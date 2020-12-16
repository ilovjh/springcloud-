package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.service.PaymentService;
import com.xsh.commons.entities.CommonResult;
import com.xsh.commons.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-20 11:15
 */
@RestController
@Slf4j
public class PaymentController
{
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result =paymentService.create(payment);
        log.info("结果-----------"+result);
        if(result>0){
            return new CommonResult(200,"成功",result);
        }else {
            return new CommonResult(444,"失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id){
        Payment payment =paymentService.getPayment(id);
        log.info("结果-----------"+payment);
        if(payment!=null){
            return new CommonResult(200,"成功12",payment);
        }else {
            return new CommonResult(444,"失败");
        }
    }


}
