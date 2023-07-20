package com.sample.demo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ ProductJspMvcApplicationTests.class, productTest2.class })
public class AllTests {

}
