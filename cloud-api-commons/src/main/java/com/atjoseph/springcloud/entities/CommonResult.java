package com.atjoseph.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p> 描述: 构建共通请求结果类 </p>
 * <p> 创建时间 : 2023/1/12 10:49 </p>
 *
 * @author : Joseph
 * @version : v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}


