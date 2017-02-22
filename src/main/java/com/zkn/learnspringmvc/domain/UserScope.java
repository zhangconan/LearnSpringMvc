package com.zkn.learnspringmvc.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zkn on 2016/9/7.
 */
public class UserScope implements Serializable{

    private static final long serialVersionUID = -2910288813933923034L;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 地址
     */
    private String address;
    /**
     * 类别
     */
    private String category;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 编程语言
     */
    private String programLanguage;
    /**
     * 创建时间
     */
    private Date createDate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public UserScope() {
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    public UserScope(String userName, String address, String category, Integer age, String programLanguage) {
        this.userName = userName;
        this.address = address;
        this.category = category;
        this.age = age;
        this.programLanguage = programLanguage;
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
