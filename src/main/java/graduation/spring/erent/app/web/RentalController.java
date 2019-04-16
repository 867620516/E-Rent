package graduation.spring.erent.app.web;

import graduation.spring.erent.app.model.Rental;
import graduation.spring.erent.app.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RentalController {
    @Autowired
    RentService rentService;

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
}
