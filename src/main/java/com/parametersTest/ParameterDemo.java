package com.parametersTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

/**
 * 参数化类型
 *
 * @ValueSource 最简单的用例，支持string，int的类型
 * @EnumSource 基于枚举类，如果枚举类有4种类型，会生成4个case
 * @MethodSource 基于方法的返回值，测试中用的比较多
 * @CsvSource 基于csv，硬编码
 * @CsvFileSource 基于csv，通过文件从外部读取
 * @ArgumentsSource 读特定参数
 */
public class ParameterDemo {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testValueSource(int intValue) {
        System.out.println(intValue);
    }

}
