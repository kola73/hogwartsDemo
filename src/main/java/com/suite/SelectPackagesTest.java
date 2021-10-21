package com.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * SelectPackages 选择需要执行的包
 */
@RunWith(JUnitPlatform.class)
@SelectPackages({"com.testCase2"})
public class SelectPackagesTest {

}
