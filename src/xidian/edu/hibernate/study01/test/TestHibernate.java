package xidian.edu.hibernate.study01.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;
import xidian.edu.hibernate.study01.domain.Customer;
import xidian.edu.hibernate.study01.utils.HibernateUtils;

/**
 * @Author 胡有兵
 * @Date 2017/8/1 15:40
 */
public class TestHibernate {

    @Test
    public void testGet() {
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, 95L);
        System.out.println(customer);

        transaction.commit();
        session.close();

    }


    @Test
    public void testSave() {
        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCust_name("李四");

        session.save(customer);

        transaction.commit();
        session.close();
        sf.close();

    }

}
