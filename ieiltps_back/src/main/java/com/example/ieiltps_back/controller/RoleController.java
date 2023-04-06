package com.example.ieiltps_back.controller;

import com.example.ieiltps_back.bean.Role;
import com.example.ieiltps_back.bean.User;
import com.example.ieiltps_back.mapper.RoleMapper;
import com.example.ieiltps_back.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleMapper roleMapper;
    @GetMapping("/find")
    public List find(){
        List<Role> list=roleMapper.find();
        System.out.println(list);
        return list;
    }

    @PostMapping("/save")
    public String save(Role role){
        int i= roleMapper.save(role);
        if(i>0){
            return "插入成功"+i+"条数据";
        }
        else {
            return "插入失败";
        }
    }
}
