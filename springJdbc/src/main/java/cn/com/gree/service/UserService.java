package cn.com.gree.service;

import cn.com.gree.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Users> getList(){
        String sql = "select id,name,age from users";
        return (List<Users>) jdbcTemplate.query(sql, new RowMapper<Users>() {
            @Override
              public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
                   Users users = new Users();
                   users.setId(rs.getInt("id"));
                   users.setName(rs.getString("name"));
                   users.setAge(rs.getInt("age"));
                   return users;
            }
        });
        }
    }

