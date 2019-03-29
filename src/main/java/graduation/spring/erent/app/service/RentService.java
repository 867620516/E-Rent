package graduation.spring.erent.app.service;

import graduation.spring.erent.app.dao.RentMapper;
import graduation.spring.erent.app.model.Rental;
import graduation.spring.erent.sys.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentService extends BaseService<Rental, RentMapper> {
    @Autowired
    protected RentMapper dao;
    public void insertImages(int id,String image){
        dao.insertImages(id,image);
    }
}
