package com.parametersTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

/**
 * 参数化类型
 *
 * @ValueSource 最简单的用例，支持string，int的类型
 * @EnumSource 基于枚举类，如果枚举类有4种类型，会生成4个case
 * @MethodSource 基于方法的返回值，测试中用的比较多
 * @CsvSource 基于csv，硬编码在函数上下文里面
 * @CsvFileSource 基于csv，通过文件从外部读取
 * @ArgumentsSource 读特定参数
 * @NullSource 支持参数为null
 * @EmptySource 支持参数为空
 */
public class ParameterDemo {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @NullSource
    @EmptySource
    void testValueSource(int intValue) {
        System.out.println(intValue);
    }


    // 方法参数化
    @ParameterizedTest
    // 后面加上方法名
    @MethodSource("strs")
    void testMethodSourceWithMethodName(String params) {
        System.out.println(params);
    }

    // 用到的方法(必须是静态方法）
    static Stream<String> strs() {
        return Stream.of("apple", "banana");
    }

    @ParameterizedTest
    // 也可以不加方法名，会默认去查找同名方法再调用
    @MethodSource()
    void testMethodSource(String params) {
        System.out.println(params);
    }

    // 用到的方法(必须是静态方法）
    static Stream<String> testMethodSource() {
        return Stream.of("apple", "banana");
    }

    // 也支持多个参数
    @ParameterizedTest
    @MethodSource()
    void multiParams(int id, String name) {
        System.out.println(id + "-" + name);
    }

    static Stream<Arguments> multiParams() {
        return Stream.of(
                Arguments.arguments(1, "可乐"),
                Arguments.arguments(2, "雪碧")
        );
    }

    // CSV参数化
    @ParameterizedTest
    @CsvSource({"1,可乐", "2,雪碧"})
    void testCsvSource(int id, String name) {
        System.out.println(id + "--" + name);
    }


    //csv文件参数化
    @ParameterizedTest
    @CsvFileSource(resources = "/params.csv",numLinesToSkip = 0)
    void csvFileSourceTest(int id, String name){
        System.out.println(id + "--" + name);
    }
}
