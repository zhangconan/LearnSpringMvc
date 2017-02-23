package com.zkn.learnspringmvc.dao.impl;

import com.zkn.learnspringmvc.dao.AbstractDao;
import com.zkn.learnspringmvc.dao.UserDAO;
import com.zkn.learnspringmvc.domain.UserScope;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zkn on 2016/9/7.
 */

@Repository("userDao")
public class UserDAOImpl extends AbstractDao implements UserDAO {

    @Override
    public void addUser(UserScope userScope) {
        this.getSqlSession().insert("userMapper.addUser",userScope);
    }

    @Override
    public void updateUser(UserScope userScope) {
        this.getSqlSession().update("userMapper.updateUser",userScope);
    }

    @Override
    public void deleteUser(Integer id) {
        this.getSqlSession().update("userMapper.deleteUser",id);
    }

    @Override
    public void addUserBatch(List<UserScope> list) {

        this.getSqlSession().insert("userMapper.addUserBatch",list);
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Override
    public int addUserSelectKey(UserScope userScope){

        UserScope userScope1 = this.getSqlSession().selectOne("userMapper.getId",20);

        this.getSqlSession().insert("userMapper.insertSelectKey",userScope);
        System.out.println(userScope);
        return userScope.getId().intValue();
    }
}
