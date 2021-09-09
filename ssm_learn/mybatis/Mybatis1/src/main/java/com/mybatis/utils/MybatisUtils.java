package com.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sun.misc.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ME08I
 * @date 2021/9/5
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        return sqlSession;
        /**此方法也可以这样写
         * return sqlSessionFactory.openSession();
         * */
    }
}
