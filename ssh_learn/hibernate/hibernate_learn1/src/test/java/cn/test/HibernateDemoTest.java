package cn.test;

import cn.itcast.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @author ME08I
 * @date 2021/8/13
 */
public class HibernateDemoTest {
    @Test
    public void testAdd() {
//        第一步：加载hibernate核心配置文件
        //到src下找到hibernate.cfg.xml文件
        //hibernate中封装的对象
        Configuration cfg = new Configuration();
        cfg.configure();
//        第二步：创建SessionFactory对象
        //读取hibernate的核心配置文件
        //在过程中，根据映射关系，在配置的数据库中创建表
        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        第三步：使用SessionFactory对象创建session对象（与Http中的session没有任何关系）
        Session session = sessionFactory.openSession();
//        第四步：开启事务（事物是操作过程中最基本的单元）
        Transaction transaction = session.beginTransaction();
//        第五步：具体操作逻辑，crud操作（除这一步有变化，其余步骤都是固定操作）
        //添加功能
        User user = new User();
        user.setId(201413);
        user.setUsername("YZl");
        user.setPassword("240341");
        //调用session中的方法来实现添加
        session.save(user);
//        第六步：提交事物
        transaction.commit();
//        第七步：关闭资源
        session.close();
        sessionFactory.close();
    }
}
