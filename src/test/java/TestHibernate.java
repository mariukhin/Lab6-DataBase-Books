import hibernate_methods.*;
import items.Edition;
import liquibase.exception.LiquibaseException;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import run.Connect;
import run.Main;
import java.sql.SQLException;

public class TestHibernate {

    @BeforeClass
    public static void onlyOnce() throws SQLException, ClassNotFoundException, LiquibaseException {
        Connect.connect();
    }

    @AfterClass
    public static void afterTest() throws SQLException, ClassNotFoundException {
        Connect.connect().close();
    }

    @Test
    public void createTablesTest() throws SQLException, LiquibaseException, ClassNotFoundException {
        Main.createTables(Main.sessionFactory);
        AuthorRunner authorRunner = new AuthorRunner(new Configuration().configure().buildSessionFactory());
        System.out.println(authorRunner.listAuthors().get(0).toString());
    }

    @Test
    public void getObjectsTest() throws SQLException, LiquibaseException, ClassNotFoundException {
        Main.createTables(new Configuration().configure().buildSessionFactory());

        AuthorRunner authorRunner = new AuthorRunner(new Configuration().configure().buildSessionFactory());
        System.out.println(authorRunner.listAuthors().get(0).toString());

        BookRunner bookRunner = new BookRunner(new Configuration().configure().buildSessionFactory());
        System.out.println(bookRunner.listBooks().get(0).toString());

        CostRunner costRunner = new CostRunner(new Configuration().configure().buildSessionFactory());
        System.out.println(costRunner.listCost().get(0).toString());

        EditionRunner editionRunner = new EditionRunner(new Configuration().configure().buildSessionFactory());
        System.out.println(editionRunner.listEditions().get(0).toString());

        ScreenAdaptationRunner screenAdaptationRunner = new ScreenAdaptationRunner(new Configuration().configure().buildSessionFactory());
        System.out.println(screenAdaptationRunner.listScreenAdaptations().get(0).toString());

    }

    @Test
    public void updateTest() throws SQLException, LiquibaseException, ClassNotFoundException {
        Main.createTables(new Configuration().configure().buildSessionFactory());

        AuthorRunner authorRunner = new AuthorRunner(new Configuration().configure().buildSessionFactory());
        authorRunner.updateAuthor(1, "Alexandre Dumas");

        BookRunner bookRunner = new BookRunner(new Configuration().configure().buildSessionFactory());
        bookRunner.updateBook(1, "The Count of Monte Cristo");

        CostRunner costRunner = new CostRunner(new Configuration().configure().buildSessionFactory());
        costRunner.updateCost(1, 150);

        EditionRunner editionRunner = new EditionRunner(new Configuration().configure().buildSessionFactory());
        editionRunner.updateEdition(1, "Фолио");

        ScreenAdaptationRunner screenAdaptationRunner = new ScreenAdaptationRunner(new Configuration().configure().buildSessionFactory());
        screenAdaptationRunner.updateScreenAdaptation(1, "Stalker");
    }

    @Test
    public void addRowTest() throws SQLException, LiquibaseException, ClassNotFoundException {
        Main.createTables(new Configuration().configure().buildSessionFactory());

        AuthorRunner authorRunner = new AuthorRunner(new Configuration().configure().buildSessionFactory());
        authorRunner.addAuthor(5, "Herbert George Wells", 79, 6 );
        authorRunner.removeAuthor(5);

        BookRunner bookRunner = new BookRunner(new Configuration().configure().buildSessionFactory());
        bookRunner.addBook(5, 2,"Osceola the Seminole, or, The Red Fawn of the Flower Land", 1858);
        bookRunner.removeBook(5);

        CostRunner costRunner = new CostRunner(new Configuration().configure().buildSessionFactory());
        costRunner.addCost(5,2,4);
        costRunner.removeCost(5);

        EditionRunner editionRunner = new EditionRunner(new Configuration().configure().buildSessionFactory());
        editionRunner.addEdition(4, 4, 4, "Эксмо",8930);
        editionRunner.removeEdition(4);

        ScreenAdaptationRunner screenAdaptationRunner = new ScreenAdaptationRunner(new Configuration().configure().buildSessionFactory());
        screenAdaptationRunner.addScreenAdaptation(4,"The Last of the Mohicans",1992,8,4);
        screenAdaptationRunner.removeScreenAdaptation(4);
    }
}
