package com.knits.spring.common.maintService;

import com.knits.spring.common.maintDao.MaintUserDao;
import com.knits.spring.common.maintDto.MaintUserDto;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Data
@Component
public class MyService implements MyServiceInterface {



    @Autowired
    private MaintUserDao maintUserDao;

    @Override
    public MaintUserDto findUsersByID(int id) {
        log.info("Search Users by ID {} ",id);
        MaintUserDto maintUsersDb = maintUserDao.searchUserById(id);

        return maintUsersDb;
    }
}
