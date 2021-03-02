package com.zjz.dao;




import org.apache.ibatis.session.SqlSession;

import com.zjz.*;

public class UserDao {

    /*
     * 增加的方法1
     */
    public void add1()
    {
        SqlSession sqlSession = null;
        try{
            sqlSession = MysqlTest.getSqlSession();
            //事务开始（默认）

            //读取StudentMapper.xml配置文件中的sql语句，对应的sql语句由{名称空间.sql的id指定}
            int i = sqlSession.insert("studentNamespace.add1");
            System.out.println("11本次操作影响了"+i+"行数据");

            //事务提交
            sqlSession.commit();
        }catch(Exception e){
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
            throw e;
        }finally{
            MysqlTest.closeSqlSession();
        }
    }

    /*
     * 增加的方法2
     */
    public void add2(User user)
    {
        SqlSession sqlSession = null;
        try{
            sqlSession = MysqlTest.getSqlSession();
            //事务开始（默认）

            //读取StudentMapper.xml配置文件中的sql语句
            int i = sqlSession.insert("studentNamespace.add2",user);
            System.out.println("22本次操作影响了"+i+"行数据");

            //事务提交
            sqlSession.commit();
        }catch(Exception e){
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
            throw e;
        }finally{
            MysqlTest.closeSqlSession();
        }
    }

    /*
     * 增加的方法3
     * 往数据库添加记录必须要添加事务，没有事务添加不进去
     */
    public void add3(User user)
    {
        SqlSession sqlSession = null;
        try{
            sqlSession = MysqlTest.getSqlSession();
            //事务开始（默认）

            //读取UserMapper.xml配置文件中的sql语句
            int i = sqlSession.insert("studentNamespace.add3",user);
            System.out.println("33本次操作影响了"+i+"行数据");
            sqlSession.commit();
        }catch(Exception e){
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
            throw e;
        }finally{
            MysqlTest.closeSqlSession();
        }
    }

    public static void main(String[] args) {
        UserDao sd = new UserDao();
        sd.add1();
//        sd.add3(new User("2","kaiye","23","男"));
    }
}