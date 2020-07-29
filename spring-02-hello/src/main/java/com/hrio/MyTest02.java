package com.hrio;

import com.hrio.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象都在Spring中管理，使用时直接从Spring中取
        Hello hello = (Hello) context.getBean("Hello");
        System.out.println(hello.toString());
    }
}
