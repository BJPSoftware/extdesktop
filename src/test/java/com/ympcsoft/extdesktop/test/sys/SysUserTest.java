package com.ympcsoft.extdesktop.test.sys;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ympcsoft.extdesktop.dao.sys.SysUserDao;
import com.ympcsoft.extdesktop.domain.sys.SysUser;
import com.ympcsoft.extdesktop.service.sys.SysUserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring.xml" })
public class SysUserTest {
    @Resource
    private SysUserDao sysUserDao;

    @Resource
    private SysUserService sysUserService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public final void testSave() {
        // System.out.println("sysUserService:::" + sysUserService);
        SysUser sysUser = new SysUser();
        sysUser.setUserName("admin");
        sysUser.setUserPwd("123456");
        sysUser.setUserCh("王晓红");
        sysUserService.addUser(sysUser);
    }
}
