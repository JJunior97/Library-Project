package OnlineLibrary.Library.DAO.User;


import OnlineLibrary.Library.Domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository("UserDao")
@Transactional
public class UserDaoImpl implements UserDao {

    private static final String DELETE_USER_BY_ID = "DELETE FROM User u WHERE u.id = :id";
    private static final String FIND_USER_BY_ID = "SELECT u FROM User u WHERE u.id = :id";
    private static final String FIND_ALL_USER = "SELECT u FROM User u";

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUserById(long id) {
        Query query = entityManager.createQuery(DELETE_USER_BY_ID);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public User findUserById(long id) {
        TypedQuery<User> query = entityManager.createQuery(FIND_USER_BY_ID, User.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<User> findAllUser() {
        TypedQuery<User> query = entityManager.createQuery(FIND_ALL_USER, User.class);
        return query.getResultList();
    }
}
