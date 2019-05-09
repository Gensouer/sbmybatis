package net.togogo.sbmybatis.controller;

import net.togogo.sbmybatis.bean.User;
import net.togogo.sbmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired(required = false)
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getOneUser(@PathVariable("id") Integer id){
        return userMapper.getOneUser(id);
    }
}
