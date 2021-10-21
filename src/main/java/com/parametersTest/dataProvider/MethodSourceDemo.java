package com.parametersTest.dataProvider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

/**
 * 数据驱动
 * 参数化是数据驱动的基础
 * 参数化2种方式：测试数据参数化，测试步骤参数化
 */
public class MethodSourceDemo {

    @ParameterizedTest
    @MethodSource
    void testDataProvider(Params params) {
        System.out.println();
    }

    static List<Params> testDataProvider() {
        // 初始化YamlFactory
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        // 定义好一个类型，表明yaml文件返回的是一个列表
        TypeReference typeReference=new TypeReference<List<Params>>() {
        };
        mapper.readValue(TestYaml.class.getResourceAsStream("/test.yaml"),typeReference);
        return params;
}
