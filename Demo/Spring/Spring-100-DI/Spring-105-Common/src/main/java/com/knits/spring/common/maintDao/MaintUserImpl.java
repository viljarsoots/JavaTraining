package com.knits.spring.common.maintDao;

import com.knits.spring.common.maintDto.MaintUserDto;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


@Slf4j
@Repository
@Component
public class MaintUserImpl implements MaintUserDao {

    @Autowired
    @Setter
    private DataSource dataSource;


    @Override
    public MaintUserDto searchUserById(int id) {

        Connection conn = null;
        MaintUserDto found = null;

        try{

            conn =dataSource.getConnection();
            log.info("connection established");
            Statement cmd = conn.createStatement();
            String sql = "select * from user where id= " + id;

            ResultSet res = cmd.executeQuery(sql);

            if (res.next()) {

                found = new MaintUserDto();
                found.setFirstName(res.getString("firstName"));
                found.setLastName(res.getString("lastName"));
                found.setEmail(res.getString("email"));
                found.setStartDate(res.getString("startDate"));
                found.setUserRoleId(res.getInt("userRoleId"));
                found.setId(res.getInt("id"));
            }

        }

        catch (Exception e) {

            System.err.println("Impossible to connect to Database");
            e.printStackTrace();

        }
        System.out.println(found.toString());
        return  found;
    }


}
