package cn.itcast.hibernatetest;

import cn.itcast.entity.User;
import cn.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * 验证hibernate一级缓存存在
 *
 * @author ME08I
 * @date 2021/8/17
 */
public class HibernateDemo2 {
    @Test
    public void testCache() {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //根据id=1进行查询
        //执行第一个get方法是否查询数据库，是否会发送sql语句
        User user = session.get(User.class, 4);
        System.out.println(user);
        //再根据id=1进行查询
        //执行第二个get方法是否查询数据库，是否会发送sql语句
        User user2 = session.get(User.class, 4);
        System.out.println(user2);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
