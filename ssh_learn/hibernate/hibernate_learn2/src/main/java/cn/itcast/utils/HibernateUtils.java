package cn.itcast.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author ME08I
 * @date 2021/8/14
 */
public class HibernateUtils {
    //静态代码块中只执行一次，所以变量也必须是静态的
    static Configuration cfg=null;
    static SessionFactory sessionFactory=null;
    //静态代码块实现
    static {
        //加载核心配置文件
        cfg=new Configuration();
        cfg.configure();
        sessionFactory=cfg.buildSessionFactory();
    }
    //提供返回sessionFactory的方法
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static void main(String[] args){

    }
}