package com.gaolei.provider;

import com.gaolei.provider.model.User;

import java.util.List;

/**
 * Created by gaolei on 2017/10/7.
 */
public interface IServer {

    public  String sayHello(String mes);

    public List<User> queryUser();
}
