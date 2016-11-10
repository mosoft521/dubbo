package com.lhx.test;

import com.lifeix.exception.service.L99IllegalDataException;
import com.lifeix.live.service.live.FollowService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lhx on 2016/8/26 10:46
 *
 * @Description
 */
public class MyFollowServiceTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        context.start();

        FollowService followService = (FollowService) context.getBean("followService");
        boolean flag = false;
        try {
            flag = followService.concern(7L,7L,true);
        } catch (L99IllegalDataException e) {
            e.printStackTrace();
        }
        System.out.println(flag);

        System.in.read();
    }
}
