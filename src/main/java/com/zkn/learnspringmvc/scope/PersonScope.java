package com.zkn.learnspringmvc.scope;

import java.io.Serializable;
import java.util.Date;

/**
 * Person对象
 * @author zkn
 *
 */

public class PersonScope implements Serializable{

	/**
	 * 序列
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 家庭地址
	 */
	private String address;

	private StudentScope studentScope;
	/**
	 * 出生日期
	 */
	private Date birthDay;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonDomain [name=" + name + ", age=" + age + "]";
	}

	public StudentScope getStudentScope() {
		return studentScope;
	}

	public void setStudentScope(StudentScope studentScope) {
		this.studentScope = studentScope;
	}

	public String getAddress() {
		return address;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
