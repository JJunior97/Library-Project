package OnlineLibrary.Library.DAO.User;

import OnlineLibrary.Library.Domain.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void deleteUserById(long id);

    User findUserById(long id);

    List<User> findAllUser();
}
