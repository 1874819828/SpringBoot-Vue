package com.example.ieiltps_back.mapper;

import com.example.ieiltps_back.bean.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {
    @Select("select * from role")
    public List<Role> find();

    @Insert("insert into role values(#{id},#{name},#{desc})")
    public int save(Role role);
}
