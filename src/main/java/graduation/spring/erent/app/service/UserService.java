package graduation.spring.erent.app.service;

import graduation.spring.erent.app.dao.UserMapper;
import graduation.spring.erent.app.model.User;
import graduation.spring.erent.sys.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends BaseService<User, UserMapper> {
    @Autowired
    protected UserMapper dao;

    public List<User> getER(int id){ return  dao.getER(id);}
    public List<User> getING(int id){ return  dao.getING(id);}
    public void updateIcon(User user){dao.updateIcon(user);}

}
