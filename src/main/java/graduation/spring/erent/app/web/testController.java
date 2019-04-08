package graduation.spring.erent.app.web;

import graduation.spring.erent.app.model.User;
import graduation.spring.erent.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @Autowired
    UserService userService;

    @RequestMapping("/api/haha")
    @ResponseBody
    public String haha(){
        int i =0;
        return "{\"content\":\"haha\"}";
    }
}
