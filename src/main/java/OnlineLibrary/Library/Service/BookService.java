package OnlineLibrary.Library.Service;

import OnlineLibrary.Library.DAO.Book.BookDaoImpl;
import OnlineLibrary.Library.Domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookDaoImpl bookDao;

    public Book findBookById(long id){
        return bookDao.findBookById(id);
    }

    public Book findBookByTitle(String title){
        return bookDao.findBookByTitle(title);
    }

    public List<Book> findBookByAuthor(String author){
        return bookDao.findBooksByAuthor(author);
    }

    public List<Book> findAllBooks(){
        return bookDao.findAllBooks();
    }
}
