package com.chenge.mysrtp.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(String username, String password, int type);
    int updateType(String username, int type);
    int updatePassword(String username, String password);
}
