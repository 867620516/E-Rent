package graduation.spring.erent.app.web;

import graduation.spring.erent.app.model.User;
import graduation.spring.erent.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/hasregined")
    public String  hasReged(@RequestBody User user){
        /*User user = new User();
        user.setUsername(username);*/
        if(userService.find(user)==null){
            return "{\"has\":\"false\",\"statusText\":\"OK\"}";
        }
        return "{\"has\":\"true\",\"statusText\":\"用户名已注册\"}";
    }


    /**
     * 注册用户信息
     * @param user
     * @return
     */
    @RequestMapping("/api/regin")
    public User signUp(@RequestBody User user){
        //存储注册信息
        userService.save(user);

        return userService.find(user);
    }

    @PostMapping("/api/login")
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
