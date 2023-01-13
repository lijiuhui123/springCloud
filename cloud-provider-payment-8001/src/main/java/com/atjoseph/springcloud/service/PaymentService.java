package com.atjoseph.springcloud.service;

import com.atjoseph.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * <p> 描述: 创建支付的业务类 </p>
 * <p> 创建时间 : 2023/1/11 17:45 </p>
 *
 * @author : Joseph
 * @version : v1.0
 */
public interface PaymentService {
    public int create(Payment payment); //写操作
    public Payment getPaymentById(@Param("id") Long id); //读操作
}
