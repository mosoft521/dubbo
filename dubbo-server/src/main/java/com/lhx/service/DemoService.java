package com.lhx.service;

import java.util.List;

/**
 * Created by lhx on 14-12-24 上午11:08
 *
 * @project dubbo
 * @package com.lhx.service
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description 该接口需单独打包，在服务提供方和消费方共享
 */
public interface DemoService {

    String sayHello(String name);

    public List getUsers();
}
