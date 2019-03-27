package graduation.spring.erent;

import graduation.spring.erent.app.model.User;
import graduation.spring.erent.app.service.UserService;
import graduation.spring.erent.sys.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErentApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void insert(){
        User user = new User("李四","123","18712341234","lisi@qq.com",0,0);
        userService.save(user);
    }

    @Test
    public void find(){
        User user = new User();
        user.setUsername("李四");
        user =userService.find(user);
        System.out.println(user.getEmail());
    }

}
