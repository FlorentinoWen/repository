package cn.gov.gxdlr.portialdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Florentino
 * @version 2017/12/6 0006
 * @mail mosquito.ix@qq.com
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }
}
