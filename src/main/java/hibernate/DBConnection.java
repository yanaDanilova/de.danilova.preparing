package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {
    public static  SessionFactory getSessionFactory(){
      SessionFactory sessionFactory = new Configuration()
              .configure("hibernate.xml")
              .buildSessionFactory();
      return sessionFactory;
    }
}
