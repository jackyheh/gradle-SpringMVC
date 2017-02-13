package cn.heh;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heh on 2017/2/12.
 */
@RestController
public class DemoRestController {

    @RequestMapping("test/{name}")
    @ResponseBody
    public Message test(@PathVariable String name) {
        Message message = new Message();
        message.setName(name);
        message.setText("hello " + name);
        return message;
    }
}