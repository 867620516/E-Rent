package graduation.spring.erent.app.web;

import graduation.spring.erent.app.model.Rental;
import graduation.spring.erent.app.model.User;
import graduation.spring.erent.app.service.RentService;
import graduation.spring.erent.app.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RentalController {
    @Autowired
    RentService rentService;
    @Autowired
    UserService userService;

    @RequestMapping("/api/rental")
    public List<Rental> findAll(){
        List<Rental> list = rentService.findList(new Rental());
        Rental r = list.get(0);
        String s = r.getItemName();
        return list;
    }

    @RequestMapping("/api/oneRental")
    public Rental findOne(String id){
        Rental rental = new Rental();
        rental.setId(Integer.parseInt(id));
        return  rentService.find(rental);
    }

    @RequestMapping("/api/userRental")
    public List<Rental> findByUser(User user){
        User user1 = userService.find(user);
        Rental rental = new Rental();
        rental.setUserID(user1.getId());
        List<Rental> list = rentService.findList(rental);
        return list;
    }

    @PostMapping("/api/newRental")
    public String add(@RequestBody Rental rental){
        rentService.save(rental);
        return "{\"msg\":\"发布租赁成功\",\"edit\":\"修改商品信息成功\"}";
    }

    @RequestMapping("/api/search")
    public List<Rental> search(String searchName){
        List<Rental> list = rentService.search(searchName);
        return list;
    }

    @RequestMapping("/api/searchMy")
    public List<Rental> searchMy(@Param("id") String id,@Param("searchName") String searchName){
        List<Rental> list = rentService.searchMy(Integer.parseInt(id),searchName);
        return list;
    }
}
