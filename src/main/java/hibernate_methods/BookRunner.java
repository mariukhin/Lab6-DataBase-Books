package hibernate_methods;

import items.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class BookRunner {

    private static SessionFactory sessionFactory;

    public BookRunner(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addBook(int id, int authorId, String bookName, int dateR) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Book book = new Book(id, authorId, bookName, dateR);
        session.save(book);
        transaction.commit();
        session.close();
    }

    public void updateBook(int id, String bookName) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Book book = (Book) session.get(Book.class, id);
        book.setName(bookName);
        session.update(book);
        transaction.commit();
        session.close();
    }

    public void removeBook(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Book book = (Book) session.get(Book.class, id);
        session.delete(book);
        transaction.commit();
        session.close();
    }

    public List listBooks() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List messages = session.createQuery("FROM Book").list();

        transaction.commit();
        session.close();
        return messages;
    }
}
