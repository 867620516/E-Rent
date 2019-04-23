package graduation.spring.erent.app.dao;

import graduation.spring.erent.app.model.Rental;
import graduation.spring.erent.sys.base.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentMapper extends BaseDao<Rental> {
    void insertImages(int id,String image);
    List<Rental> search(String searchName);
    List<Rental> searchMy(int id,String searchName);
}
