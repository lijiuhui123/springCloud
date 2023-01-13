package com.atjoseph.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p> 描述: 构建支付实体类 </p>
 * <p> 创建时间 : 2023/1/12 10:47 </p>
 *
 * @author : Joseph
 * @version : v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}