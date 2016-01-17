package com.ympcsoft.extdesktop.controller.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ympcsoft.extdesktop.domain.sys.SysUser;
import com.ympcsoft.extdesktop.service.sys.SysUserService;

@Controller
@RequestMapping("/login")
public class LoginController{
    
    @Resource
    private SysUserService sysUserService;
    
    @RequestMapping("/login")
    public ModelAndView login(SysUser sysUserModel, HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        String userName = sysUserModel.getUserName();
        String userPwd = sysUserModel.getUserPwd();
        ModelAndView mav = null;
        
        System.out.println("----:"+userName);
        
        if (!"admin".equals(userName) || !"admin".equals(userPwd)){
            mav = new ModelAndView("/desktop/portal");
            mav.addObject("常规界面", " hello  "+userName);
            SysUser sysUser = new SysUser();
            sysUser.setUserName(sysUserModel.getUserName());
            sysUser.setUserPwd(sysUserModel.getUserPwd());
            sysUserService.addUser(sysUser);
        } else {
            mav = new ModelAndView("/desktop/desktop");
            mav.addObject("desktop界面", " hello  "+userName);
        }
        
        return mav;
    }
    
}
