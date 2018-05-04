package com.example.control;

import com.example.util.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/3.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://www.baidu.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @RequestMapping("/helloerror")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }

    @RequestMapping("/jsonerror")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
