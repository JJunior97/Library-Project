package OnlineLibrary.Library.DAO.Book;

import OnlineLibrary.Library.Domain.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository("BookDao")
@Transactional
public class BookDaoImpl implements BookDao {

    private static final String DELETE_BOOK_BY_ID = "DELETE FROM Book b WHERE b.id = :id";
    private static final String FIND_BOOK_BY_ID = "SELECT b FROM Book b WHERE b.id = :id";
    private static final String FIND_BOOK_BY_TITLE = "SELECT b FROM Book b WHERE b.title = :title";
    private static final String FIND_ALL_BOOKS = "SELECT b FROM Book b";

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void addBook(Book book) {
        entityManager.persist(book);
    }

    @Override
    public void deleteBookById(long id) {
        Query query = entityManager.createQuery(DELETE_BOOK_BY_ID);
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public Book findBookById(long id) {
        TypedQuery<Book> query = entityManager.createQuery(FIND_BOOK_BY_ID, Book.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public Book findBookByTitle(String title) {
        TypedQuery<Book> query = entityManager.createQuery(FIND_BOOK_BY_TITLE, Book.class);
        query.setParameter("title", title);
        return query.getSingleResult();
    }

    @Override
    public List<Book> findAllBooks() {
        TypedQuery<Book> query = entityManager.createQuery(FIND_ALL_BOOKS, Book.class);
        return query.getResultList();
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        TypedQuery<Book> query = entityManager.createQuery(FIND_ALL_BOOKS, Book.class);
        return query.getResultList();
    }
}
