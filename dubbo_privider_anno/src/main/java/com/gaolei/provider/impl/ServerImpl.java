package com.gaolei.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaolei.provider.IServer;
import com.gaolei.provider.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaolei on 2017/10/7.
 */
@Component
@Service    //alibaba 注解声明dubbo服务
public class ServerImpl implements IServer {
    public String sayHello(String mes) {
        return "HELLO" + mes;
    }

    public List<User> queryUser() {
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"张3"));
        list.add(new User(3,"张4"));
        list.add(new User(4,"张5"));
        return list;
    }
}
