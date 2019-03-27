package graduation.spring.erent.app.service;

import graduation.spring.erent.app.dao.UserMapper;
import graduation.spring.erent.app.model.User;
import graduation.spring.erent.sys.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User, UserMapper> {
}
