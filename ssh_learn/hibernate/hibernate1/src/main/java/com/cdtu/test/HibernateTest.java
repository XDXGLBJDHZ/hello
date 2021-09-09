package com.cdtu.test;

import com.cdtu.bean.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author ME08I
 * @date 2021/8/30
 */
public class HibernateTest {
    @Test
    public void saveMethodTest(){
        Configuration configuration=new Configuration();
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product=new Product("Java程序设计","12345678",19,20);
        session.save(product);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
