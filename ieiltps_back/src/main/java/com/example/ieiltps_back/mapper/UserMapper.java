package com.example.ieiltps_back.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ieiltps_back.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Select("select * from user")
//    public List<User> find();
//
//    @Insert("insert into user values(#{id},#{create_time},#{update_time},#{account},#{password},#{imgurl},#{nickname},#{phone},#{email},#{role_id})")
//    public int save(User user);
}
