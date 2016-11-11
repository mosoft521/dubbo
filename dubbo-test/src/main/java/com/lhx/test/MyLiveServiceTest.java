package com.lhx.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lhx on 2016/8/26 10:46
 *
 * @Description
 */
public class MyLiveServiceTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        context.start();

//        LiveService liveService = (LiveService) context.getBean("liveService");
//        long id = liveService.createLive(100000012L, 1);
//        System.out.println(id);
//
//        System.in.read();
    }
}
