package com.hrio;

import com.hrio.service.UserService;
import com.hrio.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层，Dao层不需要接触！
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
