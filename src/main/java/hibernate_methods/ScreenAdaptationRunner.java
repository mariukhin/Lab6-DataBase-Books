package hibernate_methods;

import items.ScreenAdaptation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ScreenAdaptationRunner {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();;

    public ScreenAdaptationRunner(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addScreenAdaptation(int id, String screenadaptationname, int year, int mark,int bookId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        ScreenAdaptation screenAdaptation = new ScreenAdaptation(id, screenadaptationname, year, mark, bookId);
        session.save(screenAdaptation);
        transaction.commit();
        session.close();
    }

    public void updateScreenAdaptation(int id, String screenadaptationname) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        ScreenAdaptation screenAdaptation = (ScreenAdaptation) session.get(ScreenAdaptation.class, id);
        screenAdaptation.setScreenadaptationname(screenadaptationname);
        session.update(screenAdaptation);
        transaction.commit();
        session.close();
    }

    public void removeScreenAdaptation(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        ScreenAdaptation screenAdaptation = (ScreenAdaptation) session.get(ScreenAdaptation.class, id);
        session.delete(screenAdaptation);
        transaction.commit();
        session.close();
    }

    public List listScreenAdaptations() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List screenadaptations = session.createQuery("FROM ScreenAdaptation").list();

        transaction.commit();
        session.close();
        return screenadaptations;
    }
}
