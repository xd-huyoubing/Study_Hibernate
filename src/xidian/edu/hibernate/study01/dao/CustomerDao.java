package xidian.edu.hibernate.study01.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import xidian.edu.hibernate.study01.domain.Customer;
import xidian.edu.hibernate.study01.utils.HibernateUtils;

/**
 * @Author 胡有兵
 * @Date 2017/8/1 16:57
 */
public class CustomerDao {
    public void saveCustomer(Customer customer) {
        Session session = HibernateUtils.getSession();

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
}
