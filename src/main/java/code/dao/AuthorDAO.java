package code.dao;

import code.entity.Author;
import code.entity.Book;
import org.hibernate.Session;

import java.util.Optional;

public interface AuthorDAO {

    void create(Author author, Session session);

    Object getById(int id, Session session);

    Optional<Author> getByBook(Book book, Session session);

    void update(Author author, Session session);

    void delete(Author author, Session session);
}
