package com.atjoseph.springcloud.controller;

import com.atjoseph.springcloud.entities.CommonResult;
import com.atjoseph.springcloud.entities.Payment;
import com.atjoseph.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p> 描述: 创建支付的控制器类 </p>
 * <p> 创建时间 : 2023/1/11 17:56 </p>
 *
 * @author : Joseph
 * @version : v1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果: " + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据成功！", result);
        } else {
            return new CommonResult(444,"插入数据失败！", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果: " + payment + "\t" + "O(∩_∩)O哈哈aaa");

        if (payment != null) {
            return new CommonResult(200, "查询成功！", payment);
        } else {
            return new CommonResult(444,"没有对应记录，对应Id为:" + id, null);
        }
    }
}
