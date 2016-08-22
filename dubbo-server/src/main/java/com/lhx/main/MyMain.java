package com.lhx.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lifeix on 14-11-19.
 * http://dubbo.io/Download-zh.htm
 */
public class MyMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationProvider.xml" });

        context.start();
        System.out.println("按任意键退出");
        System.in.read();

    }
}
