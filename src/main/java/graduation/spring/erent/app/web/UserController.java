package graduation.spring.erent.app.web;

import graduation.spring.erent.app.model.Follow;
import graduation.spring.erent.app.model.User;
import graduation.spring.erent.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/api/getFollowerNum")
    public List<User> getER(String id){
        return userService.getER(Integer.parseInt(id));
    }

    @RequestMapping("/api/getFollowingNum")
    public List<User> getING(String id){
        return userService.getING(Integer.parseInt(id));
    }
}
