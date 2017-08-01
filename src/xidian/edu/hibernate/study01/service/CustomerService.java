package xidian.edu.hibernate.study01.service;

import xidian.edu.hibernate.study01.dao.CustomerDao;
import xidian.edu.hibernate.study01.domain.Customer;

/**
 * @Author 胡有兵
 * @Date 2017/8/1 16:55
 */
public class CustomerService {
    public void saveCustomer(Customer customer) {
        new CustomerDao().saveCustomer(customer);
    }
}
