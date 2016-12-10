package com.zkn.learnspringmvc.dao;

import com.zkn.learnspringmvc.domain.UserScope;

import java.util.List;

/**
 * zkn
 */

public interface UserDAO {

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

    void addUserBatch(List<UserScope> list);

    int addUserSelectKey(UserScope userScope);
}
