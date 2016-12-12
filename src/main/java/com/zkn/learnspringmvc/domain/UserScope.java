package com.zkn.learnspringmvc.domain;

import java.io.Serializable;

/**
 * Created by zkn on 2016/9/7.
 */
public class UserScope implements Serializable{

    /**
     * 姓名
     */
    private String userName;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 地址
     */
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserScope{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", passWord='" + passWord + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
