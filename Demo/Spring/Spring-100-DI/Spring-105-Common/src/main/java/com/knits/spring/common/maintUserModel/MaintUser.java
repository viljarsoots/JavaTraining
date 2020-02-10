package com.knits.spring.common.maintUserModel;

import lombok.Data;

@Data
public class MaintUser {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String startDate;
    private int userRoleId;

}
