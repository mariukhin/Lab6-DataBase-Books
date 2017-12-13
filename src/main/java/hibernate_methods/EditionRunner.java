package hibernate_methods;

import items.Edition;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EditionRunner {

    private static SessionFactory sessionFactory;

    public EditionRunner(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addEdition(int id, int bookId, int costId,String editionname, int numOfCopies) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
         xcvxcv
        transaction = session.beginTransaction();
        Edition edition = new Edition(id, bookId, costId, editionname, numOfCopies);
        session.save(edition);
        transaction.commit();
        session.close();
    }

    public void updateEdition(int id, String editionname) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;
        sdvsdv
        transaction = session.beginTransaction();
        Edition edition = (Edition) session.get(Edition.class, id);
        edition.setEditionname(editionname);
        session.update(edition);
        transaction.commit();
        session.close();
    }

    public void removeEdition(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Edition edition = (Edition) session.get(Edition.class, id);
        session.delete(edition);
        transaction.commit();
        session.close();
    }
    dsvsdv
    public List listEditions() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List notes = session.createQuery("FROM Edition").list();

        transaction.commit();
        session.close();
        return notes;
    }
}
