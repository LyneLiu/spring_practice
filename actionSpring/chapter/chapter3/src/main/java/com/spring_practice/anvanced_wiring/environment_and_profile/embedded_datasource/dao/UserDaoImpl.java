package com.spring_practice.anvanced_wiring.environment_and_profile.embedded_datasource.dao;



import com.spring_practice.anvanced_wiring.environment_and_profile.embedded_datasource.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nn_liu on 2016/5/30.
 */
public class UserDaoImpl implements UserDao {

    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public User findByName(String name) {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", name);

        String sql = "SELECT * FROM users WHERE name=:name";

        User result = namedParameterJdbcTemplate.queryForObject(
                sql,
                params,
                new UserMapper());

        //new BeanPropertyRowMapper(Customer.class));

        return result;

    }

    public List<User> findAll() {

        Map<String, Object> params = new HashMap<String, Object>();

        String sql = "SELECT * FROM users";

        List<User> result = namedParameterJdbcTemplate.query(sql, params, new UserMapper());

        return result;

    }

    private static final class UserMapper implements RowMapper<User> {

        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
            return user;
        }
    }

}
