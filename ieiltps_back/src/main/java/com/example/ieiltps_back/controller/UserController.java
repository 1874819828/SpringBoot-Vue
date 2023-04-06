package com.example.ieiltps_back.controller;

import com.example.ieiltps_back.bean.User;
import com.example.ieiltps_back.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/info")
    public String info(String name){
        return "hello,i am "+name;
    }
    @GetMapping("/find")
    public List find(){
        List<User> list=userMapper.selectList(null);
        System.out.println(list);
        return list;
    }
    @GetMapping("/findTime")
    public List findTime(){
        List<User> list=userMapper.selectList(null);
        System.out.println(list);
        return list;
    }

    @PostMapping("/save")
    public String save(User user){
        int i= userMapper.insert(user);
        if(i>0){
            return "插入成功"+i+"条数据";
        }
        else {
            return "插入失败";
        }
    }
}
