package OnlineLibrary.Library.RestApi;

import OnlineLibrary.Library.Domain.Book;
import OnlineLibrary.Library.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("{id}")
    public Book getBook(long id){
        return bookService.findBookById(id);
    }
}
