package com.atjoseph.springcloud.service.impl;

import com.atjoseph.springcloud.dao.PaymentDao;
import com.atjoseph.springcloud.entities.Payment;
import com.atjoseph.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p> 描述: 创建支付的实现类 </p>
 * <p> 创建时间 : 2023/1/11 17:48 </p>
 *
 * @author : Joseph
 * @version : v1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource //注:这个注解是Java中自带的注解，@Autowired是Spring中的注解
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
