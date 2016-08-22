package com.lhx.domain;

import java.io.Serializable;

/**
 * Created by lhx on 14-12-24 上午11:11
 *
 * @project dubbo
 * @package com.lhx.domain
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description
 */
public class User implements Serializable{

    private String name ;
    private int age ;
    private String sex ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
