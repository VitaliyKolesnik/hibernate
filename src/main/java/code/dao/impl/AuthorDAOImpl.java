package code.dao.impl;

import code.dao.AuthorDAO;
import code.entity.Author;
import code.entity.Book;
import org.hibernate.Session;

import java.util.Optional;

public class AuthorDAOImpl implements AuthorDAO {

    @Override
    public void create(Author author, Session session) {
        session.save(author);
    }

    @Override
    public Optional<Author> getById(int id, Session session) {
        Author author = (Author) session.get(Author.class, id);
        return Optional.ofNullable(author);
    }

    @Override
    public Optional<Author> getByBook(Book book, Session session) {
        Author author = (Author) session.get(Author.class, book.getAuthorId());
        return Optional.ofNullable(author);
    }

    @Override
    public void update(Author author, Session session) {

    }

    @Override
    public void delete(Author author, Session session) {

    }
}
