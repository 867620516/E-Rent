package graduation.spring.erent;

import graduation.spring.erent.app.model.Rental;
import graduation.spring.erent.app.model.User;
import graduation.spring.erent.app.service.RentService;
import graduation.spring.erent.app.service.UserService;
import graduation.spring.erent.sys.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErentApplicationTests {
    @Autowired
    private UserService userService;

    @Autowired
    private RentService rentService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void findRList(){
        Rental r = new Rental();
        List<Rental> list = rentService.findList(r);
        System.out.println(list.get(0).getItemName());
    }

    @Test
    public void findImage(){
        Rental r = new Rental();
        r.setId(1);
        r = rentService.find(r);
        List<String> imageList = r.getImageList();
        for(String image:imageList){
            System.out.println(image);
        }
    }

    @Test
    public void insertImage(){
        Rental rental = new Rental();
        rental.setId(2);
        List<String> list = new ArrayList<>();
        list.add("4.jpg");
        list.add("5.jpg");
        rental.setImageList(list);
        for(String image:list){
            rentService.insertImages(rental.getId(),image);
        }
    }


    @Test
    public void insert(){
        User user = new User("王五","123","13812341234","wangwu@qq.com",0,0,"");
        userService.save(user);
    }

    @Test
    public void find(){
        User user = new User();
        user.setUsername("李四");
        user =userService.find(user);
        System.out.println("DINAKF  "+user.getIcon());
    }

}
