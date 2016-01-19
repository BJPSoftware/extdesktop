package com.ympcsoft.extdesktop.domain.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//注解，说明这是实体类
@Entity    
@Table(name = "SysUser")
public class SysUser {
    
    //定义字段
    //主键字段，统一叫id
    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)    //字段自增长
    @GenericGenerator(name = "uuid", strategy = "uuid") 
    @GeneratedValue(generator = "uuid")
    @Column(name = "USER_ID")
    //private Long id;
    private String userId;
    
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
