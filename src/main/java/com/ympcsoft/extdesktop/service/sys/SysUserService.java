package com.ympcsoft.extdesktop.service.sys;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ympcsoft.extdesktop.dao.sys.*;
import com.ympcsoft.extdesktop.domain.sys.*;

@Transactional
@Service
public class SysUserService {
    private SysUserDao sysUserDao;
    
    @Resource
    public void setSysUerDao(SysUserDao sysUserDao){
        this.sysUserDao = sysUserDao;
    }
    
    public void addUser(SysUser sysUser){
        
        sysUserDao.addUser(sysUser);
    }

}
