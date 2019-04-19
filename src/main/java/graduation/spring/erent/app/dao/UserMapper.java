package graduation.spring.erent.app.dao;

import graduation.spring.erent.app.model.User;
import graduation.spring.erent.sys.base.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseDao<User> {
    List<User> getER (int id);
    List<User> getING (int id);
}
