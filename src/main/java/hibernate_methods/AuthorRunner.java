package hibernate_methods;

import items.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class AuthorRunner {

    private static SessionFactory sessionFactory;

    public AuthorRunner(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addAuthor(int id, String authorname, int numofBooks, int series) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Author author = new Author(id, authorname, numofBooks, series);
        session.save(author);
        transaction.commit();
        session.close();
    }

    public void updateAuthor(int id, String name) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Author author = (Author) session.get(Author.class, id);
        author.setName(name);
        session.update(author);
        transaction.commit();
        session.close();
    }

    public void removeAuthor(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Author author = (Author) session.get(Author.class, id);
        session.delete(author);
        transaction.commit();
        session.close();
    }

    public List listAuthors() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List chats = session.createQuery("FROM Author").list();

        transaction.commit();
        session.close();
        return chats;
    }
}
