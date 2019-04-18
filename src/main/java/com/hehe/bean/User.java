package com.hehe.bean;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;
import java.util.Date;



public class User{
    /**
     * 用户标识符
     */
    private int id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话号码
     */
    private String telephone;
    /**
     * 注册时间
     */
    private Date registerTime;
    /**
     * 权限（0：管理员；1：普通用户）
     */
    private int popedom;

    public User(){}
    public User(int id, String username, String password, String telephone, Date registerTime, int popedom) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.registerTime = registerTime;
        this.popedom = popedom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public int getPopedom() {
        return popedom;
    }

    public void setPopedom(int popedom) {
        this.popedom = popedom;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", registerTime=" + registerTime +
                ", popedom=" + popedom +
                '}';
    }
}
