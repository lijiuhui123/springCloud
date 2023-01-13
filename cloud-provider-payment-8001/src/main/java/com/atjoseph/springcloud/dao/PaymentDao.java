package com.atjoseph.springcloud.dao;

import com.atjoseph.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p> 描述: 创建支付dao类 </p>
 * <p> 创建时间 : 2023/1/11 17:21 </p>
 *
 * @author : Joseph
 * @version : v1.0
 */
@Mapper //注:在这里一般使用@Mapper注解，有的地方使用@Repository注解可能会导致插入有问题
public interface PaymentDao {
    public int create(Payment payment); //写操作
    public Payment getPaymentById(@Param("id") Long id); //读操作
}
