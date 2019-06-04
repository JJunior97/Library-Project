package OnlineLibrary.Library.Service;

import OnlineLibrary.Library.DAO.User.UserDaoImpl;
import OnlineLibrary.Library.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDaoImpl userDao;

    public User addUser(User user){
        userDao.addUser(user);
        return user;
    }

    public User findUser(long id){
        return userDao.findUserById(id);
    }

    public List<User> findAllUser(){
        return userDao.findAllUser();
    }
}
