package code.dao;

import code.entity.Author;
import code.entity.Book;
import org.hibernate.Session;

import java.util.Optional;

public interface BookDAO {

    void create(Book book, Session session);

    Optional<Book> getById(int id, Session session);

    Optional<Book> getByAuthor(Author author, Session session);

    void update(Book book, Session session);

    void delete(Book book, Session session);
}
