package code;

import code.dao.AuthorDAO;
import code.dao.BookDAO;
import code.dao.impl.AuthorDAOImpl;
import code.dao.impl.BookDAOImpl;
import code.entity.Author;
import code.entity.Book;
import code.persistanse.HibernateUtil;
import org.hibernate.Session;

import java.util.Optional;
import java.util.function.Consumer;

public class App {
    public static void main( String[] args ) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        AuthorDAO authorDAO = new AuthorDAOImpl();
        authorDAO.create(new Author("Rex Stout"), session);

        BookDAO bookDAO = new BookDAOImpl();

        bookDAO.create(new Book("White Fang", 1), session);
        session.getTransaction().commit();
        session.close();

//        System.out.println(bookDAO.getByAuthor((Author) authorDAO.getById(1)));

//        bookDAO.getById(1).ifPresent(System.out::println);
//        bookDAO.getByAuthor("Isaac Asimov").ifPresent(System.out::println);
//        bookDAO.delete(book);
//        book.setAuthor("John Doe");
//        bookDAO.update(book);
//        System.out.println(bookDAO.getByAuthor("John Doe"));
    }
}
