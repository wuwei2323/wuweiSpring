package com.luban.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

	@Select("select user")
	String selectById(Integer id);
}
