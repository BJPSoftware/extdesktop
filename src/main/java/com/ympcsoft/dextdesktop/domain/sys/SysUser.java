package com.ympcsoft.dextdesktop.domain.sys;

public class SysUser {

    private String userName;
    private String userPwd;

    public SysUser() {
        super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

}
