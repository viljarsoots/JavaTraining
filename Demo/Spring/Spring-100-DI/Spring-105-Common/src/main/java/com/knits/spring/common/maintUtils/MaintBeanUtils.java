package com.knits.spring.common.maintUtils;


import com.knits.spring.common.maintDto.MaintUserDto;
import com.knits.spring.common.maintUserModel.MaintUser;

public class MaintBeanUtils {

    public static MaintUser dto2Model(MaintUserDto dto){
        MaintUser user = new MaintUser();
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());
        user.setStartDate(dto.getStartDate());
        user.setUserRoleId(dto.getUserRoleId());
        return user;
    }

    public static MaintUserDto model2Dto(MaintUser model){
        MaintUserDto dto = new MaintUserDto();
        dto.setFirstName(model.getFirstName());
        dto.setLastName(model.getLastName());
        dto.setEmail(model.getEmail());
        dto.setStartDate(model.getStartDate());
        dto.setUserRoleId(model.getUserRoleId());
        return dto;
    }


}
