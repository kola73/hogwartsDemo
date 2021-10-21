package com.testcase;

import org.junit.jupiter.api.*;

@DisplayName("常用注解测试")
public class TestCase {
    /**
     * @BeforeAll和@AfterAll 必须静态修饰，在所有方法执行前后只执行一次
     * @Test 一个方法
     * @AfterEach和@BeforeEach 每次方法执行前都会执行一次
     * @DisplayName() 类似注解的功能
     * @RepeatedTest(5) 重复5次
     * @Disabled 不执行该方法
     * @Tags 打标签
     */
    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll再每个类中只执行一次，且是在开头执行");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("BeforeEach在每个方法执行前都会执行一次");
    }

    // junit5不需要访问修饰符
    //  @Disabled表示不执行
    @Test
    @Disabled
    @DisplayName("方法1")
    void fun1() {
        System.out.println("---fun1---");
    }

    @Test
    @DisplayName("方法2")
    @RepeatedTest(5)
    void fun2() {
        System.out.println("---fun2---");
    }

    @Test
    @Tag("tag1")
    void tagTest(){
        System.out.println("tag1");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("AfterEach在每个方法执行前都会执行一次");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll再每个类中只执行一次，且是在结尾执行");
    }
}
