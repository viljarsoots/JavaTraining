package com.knits.spring.common.maintDto;


import lombok.Data;

@Data
public class MaintUserDto {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String startDate;
    private int userRoleId;


}
