package com.ympcsoft.extdesktop.domain.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//注解，说明这是实体类
@Entity    
@Table(name = "SysUser")
public class SysUser {
    
    //定义字段
    //主键字段，统一叫id
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    //字段自增长
    @Column(name = "id")
    private Long id;
    
    //用户名，32长度，不能为空
    @Column(name="USER_NAME", length=32, nullable = false)
    private String  userName;
    
    //用户密码，32长度，不能为空
    @Column(name="USER_PWD", length=32, nullable=false)
    private String userPwd;
   
    //用户姓名，32长度，不能为空
    @Column(name="USER_CH", length=32, nullable=true)
    private String userCh;   
    //构造函数
    public SysUser() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getUserCh() {
        return userCh;
    }

    public void setUserCh(String userCh) {
        this.userCh = userCh;
    }
}
