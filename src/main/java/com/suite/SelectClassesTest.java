package com.suite;

import com.testcase.TestCase;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * @SelectClasses和@IncludeTags组合使用，在方法里选出对应的标签
 * 还有@ExcludeTag
 */
@RunWith(JUnitPlatform.class)
@SelectClasses({TestCase.class})
//@IncludeTags("tag1")
@ExcludeTags("tag1")
public class SelectClassesTest {
}
