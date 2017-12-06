package cn.gov.gxdlr.portialdemo;

import cn.gov.gxdlr.portialdemo.controller.HelloWorldController;

import static org.junit.Assert.assertEquals;

/**
 * @author Florentino
 * @version 2017/12/6 0006
 * @mail mosquito.ix@qq.com
 */
public class HelloWorldControllerTest {
    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }
}
