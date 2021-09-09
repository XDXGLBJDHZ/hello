package cn.itcast.hibernatetest;

import cn.itcast.entity.User;
import cn.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author ME08I
 * @date 2021/8/14
 */

public class HibernateDemo1 {

    @Test
    public void testGet() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //第一个参数实体类，第二参数是需要查询的id值
        User user = session.get(User.class, 1);
        System.out.println(user);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void testUpdate() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, 1);
        //向返回的user对象里面设置修改之后的值
        user.setUsername("kickback");
        //执行过程先到user对象中找到id,然后在根据id进行修改
        session.update(user);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void testDelete() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //先查询出数据，在再进行删除
        User user = session.get(User.class, 1);
        session.delete(user);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
    /**
     * 使用saveOrUpdate方法进行添加或修改
     * */
    @Test
    public void testSaveOrUpdate() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //实体类对象瞬时态时做添加操作，托管态时做修改操作
        User user=session.get(User.class,5);
        user.setUsername("h");
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
