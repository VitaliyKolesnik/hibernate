package code.dao.impl;

import code.dao.BookDAO;
import code.entity.Author;
import code.entity.Book;
import code.persistanse.HibernateUtil;
import org.hibernate.Session;

import java.sql.*;
import java.util.Optional;

public class BookDAOImpl implements BookDAO {

    @Override
    public void create(Book book, Session session) {
        session.save(book);
    }

    @Override
    public Optional<Book> getById(int id, Session session) {
        Book book = (Book) session.get(Book.class, id);
        return Optional.ofNullable(book);
    }

    @Override
    public Optional<Book> getByAuthor(Author author, Session session) {
        return null;
    }

    @Override
    public void update(Book book, Session session) {

    }

    @Override
    public void delete(Book book, Session session) {

    }
}
