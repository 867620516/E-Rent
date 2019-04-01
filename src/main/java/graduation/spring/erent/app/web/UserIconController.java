package graduation.spring.erent.app.web;

import graduation.spring.erent.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserIconController {
    @Autowired
    UserService userService;

    @RequestMapping("/haha")
    public String test(){
        return "haha";
    }

}
