package com.example.demo.contrller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 心晴_xiao
 * @company 中国工商银行股份有限公司
 * @create 2021-03-03 21:08
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/world")
    public String hello(){
        return "Hello World!";
    }
}
