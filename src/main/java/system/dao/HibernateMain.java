package system.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        User admin = new User();
        admin.setLogin("admin");
        admin.setPassword("Qwerty12");
        admin.setName("admin");
        admin.setMickname("ADmin");
        admin.setType(0);

        session.save(admin);

        session.close();
        sessionFactory.close();

    }
}
