package com.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * @IncludePackages需要和@SelectPackages搭配使用
 * @IncludePackages是在@SelectPackages的基础上再做一层筛选
 * ps:一定要注意，包下的类名一定要Test开头或者结尾，否则就不执行了！！！
 */
@RunWith(JUnitPlatform.class)
@SelectPackages({"com.testCase2"})
@IncludePackages({"com.testCase2.demo1"})
public class IncludePackagesTest {
}
