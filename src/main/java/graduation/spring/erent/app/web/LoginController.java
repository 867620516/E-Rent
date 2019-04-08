package graduation.spring.erent.app.web;

import graduation.spring.erent.app.model.User;
import graduation.spring.erent.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;


    /**
     * 注册用户信息
     * @param user
     * @return
     */
    @PostMapping("/api/signUp")
    public User signUp(@RequestBody User user){
        //存储注册信息
        userService.save(user);
        return user;
    }

    @PostMapping("/api/signIn")
    @ResponseBody
    public User login(@RequestBody User user, HttpSession session){
        /*User tmp = new User();
        tmp.setUsername(username);
        tmp.setPassword(password);*/

        return userService.find(user);

        /*if (principal!=null){
            session.setAttribute("principal",principal);
            return "{\"status\":\"success\"}";
        }
        return "{\"status\":\"fail\"}";*/
    }
}
