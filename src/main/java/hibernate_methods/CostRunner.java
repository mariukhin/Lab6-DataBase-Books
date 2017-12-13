package hibernate_methods;

import items.Cost;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CostRunner {

    private static SessionFactory sessionFactory;

    public CostRunner(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addCost(int id, int editionId, int num, int high) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Cost cost = new Cost(id, editionId, num, high);
        session.save(cost);
        transaction.commit();
        session.close();
    }

    public void updateCost(int id, int num) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Cost cost = (Cost) session.get(Cost.class, id);
        cost.setNum(num);
        session.update(cost);
        transaction.commit();
        session.close();
    }

    public void removeCost(int id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Cost cost = (Cost) session.get(Cost.class, id);
        session.delete(cost);
        transaction.commit();
        session.close();
    }
    public List listCost() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List news = session.createQuery("FROM Cost").list();

        transaction.commit();
        session.close();
        return news;
    }
}
