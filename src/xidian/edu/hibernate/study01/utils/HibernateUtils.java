package xidian.edu.hibernate.study01.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Author 胡有兵
 * @Date 2017/8/1 16:04
 */
public class HibernateUtils {
    private static final Configuration config;
    private static final SessionFactory sessionFactory;

    static {
        config = new Configuration().configure();
        sessionFactory = config.buildSessionFactory();
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

}
