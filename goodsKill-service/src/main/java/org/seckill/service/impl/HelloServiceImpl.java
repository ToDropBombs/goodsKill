package org.seckill.service.impl;

import org.seckill.service.HelloService;

/**
 * Created by heng on 2017/4/25.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public void sayHello() {
        System.out.println("hello,heng!");
    }
}
