package com.lhx.main;

import com.lhx.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Created by lhx on 14-12-24 上午11:20
 *
 * @project dubbo
 * @package com.lhx.main
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService2"); //
        String hello = demoService.sayHello("tom"); // ִ
        System.out.println(hello); //

        List list = demoService.getUsers();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
        System.in.read();
    }
}
