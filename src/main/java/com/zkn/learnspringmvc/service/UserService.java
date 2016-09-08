package com.zkn.learnspringmvc.service;

import com.zkn.learnspringmvc.domain.UserScope;

/**
 * zkn
 */
public interface UserService {

    /**
     * 新增用户信息
     * @param userScope
     */
    void addUser(UserScope userScope);

    /**
     * 修改用户信息
     * @param userScope
     */
    void updateUser(UserScope userScope);

    /**
     * 删除用户信息
     * @param  id
     */
    void deleteUser(Integer id);
}
