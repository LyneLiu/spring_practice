package com.spring_practice.anvanced_wiring.environment_and_profile.embedded_datasource.dao;


import com.spring_practice.anvanced_wiring.environment_and_profile.embedded_datasource.model.User;

import java.util.List;

/**
 * Created by nn_liu on 2016/5/30.
 */
public interface UserDao {

    User findByName(String name);

    List<User> findAll();

}
