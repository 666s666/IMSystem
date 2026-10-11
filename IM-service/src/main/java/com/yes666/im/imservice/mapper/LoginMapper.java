package com.yes666.im.imservice.mapper;
import com.yes666.im.DTO.LoginDTO;
import org.apache.ibatis.annotations.*;
@Mapper
public interface LoginMapper {
    @Insert("insert into  users(ink_id, name, pwd_hash, avatar_t, avatar_c, created_at) values (#{inkId},#{name},'0',null,null,'0')")
    public void save(LoginDTO loginDTO) ;

}
