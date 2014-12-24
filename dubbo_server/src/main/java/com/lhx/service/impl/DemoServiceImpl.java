package com.lhx.service.impl;

import com.lhx.domain.User;
import com.lhx.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lhx on 14-12-24 上午11:09
 *
 * @project dubbo
 * @package com.lhx.service.impl
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description 在服务提供方实现接口：(对服务消费方隐藏实现)
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public List getUsers() {
        List list = new ArrayList();
        User u1 = new User();
        u1.setName("jack");
        u1.setAge(20);
        u1.setSex("男");

        User u2 = new User();
        u2.setName("tom");
        u2.setAge(21);
        u2.setSex("女");

        User u3 = new User();
        u3.setName("rose");
        u3.setAge(19);
        u3.setSex("女");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}
