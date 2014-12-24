package com.lhx.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lhx on 14-12-24 上午11:15
 *
 * @project dubbo
 * @package com.lhx.main
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationProvider.xml"});
        context.start();
        System.out.println("按任意键退出");
        System.in.read();
    }
}
