package com.testcase;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @Nested：
 * 功能类似于suite测试套件
 * 从下往上执行
 */

public class NestedTest {
    private static HashMap<String, Object> dataMap = new HashMap<String, Object>();

    @Test
    void login() {
        dataMap.put("login", "登录成功");
    }

    @Nested
    class Shopping{
        @Test
        void shopping(){
            if (null!=dataMap.get("buy")){
                System.out.println("购买成功啦！");
            }else {
                System.out.println("购买失败");
            }
        }
    }

    @Nested
    class Buy {
        @Test
        void buyTest() {
            if (dataMap.get("login").equals("登录成功")) {
                System.out.println("登录成功");
                dataMap.put("buy", "登录成功，快去购物吧！");
            } else {
                System.out.println("登录失败");
            }
        }
    }
}