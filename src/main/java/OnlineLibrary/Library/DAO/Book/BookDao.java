package OnlineLibrary.Library.DAO.Book;

import OnlineLibrary.Library.Domain.Book;

import java.util.List;

public interface BookDao {

    void addBook(Book book);

    void deleteBookById(long id);

    Book findBookById(long id);

    Book findBookByTitle(String title);

    List<Book> findBooksByAuthor(String author);

    List<Book> findAllBooks();
}
