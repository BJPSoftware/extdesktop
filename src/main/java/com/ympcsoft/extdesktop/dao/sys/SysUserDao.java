package com.ympcsoft.extdesktop.dao.sys;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ympcsoft.extdesktop.domain.sys.SysUser;

/**
 * 此处分层来讲应该是SysUserDao接口，然后实现，现在学习的需要，直接访问SessoinFactory
 * */
@Repository
public class SysUserDao{
    
    //注解来源
    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;
    
    //保存用户
    public void addUser(SysUser sysUser) {
            //获取Session
            Session session  = sessionFactory.getCurrentSession();
            
            //持久到数据库
            session.persist(sysUser);
    }
}
