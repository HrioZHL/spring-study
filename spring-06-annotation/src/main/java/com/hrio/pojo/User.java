package com.hrio.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // 等价于<bean id="user" class="com.hrio.pojo.User"/>
@Scope("singleton")
public class User {

    // 相当于<property name="name" value="Hrio"/>
    //@Value("Hrio")
    public String name;

    @Value("Hrio")
    public void setName(String name) {
        this.name = name;
    }
}
