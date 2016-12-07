package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by doshest on 2016/9/29.
 */

@Controller
public class Test {
    @Resource
    private  ITestService service;
    @RequestMapping("/hello")
    public String greeting(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        List<User> users=this.service.selctBySize(10);
        map.addAttribute("users",users);
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "test";
    }


}
