package com.ympcsoft.extdesktop.service.sys;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ympcsoft.extdesktop.dao.sys.SysUserDao;
import com.ympcsoft.extdesktop.domain.sys.SysUser;

@Transactional
@Service
public class SysUserService {
    private SysUserDao sysUserDao;
    private static final Logger Log = LoggerFactory.getLogger(SysUserService.class);
    @Resource
    public void setSysUerDao(SysUserDao sysUserDao){
        this.sysUserDao = sysUserDao;
    }
    
    public void addUser(SysUser sysUser){
        
        //Log.info("开始增加");
        sysUserDao.addUser(sysUser);
        //Log.info("增加 完成");
    }

}
